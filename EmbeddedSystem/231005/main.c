#include "msp.h"


/**
 * main.c
 */
void main(void)
{
	WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;		// stop watchdog timer
	P2->DIR |= 7;
	int i = 0;
	int cnt = 0;
	while(1)
	{
        if (cnt == 0)
            P2->OUT = 2;
        else if (cnt == 1)
            P2->OUT = 6;
        else if (cnt == 2)
            P2->OUT = 4;
        else if (cnt == 3)
	        P2->OUT = 5;
        else if (cnt == 4)
            P2->OUT = 1;
        else if (cnt == 5)
            P2->OUT = 3;
        else
            P2->OUT = 7;
        for(i = 0; i<100000; i++);
        cnt = (cnt + 1) % 7;
	}
}
