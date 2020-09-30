package NumberType;
import java.util.*;
public class Neon_no_Identifier
{
    public static void main (String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("A Number is 'Neon' if sum of the digits of square of a number is equal o the number itself.");
        System.out.println("Enter a Number");
        double n=A.nextInt();
        double p,s=0,d;
        p=n*n;
        do
        {
            d=p%10;
            s=s+d;
            p=p/10;
        }while(p!=0);
        if(s==n)
            System.out.println("It is a Neon Number");
        else
            System.out.println("It is Not a Neon Number");
    }
}