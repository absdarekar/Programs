package NumberType;
import java.util.*;
import java.io.*;
public class Greatest_no
{
    public static void main (double a,double b,double c)throws IOException
    {
        if(a>b)
        {
            if(a>c)
                System.out.println(a+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
        else
        {
            if(b>c)
                System.out.println(b+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
        Scanner A=new Scanner(System.in);
        BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Three Numbers");
        a=A.nextInt();
        b=A.nextInt();
        c=A.nextInt();
        if(a>b)
        {
            if(a>c)
                System.out.println(a+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
        else
        {
            if(b>c)
                System.out.println(b+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
        System.out.println("Enter Three Numbers");
        a=Double.parseDouble(B.readLine());
        b=Double.parseDouble(B.readLine());
        c=Double.parseDouble(B.readLine());
        if(a>b)
        {
            if(a>c)
                System.out.println(a+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
        else
        {
            if(b>c)
                System.out.println(b+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
    }
}