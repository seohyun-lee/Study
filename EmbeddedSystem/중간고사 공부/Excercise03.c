#include "msp.h"

void main(void){
    volatile unsigned char *gpio_p1dir, *gpio_p1out, *gpio_p2dir, *gpio_p2out;

    int i;
    gpio_p1dir = (unsigned char *)(0x40004C04);
    gpio_p1out = (unsigned char *)(0x40004C02);
    gpio_p2dir = (unsigned char *)(0x40004C05);
    gpio_p2out = (unsigned char *)(0x40004C03);

    //DIR은 처음에 한번만 설정해주면 됨
    *gpio_p1dir = 0x01;
    *gpio_p2dir = 0x07;

    while(1){
        *gpio_p1out=0x01;
        *gpio_p2out=0x01; //RED
        for(i=0; i<100000; i++);

        *gpio_p1out=0x00;
        *gpio_p2out=0x00;
        for(i=0; i<100000; i++);

        *gpio_p1out=0x01;
        *gpio_p2out=0x02; //GREEN
        for(i=0; i<100000; i++);

        *gpio_p1out=0x00;
        *gpio_p2out=0x00;
        for(i=0; i<100000; i++);

        *gpio_p1out=0x01;
        *gpio_p2out=0x04; //BLUE
        for(i=0; i<100000; i++);

        *gpio_p1out=0x00;
        *gpio_p2out=0x00;
        for(i=0; i<100000; i++);
    }
}
