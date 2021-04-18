package NumeralSystem;
import java.util.*;
public class Decemal_Binary_Convertor
{
    public static void main(String atharv[])
    {
        long r;
        String d="";
        Scanner A=new Scanner(System.in);
        System.out.println("Enter a Number");
        long in=A.nextLong();
        while(in!=0)
        {
            r=in%2;
            d=Long.toString(r)+d;
            in/=2;
        }
        System.out.println("The Binary Equivalent is ="+d);        
    }
}