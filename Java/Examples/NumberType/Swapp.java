package NumberType;
import java.util.*;
public class Swapp
{
    public static void main (String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double a,b;
        System.out.println("Enter two Numbers for Varaible a & b");
        System.out.print("a=");
        a=A.nextDouble();
        System.out.print("b=");
        b=A.nextDouble();
        System.out.println("Numbers Before Swapping"+" a= "+a+" & b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers After Swapping"+" a= "+a+" & b= "+b);
    }
}
    