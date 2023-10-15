#include "msp.h"

//1. P1.0 이전의 1/2배 속도로 깜빡임, 1/8배로 깜빡이면 다시 원래속도
void main(void)
{
    int i;
    int time = 100000;
    P1->DIR |= 1<<0;
    
    while(1)
    {
        P1->OUT=1;
        for(i=0; i<time; i++);
        P1->OUT=0;
        for(i=0; i<time; i++);
        time*=2;
        if (time==100000*8*2) time=100000;
    }
}
