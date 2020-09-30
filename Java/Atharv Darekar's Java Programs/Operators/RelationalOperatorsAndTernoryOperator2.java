package Operators;
import java.io.*;
public class RelationalOperatorsAndTernoryOperator2
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        long g,h;
        System.out.println("Enter an Integer for 'g'");
        g=Long.parseLong(A.readLine());
        System.out.println("Enter an Integer for 'h'");
        h=Long.parseLong(A.readLine());
        Boolean a,b,c,d,e,f;
        a=(g<h)?(true):(false);
        b=(g>h)?(true):(false);
        c=(g<=h)?(true):(false);
        d=(g>=h)?(true):(false);
        e=(g==h)?(true):(false);
        f=(g!=h)?(true):(false);
        System.out.println("State weather g<h is True or False");
        System.out.println(" Answer-"+a);
        System.out.println("If g=10 and h=20 then g>h is True or False ");
        System.out.println(" Answer-"+b);
        System.out.println("If g=10 and h=20 then g<=h is True or False ");
        System.out.println(" Answer-"+c);
        System.out.println("If g=10 and h=20 then g>=h is True or False ");
        System.out.println(" Answer-"+d);
        System.out.println("If g=10 and h=20 then g==h is True or False ");
        System.out.println(" Answer-"+e);
        System.out.println("If g=10 and h=20 then g!=h is True or False ");  
        System.out.println(" Answer-"+f);
    }
}