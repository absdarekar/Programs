package Constructor;
import java.util.*;
public class Temperature
{
    double max,min,f1,f2;
   Temperature(double m,double n)
    {
        max=m;
        min=n;
        f1=0;
        f2=0;
    }

    public void compute()
    {
        f1=9*max/5+32;
        f2=9*min/5+32;
    }

    public void display()
    {
        System.out.println("The Maximum Temperature In *F ="+f1);
        System.out.println("The Minimum Temperature In *F ="+f2);
    }

    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        double m,n;
        System.out.println("Enter Maximum And Minimum Temperature In *C");
        m=A.nextDouble();
        n=A.nextDouble();
        Temperature obj=new Temperature(m,n);
        obj.compute();
        obj.display();
    }
}