#include "msp.h"

#define BS_INIT 1
#define BS_DOWN 2
#define BS_UP 3
#define S1BUT ((P1->IN & (1<<1)) == 0x00) //P1.1이 LOW 즉 눌려진 경우에 true이다. 그렇지 않으면 false.
#define S2BUT ((P1->IN & (1<<4)) == 0x00) //P1.4가 LOW 즉 스위치가 눌려진 경우에 true이다. 그렇지 않으면 false.
/**
 * main.c
 */
void main(void)
{
	WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;		// stop watchdog timer

    int s1but_bs = BS_INIT;
    int s2but_bs = BS_INIT;
    int p2_pos = 0;

	P1->DIR &= ~(1<<1 | 1<<4);
	P1->DIR |= 1<<0;
    P2->DIR |= 1<<2 | 1<<1 | 1<<0;
	P1->REN = 1<<1 | 1<<4;
	P1->OUT = 1<<1 | 1<<4;
    P2->OUT = 1<<0;

	while (1) {
	    if (S1BUT) {
            P1->OUT |= 1<<0;
	        s1but_bs = BS_DOWN;
	    } else {
	        if (s1but_bs == BS_DOWN) {
                P1->OUT &= ~(1<<0);
	            if (p2_pos > 0) p2_pos--;
	            else p2_pos = 2;
	            P2->OUT = 1<<p2_pos;
	            s1but_bs = BS_UP;
	        }
	    }
	    if (S2BUT) {
            P1->OUT |= 1<<0;
	        s2but_bs = BS_DOWN;
	    } else {
	        if (s2but_bs == BS_DOWN) {
                P1->OUT &= ~(1<<0);
	            if (p2_pos < 2) p2_pos++;
	            else p2_pos = 0;
	            P2->OUT = 1<<p2_pos;
	            s2but_bs = BS_UP;
	        }
	    }
	}
}
