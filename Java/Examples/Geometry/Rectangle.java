package Geometry;
import java.io.*;
import java.math.*;
public class Rectangle
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader (new InputStreamReader(System.in));
        int l,b,a,p;
        double d;
        System.out.println("Enter Value for Length");
        l=Integer.parseInt(A.readLine());
        System.out.println("Enter Value for Bredth");
        b=Integer.parseInt(A.readLine());
        a=l*b;
        System.out.println("Area of the given Rectangle =\t"+a);
        p=2*(l+b);
        System.out.println("Perimeter of Rectangle =\t"+p);
        d=Math.sqrt(l*l+b*b);
        System.out.println("Diegonal of the given Rectangle =\t"+d);
    }
}