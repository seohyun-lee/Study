#include <ti/devices/msp432p4xx/inc/msp.h>
#include <ti/devices/msp432p4xx/driverlib/driverlib.h>
#include <ti/grlib/grlib.h>
#include "LcdDriver/Crystalfontz128x128_ST7735.h"
#include <stdio.h>
#include "LcdDriver/msp432p4111_classic.h"

/*
 * Main function
 */
void main(void)
{
    /* Graphic library context */
    Graphics_Context g_sContext;

    /* ADC results buffer */
    uint16_t resultsBuffer[2];

    /* Initializes display */
    Crystalfontz128x128_Init();

    /* Set default screen orientation */
    Crystalfontz128x128_SetOrientation(LCD_ORIENTATION_UP);

    /* Initializes graphics context */
    Graphics_initContext(&g_sContext, &g_sCrystalfontz128x128, &g_sCrystalfontz128x128_funcs);
    Graphics_setForegroundColor(&g_sContext, GRAPHICS_COLOR_RED);
    Graphics_setBackgroundColor(&g_sContext, GRAPHICS_COLOR_WHITE);
    GrContextFontSet(&g_sContext, &g_sFontFixed6x8);
    Graphics_clearDisplay(&g_sContext);

    /* Configures Pin 6.0 and 4.4 as ADC input */
    MAP_GPIO_setAsPeripheralModuleFunctionInputPin(GPIO_PORT_P6, GPIO_PIN0, GPIO_TERTIARY_MODULE_FUNCTION);
    MAP_GPIO_setAsPeripheralModuleFunctionInputPin(GPIO_PORT_P4, GPIO_PIN4, GPIO_TERTIARY_MODULE_FUNCTION);

    /* Initializing ADC (ADCOSC/64/8) */
    MAP_ADC14_enableModule();
    MAP_ADC14_initModule(ADC_CLOCKSOURCE_ADCOSC, ADC_PREDIVIDER_64, ADC_DIVIDER_8, 0);

    /* Configuring ADC Memory (ADC_MEM0 - ADC_MEM1 (A15, A9)  with repeat)
         * with internal 2.5v reference */
    MAP_ADC14_configureMultiSequenceMode(ADC_MEM0, ADC_MEM1, true);
    MAP_ADC14_configureConversionMemory(ADC_MEM0,
            ADC_VREFPOS_AVCC_VREFNEG_VSS,
            ADC_INPUT_A15, ADC_NONDIFFERENTIAL_INPUTS);

    MAP_ADC14_configureConversionMemory(ADC_MEM1,
            ADC_VREFPOS_AVCC_VREFNEG_VSS,
            ADC_INPUT_A9, ADC_NONDIFFERENTIAL_INPUTS);

    /* Setting up the sample timer to automatically step through the sequence
     * convert.
     */
    MAP_ADC14_enableSampleTimer(ADC_AUTOMATIC_ITERATION);

    /* Triggering the start of the sample */
    MAP_ADC14_enableConversion();
    MAP_ADC14_toggleConversionTrigger();

    int x = -1;
    int y = -1;
    while(1)
    {
        if (ADC14_getResult(ADC_MEM0) < 2200)
            resultsBuffer[0] = 0;
        else if (ADC14_getResult(ADC_MEM0) > 14200)
            resultsBuffer[0] = 121;
        else resultsBuffer[0] = (ADC14_getResult(ADC_MEM0) - 2200) / 100;

        if (ADC14_getResult(ADC_MEM1) < 2200)
            resultsBuffer[1] = 119;
        else if (ADC14_getResult(ADC_MEM1) > 14200)
            resultsBuffer[1] = 0;
        else resultsBuffer[1] = (14200 - ADC14_getResult(ADC_MEM1)) / 100;

        if (x != resultsBuffer[0] | y != resultsBuffer[1]) {
            Graphics_drawString(&g_sContext, (int8_t *)" ", 1, x, y, OPAQUE_TEXT);
            x = resultsBuffer[0];
            y = resultsBuffer[1];
            Graphics_drawString(&g_sContext, (int8_t *)"*", 1, x, y, OPAQUE_TEXT);
        }
    }
}

/*
        char string[10];
        sprintf(string, "X: %5d", resultsBuffer[0]);
                Graphics_drawStringCentered(&g_sContext,
                                                (int8_t *)string,
                                                8,
                                                64,
                                                50,
                                                OPAQUE_TEXT);

                sprintf(string, "Y: %5d", resultsBuffer[1]);
                Graphics_drawStringCentered(&g_sContext,
                                                (int8_t *)string,
                                                8,
                                                64,
                                                70,
                                                OPAQUE_TEXT);
                                                */
