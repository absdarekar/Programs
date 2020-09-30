package ScienceAndTechnology;
import java.util.*;
public class Temperature
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double temp=0,k,c,f;
        String swt;
        do
        {
            System.out.println("Select the Unite of Temperature");
            System.out.println("1.Celsius (*C)");
            System.out.println("2.Fahrenheit (*F)");
            System.out.println("3.Kelvin (K)");
            System.out.println("");
            swt=A.nextLine();
            switch(swt)
            {
                case "1":
                System.out.println("Enter Value for conversion");
                temp=A.nextDouble();
                k=temp+273.15;
                f=1.8*temp+32;
                System.out.println("The value of\t"+temp+"\t*C\t"+"Is\t"+k+"\tK\t"+f+"\t*F");
                break;
                case "2":
                System.out.println("Enter Value for conversion");
                temp=A.nextDouble();
                c=5*(temp-32)/9;
                k=c+273.15;
                System.out.println("The value of\t"+temp+"\t*F\t"+"Is\t"+k+"\tK\t"+c+"\t*C");
                break;
                case "3":
                System.out.println("Enter Value for conversion");
                temp=A.nextDouble();
                c=temp-273.15;
                f=1.8*c+32;
                System.out.println("The value of\t"+temp+"\tK\t"+"Is\t"+c+"\t*C\t"+f+"\t*F");
                break;
                default:
                System.out.println("Wrong Choice Please Try agin");
            }
        }while(swt!="qwerty");
    }
}