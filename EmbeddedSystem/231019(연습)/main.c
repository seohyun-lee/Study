#include "msp.h"

#define BS_INIT 1
#define BS_DOWN 2
#define BS_UP 3

#define S1BUT ((P1->IN&(1<<1))==0x00)
#define S2BUT ((P1->IN&(1<<4))==0x00)

void main(void){
    int s1but_bs=BS_INIT;
    int s2but_bs=BS_INIT;
    int p2_pos=0;

    P1->DIR &= ~(1<<1|1<<4);
    P1->DIR |= 1<<0;
    P2->DIR |= 0x07;
    P1->REN = 1<<1|1<<4;
    P1->OUT = 1<<1|1<<4;
    P2->OUT = 1<<0;

    while(1){
        if(S1BUT){
            P1->OUT |= 1<<0;
            s1but_bs=BS_DOWN;
        } else {
            if(s1but_bs==BS_DOWN){
                P1->OUT &= ~(1<<0);
                if(p2_pos>0) p2_pos--;
                else p2_pos=2;
                P2->OUT=1<<p2_pos;
                s1but_bs=BS_UP;
            }
        }
        if(S2BUT){
            P1->OUT |= 1<<0;
            s2but_bs=BS_DOWN;
        } else {
            if(s2but_bs==BS_DOWN){
                P1->OUT &= ~(1<<0);
                if(p2_pos<2) p2_pos++;
                else p2_pos=0;
                P2->OUT=1<<p2_pos;
                s2but_bs=BS_UP;
            }
        }
    }
}

/*
#include "msp.h"

void main(void){
    volatile unsigned char *gpio_p1dir, *gpio_p1out;
    volatile unsigned char *gpio_p2dir, *gpio_p2out;
    int i;
    int change=1;
    gpio_p1dir = (unsigned char *)(0x40004c04);
    gpio_p1out = (unsigned char *)(0x40004c02);
    gpio_p2dir = (unsigned char *)(0x40004c05);
    gpio_p2out = (unsigned char *)(0x40004c03);
    *gpio_p1dir=0x01;
    *gpio_p2dir=0x07;

    while(1){
        if(change==1) *gpio_p2out=0x01;
        else if (change==2) *gpio_p2out=0x02;
        else *gpio_p2out = 0x04;
        change=(change+1)%3;
        *gpio_p1out=0x01;
        for(i=0; i<100000; i++);
        *gpio_p1out = 0x00;
        *gpio_p2out = 0x00;
        for(i=0; i<100000; i++);
    }
}*/
/*
#include "msp.h"

void main(void){
    P2->DIR |= 7;
    int i;
    int cnt=0;
    while(1){
        if(cnt==0) P2->OUT=2;
        if(cnt==1) P2->OUT=6;
        if(cnt==2) P2->OUT=4;
        if(cnt==3) P2->OUT=5;
        if(cnt==4) P2->OUT=1;
        if(cnt==5) P2->OUT=3;
        if(cnt==6) P2->OUT=7;
        for(i=0;i<100000;i++);
        cnt=(cnt+1)%7;
    }
}
 */

/*
#include "msp.h"

void main(void){
    WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;     // stop watchdog timer

    P1->DIR |= BIT0;
    P1->OUT = BIT0;
    int i;
    int j=100000;
    while(1){
        P1->OUT = BIT0;
        for(i=0;i<j;i++);
        P1->OUT = 0;
        for(i=0;i<j;i++);
        if(j>10000)
            j/=1.1;
    }
}
 */

/*
#include "msp.h"

#define S1BUT ((P1->IN&(1<<1))==0x00)
#define S2BUT ((P1->IN&(1<<4))==0x00)

void main(void)
{
    WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;     // stop watchdog timer

    P1->DIR &= ~(1<<1|1<<4);
    P1->DIR |= 1<<0;
    P2->DIR |= 1<<0;
    P1->REN = 1<<1|1<<4;
    P1->OUT = 1<<1|1<<4;

    int i=0;
    int p1_time;
    int p2_time;
    int step=0;
    int check=0;

    while(1){
        if (S1BUT)
            p1_time=4;
        else
            p1_time=2;
        if (p1_time==4) {
            if (i<200000)
                P1->OUT |= 1<<0;
            else
                P1->OUT &= ~(1<<0);
            if(i==399999) i=0;
        }
        else {
            if (i<100000)
                P1->OUT |= 1<<0;
            else
                P1->OUT &= ~(1<<0);
            if(i==199999) i=0;
        }//고민을 정지한다...
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

    }
}

 */
