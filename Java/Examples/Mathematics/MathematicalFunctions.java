package Mathematics;
import java.io.*;
import java.util.*; 
public class MathematicalFunctions
{
    static Scanner A=new Scanner(System.in);
    static PrintWriter A1=new PrintWriter(System.out,true);
    static double par,par1,par2;
    MathematicalFunctions()
    {
        par=0;
        par1=0;
        par2=0;
    }

    public static double Radians(double angle)
    {
        return Math.toRadians(angle);
    }

    public static double Degrees(double angle)
    {
        return Math.toDegrees(angle);
    }

    public static double Round(double in)
    {
        return Math.round(in);
    }

    public static double Rint(double in)
    {
        return Math.rint(in);
    }

    public static double Random()
    {
        return Math.random();
    }

    public static double Hypotenuse(double base,double height)
    {
        return Math.hypot(base,height);
    }

    public static double Ceil(double in)
    {
        return Math.ceil(in);
    }

    public static double Floor(double in)
    {
        return Math.floor(in);
    }

    public static double CubeRoot(double in)
    {
        return Math.cbrt(in);
    }

    public static double Atan(double in)
    {
        return Math.toDegrees(Math.atan(in));
    }

    public static double Acos(double in)
    {
        return Math.toDegrees(Math.acos(in));
    }

    public static double Asin(double in)
    {
        return Math.toDegrees(Math.asin(in));
    }

    public static double Maximum(double in1,double in2)
    {
        return Math.max(in1,in2);
    }

    public static double Minimum(double in1,double in2)
    {
        return Math.min(in1,in2);
    }

    public static double Exponential(double in)
    {
        return Math.exp(in);
    }

    public static double Power(double base,double power)
    {
        return Math.pow(base,power);
    }

    public static double Logaritham10(double in)
    {
        return Math.log10(in);
    }

    public static double SquareRoot(double in)
    {
        return Math.sqrt(in);
    }

    public static double Tangent(double in)
    {
        in=Math.toRadians(in);
        return Math.tan(in);
    }

    public static double Cosine(double in)
    {
        in=Math.toRadians(in);
        return Math.cos(in);
    }

    public static double Sine(double in)
    {
        in=Math.toRadians(in);
        return Math.sin(in);
    }

    public static double Absolute(double in)
    {
        return Math.abs(in);
    }

    public static void main(String atharv[])
    {
        A1.println("Enter An Angle In Degree To Convert Into Radians");
        A1.println("="+Radians(par=A.nextDouble()));
        A1.println("Enter An Angle In Radians To Convert Into Degrees");
        A1.println("="+Degrees(par=A.nextDouble()));
        A1.println("Enter A Number To Get Its Round Value");
        A1.println("="+Round(par=A.nextDouble()));
        A1.println("Enter A Number To Get Its Rint Value");
        A1.println("="+Rint(par=A.nextDouble()));
        A1.println("A Random Value");
        A1.println("="+Random());
        A1.println("Enter Value Of Base And Heigth Of A Right Angled Triangle To Get Its Hypotenuse");
        A1.println("="+Hypotenuse(par1=A.nextDouble(),par2=A.nextDouble()));        
        A1.println("Enter A Number To Get Its Ceil Value");
        A1.println("="+Ceil(par=A.nextDouble()));
        A1.println("Enter A Number To Get Its Cube Root Value");
        A1.println("="+CubeRoot(par=A.nextDouble()));
        A1.println("Enter An Tangent Value To Get Its Angle Value");
        A1.println("="+Atan(par=A.nextDouble()));
        A1.println("Enter An Cosine Value To Get Its Angle Value");
        A1.println("="+Acos(par=A.nextDouble()));
        A1.println("Enter An Sine Value To Get Its Angle Value");
        A1.println("="+Asin(par=A.nextDouble()));
        A1.println("Enter Two Number To Get The Greatest Number Among Them");
        A1.println("="+Maximum(par1=A.nextDouble(),par2=A.nextDouble()));
        A1.println("Enter Two Number To Get The Smallest Number Among Them");
        A1.println("="+Minimum(par1=A.nextDouble(),par2=A.nextDouble()));
        A1.println("Enter A Number To Get Its Exponential Value");
        A1.println("="+Exponential(par=A.nextDouble()));
        A1.println("Enter The Base And Its Power To Get Its Value");
        A1.println("="+Power(par1=A.nextDouble(),par2=A.nextDouble()));
        A1.println("Enter A Number To Get Its Logarithmic Value");
        A1.println("="+Exponential(par=A.nextDouble()));
        A1.println("Enter A Number To Get Its Square Root");
        A1.println("="+SquareRoot(par=A.nextDouble()));
        A1.println("Enter An Angle To Get Its Tangent Value");
        A1.println("="+Tangent(par=A.nextDouble()));
        A1.println("Enter An Angle To Get Its Cosine Value");
        A1.println("="+Cosine(par=A.nextDouble()));
        A1.println("Enter An Angle To Get Its Sine Value");
        A1.println("="+Sine(par=A.nextDouble()));
        A1.println("Enter A Number To Get Its Absolute Value");
        A1.println("="+Absolute(par=A.nextDouble()));
    }
}
/*
Math.toRadians(<parameter>);
Math.toDegrees(<parameter>);
Math.round(<parameter>);
Math.rint(<parameter>);
Math.random();
Math.hypot(<parameter>,<parameter>);
Math.ceil(<parameter>);
Math.floor(<parameter>);
Math.cbrt(<parameter>);
Math.atan(<parameter>//returns in radians);
Math.acos(<parameter>//returns in radians);
Math.asin(<parameter>//returns in radians);
Math.max(<parameter>);
Math.min(<parameter>);
Math.exp(<parameter>);
Math.pow(<base>,<power>);
Math.log(<parameter>);
Math.sqrt(<parameter>);
Math.tan(<parameter>//input in radians);
Math.cos(<parameter>//input in radians);
Math.sin(<parameter>//input in radians);
Math.abs(<parameter>);
 */