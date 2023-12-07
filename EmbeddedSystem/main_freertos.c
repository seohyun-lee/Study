/* Driver configuration */
#include <ti/devices/msp432p4xx/inc/msp.h>
#include <ti/devices/msp432p4xx/driverlib/driverlib.h>
#include <ti/drivers/Board.h>

/* RTOS header files */
#include <FreeRTOS.h>
#include <task.h>
#include <semphr.h>

/* function prototypes */
void Task1( void *pvParameters );
void Task2( void *pvParameters );
void Task3( void *pvParameters );
void Task4( void *pvParameters );

/* global variables */
TaskHandle_t task1Handle, task2Handle, task3Handle, task4Handle;

void main(void)
{
    /* Configuring Red LED & RGB LED in mainboard */
    P1->DIR = BIT0;
    P2->DIR = 1<<2 | 1<<1 | 1<<0;
    P1->OUT = 0x00;
    P2->OUT = 0x00;

    xTaskCreate(Task1, "Task 1", configMINIMAL_STACK_SIZE, ( void * ) 0, 4, &task1Handle);
    xTaskCreate(Task2, "Task 2", configMINIMAL_STACK_SIZE, ( void * ) 0, 3, &task2Handle);
    xTaskCreate(Task3, "Task 3", configMINIMAL_STACK_SIZE, ( void * ) 0, 2, &task3Handle);
    xTaskCreate(Task4, "Task 4", configMINIMAL_STACK_SIZE, ( void * ) 0, 1, &task4Handle);

    /* Start the tasks and timer running. */
    vTaskStartScheduler();

    while (1)
    {
    }
}

void Task1( void *pvParameters )
{
    int i;
    while (1)
    {
       P1->OUT = BIT0;
       for (i=0;i<100000;i++);
       P1->OUT = 0;
       for (i=0;i<100000;i++);
       vTaskPrioritySet(task2Handle, 5);
       vTaskPrioritySet(task1Handle, 4);
    }
}

void Task2( void *pvParameters )
{
    int i;
    while (1)
    {
       P2->OUT = BIT0;
       for (i=0;i<100000;i++);
       P2->OUT = 0;
       for (i=0;i<100000;i++);
       vTaskPrioritySet(task3Handle, 5);
       vTaskPrioritySet(task2Handle, 3);
    }
}

void Task3( void *pvParameters )
{
    int i;
    while (1)
    {
       P2->OUT = BIT1;
       for (i=0;i<100000;i++);
       P2->OUT = 0;
       for (i=0;i<100000;i++);
       vTaskPrioritySet(task4Handle, 5);
       vTaskPrioritySet(task3Handle, 2);
    }
}

void Task4( void *pvParameters )
{
    int i;
    while (1)
    {
       P2->OUT = BIT2;
       for (i=0;i<100000;i++);
       P2->OUT = 0;
       for (i=0;i<100000;i++);
       vTaskPrioritySet(task1Handle, 5);
       vTaskPrioritySet(task4Handle, 1);
    }
}




//    xTaskCreate( Task1,                   /* The function that implements the task. */
//                 "Task 1",                /* The text name assigned to the task - for debug only as it is not used by the kernel. */
//                 configMINIMAL_STACK_SIZE,/* The size of the stack to allocate to the task. */
//                 ( void * ) 0,            /* The parameter passed to the task - just to check the functionality. */
//                 5,                      /* The priority assigned to the task. */
//                 &task1Handle );                  /* The task handle is not required, so NULL is passed. */
