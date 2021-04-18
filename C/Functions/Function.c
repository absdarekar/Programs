#include<stdio.h>
void main()
{
           int a=0,b=0,sum=0;
           printf("\nEnter two numbers\n");
           scanf("%d",&a);
           printf("\n");
           scanf("%d",&b);
           sum=add(a,b);
           printf("\nSum =""%d",sum);
}

int add(int a,int b)
{
           int c=a+b;
           return c;
}
