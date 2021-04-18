package NumberType;
import  java.io.*;
public class Palindrome
{
    public static void main(String atharv[]) throws IOException
    {
        BufferedReader A= new BufferedReader(new InputStreamReader(System.in));
        int d,n,r,p;r=0;
        do
        {
            System.out.println("Enter a number");
            System.out.println("For Exit Enter 100");
            n=Integer.parseInt(A.readLine());
            p=n;
            do
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            while(n!=0);
            if(r==p)
                System.out.println("Palindrome Number"); 
            else
                System.out.println("Not a Pslindrome Number");
        }while(n!=100);
    }
}