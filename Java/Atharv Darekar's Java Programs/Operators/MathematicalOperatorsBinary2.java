package Operators;
import java.io.*;
public class MathematicalOperatorsBinary2
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A= new BufferedReader (new InputStreamReader(System.in));
        long a,b,c,d,e,f,g;
        System.out.println("Enter an Integer for 'a'=");
        a=Long.parseLong(A.readLine());
        System.out.println("Enter an Integer for 'b'=");
        b=Long.parseLong(A.readLine());
        c=a+b;
        d=b-a;
        e=a*b;
        f=b/a;
        g=b%a;
        System.out.println("Sum of the numbers="+c);
        System.out.println("Difference between the numbers="+d);
        System.out.println("Multiplication of the numbers="+e);
        System.out.println("Division of the numbers="+f);
        System.out.println("Remender of divisiin of the numbers="+g);
    }
} 