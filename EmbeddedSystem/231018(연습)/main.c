#include "msp.h"

#define S1BUT ((P1->IN&(1<<1))==0x00)
#define S2BUT ((P1->IN&(1<<4))==0x00)
/**
 * main.c
 */
void main(void)
{
	WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;		// stop watchdog timer

	P1->DIR &= ~(1<<1|1<<4);
    P1->DIR |= 1<<0;
	P2->DIR |= 1<<0;
	P1->REN = 1<<1|1<<4;
	P1->OUT = 1<<1|1<<4;

    int i;
    int p1_time;
    int p2_time;
    int step=0;
    int check=0;
	while(1){

	    if (S1BUT){
	        if (step < 4){
	            P1->OUT |= 1<<0;
	        }
	        else{
	            P1->OUT &= ~(1<<0);
	        }
	    } else {
	        if (step % 4 < 2){
                P1->OUT |= 1<<0;
            }
	        else{
                P1->OUT &= ~(1<<0);
            }
	    }
	    if (S2BUT){
	        if(step % 2 == 0)
	            P2->OUT |= 1<<0;
	        else
	            P2->OUT &= ~(1<<0);
	    } else {
	        if (step % 4 < 2)
	            P2->OUT |= 1<<0;
	        else
	            P2->OUT &= ~(1<<0);
	    }
	    for(i=0;i<50000;i++);
	    step = (step + 1) % 8;

	    /*
        if(S1BUT) p1_time=4;
        else p1_time=2;
        if(S2BUT) p2_time=1;
        else p2_time=2;

        //1
        P1->OUT |= 1<<0;
        P2->OUT |= 1<<0;
        for(i=0;i<50000;i++);

        //2
        if(p2_time==1) P2->OUT &= ~(1<<0);
        for(i=0;i<50000;i++);

        //3
        if(p1_time==2) P1->OUT &= ~(1<<0);
        if(p2_time==2) P2->OUT &= ~(1<<0);
        if(p2_time==1) P2->OUT |= 1<<0;
        for(i=0;i<50000;i++);

        //4
        if(p2_time==1) P2->OUT &= ~(1<<0);
        for(i=0;i<50000;i++);

        if(S1BUT) p1_time=4;
        else p1_time=2;
        if(S2BUT) p2_time=1;
        else p2_time=2;

        //5
        if(p1_time==4) P1->OUT &= ~(1<<0);
        if(p1_time==2) P1->OUT |= 1<<0;
        P2->OUT |= 1<<0;
        for(i=0;i<50000;i++);

        //6
        if(p2_time==1) P2->OUT &= ~(1<<0);
        for(i=0;i<50000;i++);

        //7
        if(p1_time==2) P1->OUT &= ~(1<<0);
        if(p2_time==2) P2->OUT &= ~(1<<0);
        if(p2_time==1) P2->OUT |= 1<<0;
        for(i=0;i<50000;i++);

        //8
        if(p2_time==1) P2->OUT &= ~(1<<0);
        for(i=0;i<50000;i++);*/
	}
}
