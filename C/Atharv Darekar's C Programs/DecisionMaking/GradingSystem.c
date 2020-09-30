#include <stdio.h>
void main()
{
	float in;
	printf("Enter Your Marks obtained\n");
	scanf("%f",&in);
	if(in>=80 && in<=100)
	printf("\nGrade A\n");
	if(in<80 && in>=60)
	printf("\nGrade B\n");
	if(in<60 && in>=40)
	printf("\nGrade C\n");
	if(in<40 && in>=0)
	printf("\nGrade Fail\n");
	if(in>100 || in<0)
	printf("\nPlease Enter Valid Marks\n");
}
