package Constructor;
import java.util.*;
public class Employee
{
    String name;
    double empno,basic,da,hra,pf,gross,net;
    Employee(String n,double eo,double bc)
    {
        name=n;
        empno=eo;
        basic=bc;
    }

    public void compute()
    {
        da=basic*30/100;
        hra=basic*15/100;
        pf=basic*12/100;
        gross=basic+da+hra;
        net=gross-pf;
    }

    public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Employee Number :"+empno);
        System.out.println("Gross Salary :Rs."+gross);
        System.out.println("Net Salary :Rs."+net);
    }

    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        String nm;
        double emn,b;
        System.out.println("Enter Employee's Name, Employee No.,Basic Salary :");
        nm=A.nextLine();
        emn=A.nextDouble();
        b=A.nextDouble();
        Employee obj=new Employee(nm,emn,b);
        obj.compute();
        obj.display();
    }
}
