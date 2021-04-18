#include<stdio.h>
void main()
{
           int input=0,reverse=0;
           printf("\nEnter a number\n");
           scanf("%d",&input);
           while(input!=0)
           {
                      reverse=reverse*10+input%10;
                      input/=10;
           }
           printf("\n Reverse of entered number is %d\n",reverse);     
}
