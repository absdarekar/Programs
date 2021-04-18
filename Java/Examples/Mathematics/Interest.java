package Mathematics;
import java.io.*;
public class Interest
{
    public static void main (String atharv[]) throws IOException
    {
        BufferedReader A=new BufferedReader (new InputStreamReader(System.in));
        double p,r,t,SI,AM,CI,AM2,P;
        System.out.println("Enter an value for Principle (Rs.) 'p'=");
        p=Double.parseDouble(A.readLine());
        System.out.println("Enter an value for rate p.a % 'r'=");
        r=Double.parseDouble(A.readLine());
        System.out.println("Enter an value for time span (years) 't'=");
        t=Double.parseDouble(A.readLine());
        SI=p*r*t/100;
        System.out.println("Simple Interest =\n Rs.="+SI);
        AM=SI+p;
        System.out.println("Amount on Simple Interest=\n Rs."+AM);
        AM2=p*(Math.pow((1+r/100),t));
        System.out.println("Amount for Compound Interest =\n Rs."+AM2);
        CI=AM2-p;
        System.out.println("Compound Interest =\n Rs. "+SI);
        P=CI-SI;
        System.out.println("Profit on using Compound Intrest=\n Rs."+P);
    }
}
