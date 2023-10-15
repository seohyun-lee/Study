#include "msp.h"
#define S1BUT ((P1->IN & (1<<1)) == 0x00)
#define S2BUT ((P1->IN & (1<<4)) == 0x00)
#define BS_INIT 1
#define BS_UP 2
#define BS_DOWN 3

//문제2. P1.0은 S1 눌렀다 떼어질때마다 깜빡이는 상태와 깜빡이지 않는 상태 번갈아가며 수행
//P2.{012}는 S2 눌렀다 떼어질때마다 빨->초, 초->파, 파->빨 로테이션
void main(void)
{
    //WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD; // stop watchdog timer
    int s1but_bs = BS_INIT;
    int s2but_bs = BS_INIT;
    int b1_mode = 1; //깜빡인단뜻
    int b2_pos = 1;
    int i;

    P1->DIR |= 1<<0;
    P1->DIR &= ~(1<<1|1<<4); //1, 4번 PIN 입력모드
    P2->DIR |= 1<<0|1<<1|1<<2;
    P1->REN = 1<<1|1<<4;
    P1->OUT = 1<<0|1<<1|1<<4; //1로 해야 PULL-UP
    P2->OUT = 1<<0; //빨간색으로 시작
    
    while(1) {
        if (S1BUT){
            s1but_bs=BS_DOWN;
        } else {
            if(s1but_bs == BS_DOWN) {
                s1but_bs=BS_UP;
                b1_mode = 1 - b1_mode;
            }
        }
        if (b1_mode == 0) {
            P1->OUT |= 1<<0;
        } else {
            P1->OUT |= 1<<0;
            for(i=0; i<100000; i++);
            P1->OUT &= ~(1<<0);
            for(i=0; i<100000; i++);
        }
        
        if (S2BUT){
            s2but_bs=BS_DOWN;
        } else {
            if(s2but_bs == BS_DOWN) {
                s2but_bs=BS_UP;
                if(b2_pos < 4) b2_pos*=2;
                else b2_pos = 1;
                P2->OUT = b2_pos;
                //P2->OUT = 1<<b2_pos;
            }
        }
    }
}