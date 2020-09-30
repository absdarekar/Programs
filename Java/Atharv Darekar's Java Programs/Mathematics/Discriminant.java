package Mathematics;
import java.util.*;
public class Discriminant
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double a,b,c,dis,r1,r2;
        System.out.println("Enter the value for Vriable a,b,c to know the roots of the Quadratic Equation i.e. ax2+bx+c");
        a=A.nextDouble();
        b=A.nextDouble();
        c=A.nextDouble();
        dis=b*b-(4*a*c);
        if(dis>0)
            System.out.println("The Roots are Real and Unequal");
        if(dis<0)
            System.out.println("The Roots are Imaginary ");
        if(dis==0)
            System.out.println("The Roots are Real and Equal");
        System.out.println("");
        System.out.println("The Roots are");
        r1=(-b+Math.sqrt(dis))/2*a;
        r2=(-b-Math.sqrt(dis))/2*a;
        System.out.println(r1);
        System.out.println("&");
        System.out.println(r2);
    }
}