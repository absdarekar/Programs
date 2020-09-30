#include <stdio.h>
void main()
{
 	auto a=10;
 	{
 		auto a=20;
 		printf("In block a:%d\n",a);
 	}
 	printf("Out block a:%d\n",a);
}