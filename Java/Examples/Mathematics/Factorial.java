package Mathematics;
import java.util.*;
public class Factorial
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        int f=1,i=1,n;
        System.out.println("Enter a Number For It's Factorial");
        n=A.nextInt();
        do
        {
            f=f*i;
            i++;
        }
        while(i<=n);
        System.out.println("Factorial of\t"+n+"\tis\t"+f);
    }
}
