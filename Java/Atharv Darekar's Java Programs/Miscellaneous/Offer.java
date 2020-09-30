package Miscellaneous;
public class Offer
{
    public static void main (int c,int p)
    {
        int r1=15,r2=10;
        double d1,d2,m=0,n=0;
        d1=(double)r1/100*c;
        d2=(double)r2/100*p;
        m=c-d1;
        n=p-d2;
        System.out.println("The price of Laptop after discount=\t"+m);
        System.out.println("The price of Printer after discount=\t"+n);
    }
}