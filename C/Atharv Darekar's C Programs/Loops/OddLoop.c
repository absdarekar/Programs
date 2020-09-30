#include <stdio.h>
 //Compiler version gcc 6.3.0

 int main(void)
 {
 	int in;
 	char yn;
 	do
 	{
 		printf("Enter a number\n");
 		scanf("%d",&in);
 		printf("Square of %d is %d\n",in,in*in);
 		printf("To continue enter y else n for exit\n");
 		scanf("%c",&yn);
 	}while(yn=='y');
 	return 0;
 }