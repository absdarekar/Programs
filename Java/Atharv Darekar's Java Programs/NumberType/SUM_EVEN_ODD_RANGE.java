package NumberType;
import java.util.*;
public class SUM_EVEN_ODD_RANGE
{
    public static void main (String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter A Number Range:-");
        int in=A.nextInt();
        int e=0,o=0;
        for(int i=1;i<=in;i++)
        {
            if(i%2==0)
                e+=i;
            if(i%2!=0)
                o+=i;
        }
        System.out.println("The Average of All The Even Numbers in "+in+" is "+e);
        System.out.println("The Average of All The Odd Numbers in "+in+" is "+o);
    }
}