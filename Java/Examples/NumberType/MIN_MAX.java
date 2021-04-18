package NumberType;
import java.util.*;
public class MIN_MAX
{
    public static void main (String atharv[])
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter two Numbers");
        double in1=A.nextDouble();
        double in2=A.nextDouble();             
        if(in1>in2)
            System.out.println("The Greatest Number is\t"+in1);
        if(in2>in1)
            System.out.println("The Greatest Number is\t"+in2);
        if(in1<in2)
            System.out.println("The Lowest Number is\t"+in1);
        if(in2<in1)
            System.out.println("The Lowest Number is\t"+in2);
    }
}