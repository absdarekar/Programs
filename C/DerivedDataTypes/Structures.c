#include<stdio.h>
	struct employee
	{
		int id;
		char name[30];
		float salary;
	};
int main()
{
	struct employee eSelf={1511,"Atharv Darekar",10000000};
	struct employee eOthers[3]={{1510,"Niraj",10000000},{1512,"Suyash Deshmukh",10000000},{1519,"Saurabh Jiotode",10000000}};
	printf("Employee ID %d\n",eSelf.id);
	printf("Employee Name %s\n",eSelf.name);
	printf("Employee Salary %f\n\n",eSelf.salary);
	printf("Employee ID %d\n",eOthers[0].id);
	printf("Employee Name %s\n",eOthers[0].name);
	printf("Employee Salary %f\n\n",eOthers[0].salary);
	printf("Employee ID %d\n",eOthers[1].id);
	printf("Employee Name %s\n",eOthers[1].name);
	printf("Employee Salary %f\n\n",eOthers[1].salary);
	printf("Employee ID %d\n",eOthers[2].id);
	printf("Employee Name %s\n",eOthers[2].name);
	printf("Employee Salary %f\n\n",eOthers[2].salary);
}
