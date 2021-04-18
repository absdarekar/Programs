package Patterns;
public class Patterns_1A5_22B4_333C3_44444D2_55555E
{
    public static void main(String atharv[])
    {
        int i,j,k,l=5;
        char array[]={'A','B','C','D','E'};
        for(i=0;i<=4;++i)
        {
            for(j=1;j<=i+1;j++)
            System.out.print(i+1+" ");
            for(k=1;k<=l;k++)
            System.out.print(array[i]+" ");
            l--;
            System.out.println("");
        }
    }
}