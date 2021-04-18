package Miscellaneous;
import java.io.*;
public class BMI
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        double h,w,bmi;
        do
        {
            System.out.println("WELCOME TO THE HEALTH ANALYSIS PROGRAM PROGRAMMED BY ATHARV DAREKAR");
            System.out.println("");
            System.out.println("Enter your Weight (IN Kg)");
            w=Double.parseDouble(A.readLine());
            System.out.println("");
            System.out.println("Enter value for Height (IN m)");
            h=Double.parseDouble(A.readLine());
            System.out.println("");
            bmi=(w/(h*h));
            if (bmi<=13.0)
            {
                System.out.println("Very severely underweight");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
            if((bmi>=13.0)&&(bmi<14.0))
            {
                System.out.println("Severely underweight");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
            if((bmi>=14.0)&&(bmi<16.5))
            {
                System.out.println("Underweight");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
            if((bmi>=16.5)&&(bmi<23.0))
            {
                System.out.println("Normal (HEALTHY)");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
            if((bmi>=23.0)&&(bmi<28.0))
            {
                System.out.println("Overweight");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
            if((bmi>=28.0)&&(bmi<33.0))
            {
                System.out.println("Obese Class I (Moderately obese)");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
            if((bmi>=33.0)&&(bmi<38.0))
            {
                System.out.println("Obese Class II (Severely obese)");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
            if((bmi>=38.0))
            {
                System.out.println("Obese Class III (Very severely obese)");
                System.out.println("");
                System.out.println("Thank You!!!");
            }
        }while(bmi!=0);
    }
}