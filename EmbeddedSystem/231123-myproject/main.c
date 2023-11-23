#include <ti/devices/msp432p4xx/inc/msp.h>
#include <ti/devices/msp432p4xx/driverlib/driverlib.h>
#include <ti/grlib/grlib.h>
#include "LcdDriver/Crystalfontz128x128_ST7735.h"
#include "LcdDriver/msp432p4111_classic.h"

/* Graphic library context */
Graphics_Context g_sContext;

/*
 * Main function
 */

#define INIT -1
#define DOWN 0
#define UP 1
#define TH 10000

void main(void)
{
    int x=10, y=8;
    int bs1state=INIT;
    int bs1count=0;
    int bs2state=INIT;
    int bs2count=0;

    /* Graphic library context */
    Graphics_Context g_sContext;

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
    Graphics_drawString(&g_sContext,
                                    (int8_t *)"LeeSeohyun",
                                    AUTO_STRING_LENGTH,
                                    34,
                                    4,
                                    OPAQUE_TEXT);

    /* Configuring S1 & S2 buttons in boostxl-edumkii */
    P3->DIR &= ~BIT5;
    P5->DIR &= ~BIT1;
    P3->REN |= BIT5;
    P5->REN |= BIT1;
    P3->OUT |= BIT5;
    P5->OUT |= BIT1;

    Graphics_drawString(&g_sContext, (int8_t *)"*", 1, x*6, y*7, OPAQUE_TEXT);

    while(1)
    {
        if (!(P5->IN & BIT1)) {
            if ((++bs1count) == TH) {
                bs1count=0;
                Graphics_drawString(&g_sContext, (int8_t *)" ", 1, x*6, y*7, OPAQUE_TEXT);
                if (y>2) y--;
                Graphics_drawString(&g_sContext, (int8_t *)"*", 1, x*6, y*7, OPAQUE_TEXT);
            }
            bs1state=DOWN;
        }
        else if (P5->IN & BIT1){
            if (bs1state == DOWN) {
                bs1count=0;
               Graphics_drawString(&g_sContext, (int8_t *)" ", 1, x*6, y*7, OPAQUE_TEXT);
               if (y>2) y--;
               Graphics_drawString(&g_sContext, (int8_t *)"*", 1, x*6, y*7, OPAQUE_TEXT);
               bs1state=UP;
            }
        }

        if (!(P3->IN & BIT5)) {
            if ((++bs2count) == TH) {
                bs2count=0;
                Graphics_drawString(&g_sContext, (int8_t *)" ", 1, x*6, y*7, OPAQUE_TEXT);
                if (y<17) y++;
                Graphics_drawString(&g_sContext, (int8_t *)"*", 1, x*6, y*7, OPAQUE_TEXT);
            }
            bs2state=DOWN;
        }
        else if (P3->IN & BIT5){
            if (bs2state == DOWN) {
                bs2count=0;
                Graphics_drawString(&g_sContext, (int8_t *)" ", 1, x*6, y*7, OPAQUE_TEXT);
                if (y<17) y++;
                Graphics_drawString(&g_sContext, (int8_t *)"*", 1, x*6, y*7, OPAQUE_TEXT);
                bs2state=UP;
            }
        }
    }
}
