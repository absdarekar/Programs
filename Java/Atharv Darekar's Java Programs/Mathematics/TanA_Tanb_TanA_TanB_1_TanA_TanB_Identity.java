package Mathematics;
import java.util.*;
public class TanA_Tanb_TanA_TanB_1_TanA_TanB_Identity
{
    public static void main(String atharv[])
    {
        int a,b;
        double m,n,p=0;
        Scanner A=new Scanner(System.in);
        System.out.println("Enter the value of A angle greater than the B");
        System.out.println("Enter A Angle");
        a=A.nextInt();
        System.out.println("Enter B angle");
        b=A.nextInt();
        m=(22.0/(7.0*180.0))*a;
        n=(22.0/(7.0*180.0))*b;
        p=(Math.tan(m)-Math.tan(n))/(1+(Math.tan(m)*Math.tan(n)));
        System.out.println("The value of the expression ="+p);
    }
}