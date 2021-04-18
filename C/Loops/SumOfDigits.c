#include<stdio.h>
void main()
{
           int input=0,sum=0;
           printf("\nEnter a number\n");
           scanf("%d",&input);
           while(input!=0)
           {
                      sum+=input%10;
                      input/=10;
           }
           printf("\n Sum of each digit of entered number is %d\n",sum);           
           
}
