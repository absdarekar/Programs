package Miscellaneous;
import java.io.*;
public class AO011III
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        c=0;
        System.out.println("Enter 10 Numbers");
        for(a=1;a<=10;a++)
        {
            b=Integer.parseInt(A.readLine());
            c=c+b;
        }
        System.out.println("Sum of the Given range of  number is"+c);
    }
}