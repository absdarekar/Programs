package Operators;
import java.io.*;
public class MathematicalOperatorsUnary2
{
    public static void main(String atharv[]) throws IOException
    {
        BufferedReader A= new BufferedReader (new InputStreamReader(System.in));
        long a,b,c,d,e,f,g;
        System.out.println("Enter an Integer for 'a'=");
        a=Long.parseLong(A.readLine());
        System.out.println("Enter an Integer for 'b'=");
        b=Long.parseLong(A.readLine());
        c=--a+b--*a*b;
        System.out.println("value of 'c' when c=--a+b--*a*b="+c);
        System.out.println("value of 'a' when c=--a+b--*a*b="+a);
        System.out.println("value of 'b' when c=--a+b--*a*b="+b);
    }
}