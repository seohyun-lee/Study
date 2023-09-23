#include "msp.h"


/**
 * main.c
 */
void main(void)
{
	WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;		// stop watchdog timer

	volatile unsigned char *gpio_p1dir, *gpio_p1out;
    volatile unsigned char *gpio_p2dir, *gpio_p2out;
	int i;
    int change=1;
	gpio_p1dir = (unsigned char *)(0x40004C04);
    gpio_p1out = (unsigned char *)(0x40004C02);
    gpio_p2dir = (unsigned char *)(0x40004C05);
    gpio_p2out = (unsigned char *)(0x40004C03);
    *gpio_p1dir = 0x01;
    *gpio_p2dir = 0x07;

    while(1)
    {
        if (change == 1)
            *gpio_p2out = 0x01;
        else if (change == 2)
            *gpio_p2out = 0x02;
        else
            *gpio_p2out = 0x04;
        change = (change + 1) % 3;
        *gpio_p1out = 0x01;
        for(i=0; i<100000; i++);
        *gpio_p1out = 0x00;
        *gpio_p2out = 0x00;
        for(i=0; i<100000; i++);
    }
}
