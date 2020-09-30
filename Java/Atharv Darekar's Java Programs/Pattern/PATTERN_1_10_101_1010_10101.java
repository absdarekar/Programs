package Pattern;
public class PATTERN_1_10_101_1010_10101
{
    public static void main(String atharv[])
    {
        int in=1,o1=0,o2=1;
        for(int i=1;i<=5;i++)
        {
            if(i==3||i==5)
                o1=in*o2+1;
            else
                o1=in*o2;
            o2=10;
            in=o1;
            System.out.println(o1);
        }
    }
}