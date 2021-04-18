#include <stdio.h>
 //Compiler version gcc 6.3.0

 int main(void)
 {
 	char i,j;
 	i=97;
 	j='x';
 	switch(i)
 	{
 		case 'a':
 		printf("a");
 		break;
 		case 'x':
 		printf("x");
 		break;
 	}
 	switch(j)
 	{
 		case 'a':
 		printf("a");
 		break;
 		case 'x':
 		printf("x");
 		break;
 	}
 	return 0;
 }