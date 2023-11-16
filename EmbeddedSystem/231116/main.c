#include "msp.h"


/**
 * main.c
 */
void PORT1_IRQHandler(void)
{
    if(P1->IFG & BIT1){
        if (P2->OUT & BIT0)
            P2->OUT = BIT1;
        else if (P2->OUT & BIT1)
            P2->OUT = BIT2;
        else
            P2->OUT = BIT0;
        P1->IFG &= ~BIT1;
    }
    if(P1->IFG & BIT4){
        if (P2->OUT & BIT0)
            P2->OUT = BIT2;
        else if (P2->OUT & BIT1)
            P2->OUT = BIT0;
        else
            P2->OUT = BIT1;
        P1->IFG &= ~BIT4;
    }
}

void main(void)
{
	WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;		// stop watchdog timer

	P1->DIR = ~(uint8_t)(BIT1 | BIT4);
	P1->REN = BIT1 | BIT4;
    P1->OUT = BIT1 | BIT4;

	P1->IES = BIT1 | BIT4; //high-to-low, when push button
	P1->IFG = 0; //clear interrupt
	P1->IE = BIT1 | BIT4; //Enable interrupt for P1.1, P1.4

	NVIC->ISER[1] = 1 << ((PORT1_IRQn) & 31); //Enable Port 1 interrupt on the NVIC

	P2->DIR = BIT0 | BIT1 | BIT2;
	P2->OUT = BIT0;// initial: RED

	while(1){}
}
