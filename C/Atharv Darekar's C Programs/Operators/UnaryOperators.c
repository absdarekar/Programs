#include<stdio.h>
void main()
{
	int i=1001,x=0;
	x=~i;
	printf("\n%d\n",x);
	x=!i;
	printf("\n%d\n",x);
	x=-i;
	printf("\n%d\n",x);
	x=+i;
	printf("\n%d\n",x);
	x=&i;
	printf("\n%d\n",x);
}