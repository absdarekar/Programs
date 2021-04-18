package Patterns;
public class PATTERN_X 
{
    public static void main(String atharv[])
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {                
                if(((i==1||i==3)&&(j==1||j==3)))
                System.out.print("**"+"  ");
                else
                if(i==2&&j==2)
                System.out.print("  "+"**");
            }
            System.out.println();
        }
    }
}