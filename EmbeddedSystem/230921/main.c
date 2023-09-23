#include "msp.h"


/**
 * main.c
 */
void main(void)
{
	WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;		// stop watchdog timer

	P1->DIR |= BIT0;
	P1->OUT = BIT0;

	int i;
    int j = 100000;
	while(1) {
	    P1->OUT = 1;
	    for(i = 1; i <= j; i++) {
	    }
	    P1->OUT = 0;
	    for(i = 1; i <= j; i++) {
        }
	    j /= 1.1;

	    if(j < 10000)
	        j = 10000;
	}

	return 0;
}
