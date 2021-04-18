package NumeralSystem;
import java.util.*;
import java.io.*;
public class Leap_Year_Identifier
{
    public static void main(int inyer)throws IOException
    {
        int stx;
        stx=inyer%4;
        if(stx==0)
            System.out.println("It's a Leap Year");
        else
            System.out.println("It's not a Leap Year");
        //using buffer  
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Year In Number");
        inyer=Integer.parseInt(A.readLine());
        if(stx==0)
            System.out.println("It's a Leap Year");
        else
            System.out.println("It's not a Leap Year");
        //using scaner
        Scanner B=new Scanner(System.in); 
        System.out.println("Enter Year In Number");
        inyer=B.nextInt();
        stx=inyer%4;
        if(stx==0)
            System.out.println("It's a Leap Year");
        else
            System.out.println("It's not a Leap Year");
    }
}