package Patterns;
public class PATTERN_Border
{
    public static void main (String atharv[])
    {
        int i,j;

        for (i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                if (i==1||j==1||i==4||j==4)
                    System.out.print("*");
                else 
                    System.out.print(" ");

            }
            System.out.println(" "); 
        }


    }
}
