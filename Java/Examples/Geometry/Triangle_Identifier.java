package Geometry;
import java.util.*;
public class Triangle_Identifier
{
    public static void main(String atharv[])
    {
        double a,b,c;
        Scanner A=new Scanner(System.in);
        System.out.println("Enter Value for Side/Angle 1");
        a=A.nextDouble();
        System.out.println("Enter Value for Side/Angle 2");
        b=A.nextDouble();
        System.out.println("Enter Value for Side/Angle 3");
        c=A.nextDouble();
        if((a==b)&&(b==c))
            System.out.println("EQUILATERAL TRIANGLE");
        if((a==b)||(b==c)||(c==a))
            System.out.println("ISOSCELES TRIANGLE");
        if((a!=b)&&(b!=c)&&(c!=a))
            System.out.println("SCALENE TRIANGLE");
    }
}