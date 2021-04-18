package Operators;
import java.io.*;
public class BitwiseOperator2
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        long a,b;
        System.out.println("Enter an Integer for 'a'");
        a=Long.parseLong(A.readLine());
        System.out.println("Enter an Integer for 'b'");
        b=Long.parseLong(A.readLine());
        System.out.println("a&b="+(a&b));
        System.out.println("a|b="+(a|b));
        System.out.println("a^b="+(a^b));
        System.out.println("10<<2="+(10<<2));
        System.out.println("10>>2="+(10>>2));
        System.out.println("10>>>2="+(10>>>2));
    }
}