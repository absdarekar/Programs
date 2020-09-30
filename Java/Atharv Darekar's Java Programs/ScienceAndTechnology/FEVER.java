package ScienceAndTechnology;
import java.io.*;
public class FEVER
{
    public static void main(String atharv[])throws IOException
    {
        double c,f=0;
        BufferedReader A=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter your temperature in Celcius (*C)") ;
        c=Double.parseDouble(A.readLine());
        f=(float)(1.8*c+32.0);
        if ((f>102.5))
            System.out.println("Dead");
        if (f<=95.0)
            System.out.println("Dead");
        if((f>=98.8)&&(f<96.6))
            System.out.println("OK");
        if ((f>98.9)&&(f<102.5))
            System.out.println("Fever");
    }
}