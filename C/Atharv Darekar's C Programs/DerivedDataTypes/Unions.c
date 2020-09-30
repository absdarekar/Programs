#include<stdio.h>
	union employee
	{
		int id;
		char name[30];
		float salary;
	};
int main()
{
	union employee eSelf={1511,"Atharv Darekar",10000000};
	union employee eTest={"Test",123.123,123};
	union employee eOthers[3]={{1510,"Niraj",10000000},{1512,"Suyash Deshmukh",10000000},{1519,"Saurabh Jiotode",10000000}};
	union employee eUser[2];
	int i;
	//printf("Employee ID %d\n",eSelf.id);
	printf("Employee Name %s\n",eSelf.name);
	printf("Employee Salary %f\n\n",eSelf.salary);

	printf("Employee ID %d\n",eOthers[0].id);
	//printf("Employee Name %s\n",eOthers[0].name);
	printf("Employee Salary %f\n\n",eOthers[0].salary);

	printf("Employee ID %d\n",eOthers[1].id);
	printf("Employee Name %s\n",eOthers[1].name);
	//printf("Employee Salary %f\n\n",eOthers[1].salary);
	printf("\n\n");

	printf("Employee ID %d\n",eOthers[2].id);
	printf("Employee Name %s\n",eOthers[2].name);
	printf("Employee Salary %f\n\n",eOthers[2].salary);

	printf("Employee ID %s\n",eTest.id);
	printf("Employee Name %s\n",eTest.name);
	printf("Employee Salary %f\n\n",eTest.salary);

	printf("Enter Employee ID, Name and Salary for two employees\n");	
	for(i=0;i<=1;i++)
	{
		scanf("%d%s%f",&eUser[i].id,&eUser[i].name,&eUser[i].salary);
	}
	printf("\n");
	for(i=0;i<=1;i++)
	{
		printf("Employee ID %d\nEmployee Name %s\nEmployee Salart %f\n",eUser[i].id,eUser[i].name,eUser[i].salary);
		printf("\n");
	}
		
}
