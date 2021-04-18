package Patterns;
public class PATTERN_1234_2341_3412_4123
{
    public static void main(String atharv[])
    {
        int in=1234;
        System.out.println(in);
        for(int r=1;r<=3;r++)
        {
            int o=0,o1=0,o2=0;
            o=in%1000;
            o2=o*10;
            o1=in/1000+o2;
            System.out.println(o1);
            in=o1;
        }
    }
}
