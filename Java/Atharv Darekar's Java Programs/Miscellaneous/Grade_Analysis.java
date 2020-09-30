package Miscellaneous;
import java.util.*;
public class Grade_Analysis
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter your Percentage for Grade Analysis");
        double in=A.nextDouble();
        if(in>=80)
            System.out.println("Distinction");
        if((in>=60)&&(in<80))
            System.out.println("First Division");
        if((in>=45)&&(in<60))   
            System.out.println("Second Division");
        if((in>=40)&&(in<45))
            System.out.println("Pass");
        if(in<40)
            System.out.println("Fail");
    }
}
