#include <stdio.h>

int     main(int argc, char * argv[])
{
        char string1[100], string2[100];
        FILE *fp = fopen(argv[1], "rt");
        int i=0;
        int total=0;
        int score=0;
        while(fscanf(fp, "%s", string1) != -1)
        {
                i++;
                if (i%2==1)
                {
                        printf("%s\n", string1);
                        scanf("%s", string2);
                        total++;
                }
                else
                {
                        if (strcmp(string1, string2)==0)
                        {
                                printf("정답(O)\n");
                                score++;
                        }
                        else
                        {
                                printf("땡(X)\n");
                                printf("%s\n", string1);
                        }
                }
        }
        printf("당신은 총 %d문제 중 %d문제를 맞추셨습니다.\n", total, score);
}