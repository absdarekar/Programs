package NumberType;
import java.util.*;
public class Prime_no_Identifier
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double in,a,b=0;
        System.out.println("Enter a Number");
        in=A.nextInt();
        for(a=1;a<=in;a++)
        {
            if(in%a==0)
                b=b+1;
        }
        if(b==2)
            System.out.println("Its a Prime Number");
        else
            System.out.println("Its Not a Prime Number");
    }
}