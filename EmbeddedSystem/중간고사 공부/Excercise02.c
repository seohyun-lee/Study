#include "msp.h"

void main(void){
    WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;

    P1->DIR |= BIT0;    //0번째 비트를 출력 모드로(1)
    P1->OUT = BIT0;     //0번째 비트를 출력하기(불 켜기)

    int maxTime = 100000;
    while(1) {
        int i;
        for(i = 0; i < maxTime; i++) {
            P1->OUT = 0;
        }
        for(i = 0; i < maxTime; i++) {
            P1->OUT = 1;
        }
        if(maxTime > 5000) {
            maxTime = maxTime - 2500;
        } //2500보다 작아지면 더 작아지지 않고 멈춤
    }
}
