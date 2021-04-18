package Patterns;
public class Pascals_Triangle
{
    public static void main (String atharv[])
    {
        {
            int p=1;
            System.out.println("1");
            for(int i=1;i<=4;i++)
            {
                p=p*11;
                if(i==2||i==3||i==4)
                    System.out.println(p);
            }
        }
    }
}