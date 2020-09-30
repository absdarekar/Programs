package Convertions;
import java.util.*;
public class Binary_Deciamal_Convertor 
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter a Number");
        long in=A.nextLong();
        int c=0;
        double d=0.0,r;
        while(in!=0)
        {
            r=in%10;
            d+=r*Math.pow(2,c);
            in/=10;
            c+=1;
        }
        System.out.println("The Decimal Equivalent is ="+ (int)(d));
    }
}