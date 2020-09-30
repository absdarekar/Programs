package NumberType;
import java.util.*;
public class DICE
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double d,u=7,l=1;
        String p;
        do
        {
            System.out.println("");
            System.out.println("Enter 'S' or 's' To Shuffle Dice ");
            p=A.next();
            do
            {
                d=(int)(Math.random()*(u-l))+l;
                System.out.println(d);
            }while(p!=p);
        }while(p==p);
    }
}