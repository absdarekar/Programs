package Patterns;
public class PATTERN_ARROW_HEAD
{
    public static void main(String atharv[])
    {
        int i,j=0,a=0;
        for(i=1;i<=5;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=5;i>=1;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }            
    }
}


