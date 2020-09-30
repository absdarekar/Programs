package NumberType;
import java.util.*;
public class Even_Numbers
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter a Number for Range:-");
        double in=A.nextDouble();
        System.out.println("Even numbers");
        for(double i=1;i<=in;i++)
        {
            if(i%(2.0)==0)
            System.out.println(i);
        }
    }
}