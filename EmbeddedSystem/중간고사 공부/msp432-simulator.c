#include <stdio.h>

#define BS_INIT 1
#define BS_DOWN 2
#define BS_UP 3

typedef struct port{
    int DIR;
    int REN;
    int IN;
    int OUT;
} Port;

void initPort (Port *P){
    P->DIR = 0;
    P->REN = 0;
    P->IN = 0;
    P->OUT = 0;
}

int main () {
    Port *P1, *P2;
    initPort(P1); initPort(P2);

    P1->DIR &= ~(1<<1|1<<4);
    P2->DIR |= 1<<0|1<<1|1<<2;
    P1->REN = 1<<1|1<<4;
    P1->OUT = 1<<1|1<<4;
    P2->OUT = 2;
    
    int i;
    int time = 100000;
    int s1but_bs = 0;
    int s2but_bs = 0;
    
    while(1)
    {
        if ((P1->IN & (1<<1))==0x00) {
            s1but_bs = BS_DOWN;
        } else {
            if (s1but_bs == BS_DOWN) {
                if(time < 100000*8) time*=2;
                s1but_bs=BS_UP;
            }
        }
        if ((P1->IN & (1<<4))==0x00) {
            s2but_bs = BS_DOWN;
        } else {
            if (s2but_bs == BS_DOWN) {
                if(time > 100000/8) time/=2;
                s2but_bs=BS_UP;
            }
        }
        if (time == 100000) printf("1\n");
        else if (time < 100000) printf("0\n");
        else printf("2\n");
        //ㄴ변수를 따로 만들까 하다가 그냥 안 만듬
        for(i=0; i<time; i++);
        P2->OUT = 0;
        for(i=0; i<time; i++);
    }
}