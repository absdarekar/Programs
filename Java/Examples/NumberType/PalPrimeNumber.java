package NumberType;
import java.util.*;
public class PalPrimeNumber
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter A Number");
        int in=A.nextInt();
        boolean flag=false,flag1=false;
        int i=0,n=in,r=0,s=0,c=0;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n/=10;
        }
        if(in==s)
            flag=true;
        for(i=1;i<=in;i++)
        {
            if(in%i==0)
                c++;
        }
        if(c==2)
          flag1=true;
        if(flag==true&&flag1==true)
            System.out.println("The number "+in+" is PalPrime Number");
        else       
            System.out.println("The number "+in+" is Not PalPrime Number");
    }
}