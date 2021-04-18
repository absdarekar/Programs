package Miscellaneous;
public class AO011II
{
    public static void main (String atharv[])
    {
        int a,b;
        a=1;
        b=1;
        do
        {
            b=b*a;
            a++;
        }
        while (a<=10);
        System.out.println("Factorials of First 10 Natural Numbers is \t"+b);
    }
}