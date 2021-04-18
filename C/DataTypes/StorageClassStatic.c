#include<stdio.h>
void addnumber();
int main()
{
	addnumber();
	return 0;
}
void addnumber()
{
	static int a=1;
	printf("\n%d",a);
	a+=1;
}