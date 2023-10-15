#include "msp.h"

//2. P2에서 S2버튼 누르면 이전의 2배, 최대 8배까지 빨라김
//      S1버튼 누르면 이전의 1/2배, 최소 1/8까지 느려짐
//      초기 속도보다 빠르면 빨간색, 초기 속도는 초록색, 초기속도보다 느리면 파란색
#define S1BUT ((P1->IN & (1<<1))==0x00)
#define S2BUT ((P1->IN & (1<<4))==0x00)
#define BS_INIT 1
#define BS_DOWN 2
#define BS_UP 3

void main(void)
{
    int i;
    int time = 100000;
    int s1but_bs = BS_INIT;
    int s2but_bs = BS_INIT;
    
    P1->DIR &= ~(1<<1|1<<4);
    P2->DIR |= 1<<0|1<<1|1<<2;
    P1->REN = 1<<1|1<<4;
    P1->OUT = 1<<1|1<<4;
    
    while(1)
    {
        if (S1BUT) {
            s1but_bs = BS_DOWN;
        } else {
            if (s1but_bs == BS_DOWN) {
                if (time < 800000) time*=2;
                s1but_bs=BS_UP;
            }
        }
        if (S2BUT) {
            s2but_bs = BS_DOWN;
        } else {
            if (s2but_bs == BS_DOWN) {
                if (time > 12500) time/=2;
                s2but_bs=BS_UP;
            }
        }
        if (time == 100000) P2->OUT = 1<<1;
        else if (time < 100000) P2->OUT = 1<<0;
        else P2->OUT = 1<<2;
        for(i=0; i<time; i++);
        P2->OUT = 0;
        for(i=0; i<time; i++);
    }
}