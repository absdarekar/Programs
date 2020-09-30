package InputMethods;
import java.io.*;
import java.util.*;
public class Input
{
    public static void main(int a,int b)throws IOException
    {
        int sum=0;
        sum=a+b;
        System.out.println("Addition of\t"+a+"\tAnd\t"+b+"\tis\t"+sum);
        int a1,b1,sum1=0;
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value for a1");
        a1=Integer.parseInt(A.readLine());
        System.out.println("Enter a value for b1");
        b1=Integer.parseInt(A.readLine());
        sum1=a1+b1;
        System.out.println("Addition of\t"+a1+"\tAnd\t"+b1+"\tis\t"+sum1);
        int a2,b2,sum2=0;
        Scanner B=new Scanner(System.in);
        System.out.println("Enter a value for a2");
        a2=B.nextInt();
        System.out.println("Enter a value for b2");
        b2=B.nextInt();
        sum2=a2+b2;
        System.out.println("Addition of\t"+a2+"\tAnd\t"+b2+"\tis\t"+sum2);

    }
}
