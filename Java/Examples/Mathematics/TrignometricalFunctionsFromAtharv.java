package Mathematics;
import Atharv.TrignometricalFunctions.*;
import java.io.*;
import java.util.*;
public class TrignometricalFunctionsFromAtharv
{
    public static void main(String args[])
    {
        ArcFunctions obj=new ArcFunctions();
        TrignometricalFunctions obj1=new TrignometricalFunctions();
        double par;        
        Scanner A=new Scanner(System.in);
        PrintWriter A1=new PrintWriter(System.out,true);
        A1.println("Enter An Tangent Value To Get Its Angle Value");
        A1.println("="+Atharv.TrignometricalFunctions.ArcFunctions.atan(par=A.nextDouble()));
        A1.println("Enter An Cosine Value To Get Its Angle Value");
        A1.println("="+Atharv.TrignometricalFunctions.ArcFunctions.acos(par=A.nextDouble()));
        A1.println("Enter An Sine Value To Get Its Angle Value");
        A1.println("="+Atharv.TrignometricalFunctions.ArcFunctions.asin(par=A.nextDouble()));        
        A1.println("Enter An Angle To Get Its Tangent Value");
        A1.println("="+Atharv.TrignometricalFunctions.TrignometricalFunctions.tan(par=A.nextDouble()));
        A1.println("Enter An Angle To Get Its Cosine Value");
        A1.println("="+Atharv.TrignometricalFunctions.TrignometricalFunctions.cos(par=A.nextDouble()));
        A1.println("Enter An Angle To Get Its Sine Value");
        A1.println("="+Atharv.TrignometricalFunctions.TrignometricalFunctions.sin(par=A.nextDouble()));
        A1.println("Enter An Tangent Value To Get Its Angle Value");
        A1.println("="+obj.atan(par=A.nextDouble()));
        A1.println("Enter An Cosine Value To Get Its Angle Value");
        A1.println("="+obj.acos(par=A.nextDouble()));
        A1.println("Enter An Sine Value To Get Its Angle Value");
        A1.println("="+obj.asin(par=A.nextDouble()));        
        A1.println("Enter An Angle To Get Its Tangent Value");
        A1.println("="+obj1.tan(par=A.nextDouble()));
        A1.println("Enter An Angle To Get Its Cosine Value");
        A1.println("="+obj1.cos(par=A.nextDouble()));
        A1.println("Enter An Angle To Get Its Sine Value");
        A1.println("="+obj1.sin(par=A.nextDouble()));
    }
}
