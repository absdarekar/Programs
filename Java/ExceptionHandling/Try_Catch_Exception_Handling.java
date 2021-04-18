package ExceptionHandling;
import java.io.*;
public class Try_Catch_Exception_Handling
{
    public static void main(String atharv[])
    {
        try
        {
            DataInputStream A=new DataInputStream(System.in);
            int num1,num2;
            System.out.println("Enter any two numbers");
            num1=Integer.parseInt(A.readLine());
            num2=Integer.parseInt(A.readLine());
            System.out.println("Sum of the Numbers is "+(num1+num2));
            System.out.println("Diffrence of the Numbers 1 with 2 is "+(num1-num2));
            System.out.println("Product of the Numbers is "+(num1*num2));
            System.out.println("Division of the Numbers 1 with 2 is "+(num1/num2));
            System.out.println("Module of the Numbers is "+(num1%num2));
        }catch(IOException e){}
    }
}