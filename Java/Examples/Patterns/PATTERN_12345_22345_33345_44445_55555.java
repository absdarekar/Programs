package Patterns;
public class PATTERN_12345_22345_33345_44445_55555
{
    public static void main(String atharv[])
    {
        int a,b,c,p=2;
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
                System.out.print(a);
            for(c=p;c<=5;c++)
                System.out.print(c);
            System.out.println();
            p=p+1;
        }
    }
}