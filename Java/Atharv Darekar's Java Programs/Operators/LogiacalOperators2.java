package Operators;
import java.io.*;
public class LogiacalOperators2
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        long g,h;
        System.out.println("Enter an Integer for 'g'");
        g=Long.parseLong(A.readLine());
        System.out.println("Enter an Integer for 'h'");
        h=Long.parseLong(A.readLine());
        Boolean a,b,c,d,e;
        a=(g<h)?(true):(false);
        b=(g>h)?(true):(false);
        c=(g<=h)?(true):(false);
        d=(g>=h)?(true):(false);
        e=(g==h)?(true):(false);
        System.out.println("g<h&&g>h=");
        System.out.println("Answer ="+(a&&b));
        System.out.println("If g=10 and h=20 then g<=h||g>=h=");
        System.out.println("Answer ="+(c||d));
        System.out.println("If g=10 and h=20 then !g==h=");
        System.out.println("Answer ="+!(e));
    }
}