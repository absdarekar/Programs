package NumberType;
import java.io.*;
public class Even_Odd_Identifier
{
    public static void main(String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        double num,a=0;
        do
        {
            System.out.println("Enter a number");
            num=Double.parseDouble(A.readLine());
            a=num%2;
            if (num==0)
            {
                System.out.println("THANK YOU!!!");
            }
            {
                if (a==0)
                    System.out.println("Its a EVEN number");
                else
                    System.out.println("Its a OOD number");
            }
            System.out.println("Enter 0 for Exit");
        }while(num!=0);
    }
}