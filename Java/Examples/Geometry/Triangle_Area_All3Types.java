package Geometry;
import java.io.*;
public class Triangle_Area_All3Types
{
    public static void main(String atharv[])throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        int c;
        double s,a,b,m,n,p,k=0;
        double area;
        double four=4.0,three=3.0,two=2.0;
        System.out.println("Enter your choice");
        System.out.println("1.Area of an Equilateral Triangle");
        System.out.println("2.Area of an Isosceles Triangle");
        System.out.println("3.Area of a Scalene Triangle");
        c=Integer.parseInt(A.readLine());
        switch (c)
        {
            case 1:
            System.out.println("Enter a side of an Equilateral Triangle");
            s=Double.parseDouble(A.readLine());
            area=(Math.sqrt(three)*s*s)/four;
            System.out.println("Area of the given triangle ="+area);
            break;

            case 2:
            System.out.println("Enter side & base of Isosceles Triangle");
            a=Double.parseDouble(A.readLine());
            b=Double.parseDouble(A.readLine());
            area=b/four*(Math.sqrt(four*a*a-b*b));
            System.out.println("Area of the given triangle ="+area);
            break;

            case 3:
            System.out.println("Enter sides of Scalene Triangle");
            m=Double.parseDouble(A.readLine());
            n=Double.parseDouble(A.readLine());
            p=Double.parseDouble(A.readLine());;
            k=(m+n+p)/two;
            area=Math.sqrt(k*(k-m)*(k-n)*(k-p));
            System.out.println("Area of the given triangle ="+area);
            break;

            default:
            System.out.println("Invalid Option");
        }
    }
}