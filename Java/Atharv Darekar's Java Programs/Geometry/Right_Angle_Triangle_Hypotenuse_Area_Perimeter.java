package Geometry;
import java.io.*;
public class Right_Angle_Triangle_Hypotenuse_Area_Perimeter
{
    public static void main(String atharv[])throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        double p,b;
        double h,ar,pm;
        System.out.println("Enter perpendicualr and base of the triangle");
        p=Double.parseDouble(A.readLine());
        b=Double.parseDouble(A.readLine());
        h=Math.sqrt(p*p+b*b);
        ar=0.5*p*b;
        pm=(p+b+h);
        System.out.println("Hypotenuse of the Triangle ="+h);
        System.out.println("Area of the Triangle ="+ar);
        System.out.println("Perimeter of the Triangle ="+pm);
    }
}