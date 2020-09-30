#include<stdio.h>
#include<math.h>
void main()
{
           float a=0,b=0,c=0,root1=0,root2=0,d=0;
           printf("\nQuadratic Equation is represented by equation ax^2+bx+c=0\n");
           printf("\nEnter value of a, b and c with proper signs:\n");
           scanf("%f%f%f",&a,&b,&c);
           d=b*b*(-4.0*a*c);
           if((d>=0)&&(a!=0))
           {
                      root1=(-b+sqrt(d))/(2.0*a);
                      root2=(-b-sqrt(d))/(2.0*a);
                      printf("Roots of given quadratic equation %fx^2+%fx+%f=0 are\n%f\n%f\n",a,b,c,root1,root2);
           }
           if((d<0)&&(a!=0))
           {
                      root1=-b/(2.0*a);
                      root2=(sqrt(abs(d)))/(2.0*a);
                      printf("Roots of given quadratic equation %fx^2+%fx+%f=0 are\n",a,b,c);
                      printf("%f+%f i\n",root1,root2);
                      printf("%f-%f i\n",root1,root2);
           }
           if(a==0)
           printf("Invalid input\n");
}
