package Pattern;
public class PascalsTriangle
{
    public static void main(String atharv[])
    {
        int i,j,k=3;
        for(i=0;i<=4;i++)
        {
            if(i!=1)
            {
                for(j=1;j<=k;j++)
                    System.out.print(" ");
                k--;
                System.out.print((int)(Math.pow(11,i)));
            }
            if(i!=1)
                System.out.println("");
        }
    }
}
