package Mathematics;
import java.util.*;
public class Mathematical_Tables
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double in,i;
        System.out.println("Enter any Real Number for its Multiplicational Table");
        in=A.nextDouble();
        for(i=1.0;i<=10;i++)
        {
            System.out.println(i*in);
        }
    }
}