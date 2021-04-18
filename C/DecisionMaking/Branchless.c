#include<stdio.h>
void main()
{
	float a, b;
	printf("Enter two numbers\n");
	scanf("%f\n",&a);
	scanf("%f",&b);
	printf("%f is grater than %f",(a*(a>b)+b*(b>a)),(a*(a<b)+b*(b<a)));
}
