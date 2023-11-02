#include "msp.h"


/**
 * main.c
 */
void SysTick_Init(void){
    SysTick->LOAD = 0x00FFFFFF;
    SysTick->CTRL = 0x00000005;
}

void SysTick_Wait(uint32_t n){
    SysTick->LOAD = n - 1;
    SysTick->VAL = 0;
    while((SysTick->CTRL & 0x00010000) == 0){};
}

/*void blink_with_delay(uint32_t delay){
    uint32_t i;

    P1->OUT = 1;
    for(i = 0; i < delay; i++){
        SysTick_Wait(4800768);
    }
    P1->OUT = 0;
    for(i = 0; i < delay; i++){
        SysTick_Wait(4800768);
    }
}*/

void main(void)
{
	WDT_A->CTL = WDT_A_CTL_PW | WDT_A_CTL_HOLD;		// stop watchdog timer
    SysTick_Init();
	uint32_t i;

    P1->DIR |= 1;
	while(1){
	    int time = 9000000; //1초에 3백만 번
	    for(i = 0; i < 5; i++){
	        P1->OUT = 1;
	        SysTick_Wait(time);
	        P1->OUT = 0;
            SysTick_Wait(time);
            time -= 1500000;
	    }
        for(i = 0; i < 9; i++){
            P1->OUT = 1;
            SysTick_Wait(time);
            P1->OUT = 0;
            SysTick_Wait(time);
        }
	}
}
