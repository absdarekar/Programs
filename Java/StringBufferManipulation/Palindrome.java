package StringBufferManipulation;
import java.util.*;
public class Palindrome
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter A Number");
        int in=A.nextInt();
        String ins=Integer.toString(in);
        StringBuffer insb=new StringBuffer(ins);
        insb.reverse();
        String reverseins=insb.toString();
        if(ins.equals(reverseins))
            System.out.println("Its A Palindrome Number");
        else
            System.out.println("Its Not A Palindrome Number");
    }
}