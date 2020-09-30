package NumberType;
import java.util.*;
public class Armstrong_no_Identifier
{
    public static void main(String atharv[])
    {
        System.out.println("A number is said to be an Armstrong, if the sum of cubes of digit is equal to the origrinal number.");
        Scanner A=new Scanner(System.in);
        double a,num,s=0,n;
        System.out.println("Enter a Number");
        n=A.nextInt();
        num=n;
        while(n>0)
        {
            a=n%10;
            s=s+a*a*a;
            n=n/10;
        }
        if(num==s)
            System.out.println("The Number is an Armstrong Number");
        else
            System.out.println("The Number is Not an Armstrong Number");
    }
}