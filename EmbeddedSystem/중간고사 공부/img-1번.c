#include "msp.h"

//문제 1. P1.0 이전의 2배 속도로 깜빡임, 더 이상 빠르게 깜빡일 수 없으면 다시 1로
void main(void)
{
    int i;
    int time = 100000;
    P1->DIR |= BIT0;
    
    while(1)
    {
        P1->OUT=1;
        for(i=0; i<time; i++);
        P1->OUT=0;
        for(i=0; i<time; i++);
        time/=2;
        if (time<1) time=100000;
    }
}