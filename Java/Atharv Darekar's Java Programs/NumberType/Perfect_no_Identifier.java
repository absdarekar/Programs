package NumberType;
import java.util.*;
public class Perfect_no_Identifier
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double num,i,s=0;
        System.out.println("A number is 'Perfeact' if sum of the factors is same as the original number.");
        System.out.println("Enter a Number");
        num=A.nextInt();
        for(i=1;i<num;i++)
        {
            if(num%i==0)
                s=s+i;
        }
        if(s==num
        )
            System.out.println("It is a Perfeact Number");
        else
            System.out.println("It is Not a Perfect Number");
    }
}