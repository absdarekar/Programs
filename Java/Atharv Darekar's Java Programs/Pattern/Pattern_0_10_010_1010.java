package Pattern;
public class Pattern_0_10_010_1010
{
    public static void main (String atharv[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((j+i)%2);
            }
            System.out.println("");
        }
    }
}