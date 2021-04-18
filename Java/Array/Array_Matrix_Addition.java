package Array;
public class Array_Matrix_Addition
{
    void ArrayMatrixAddition()
    {
        int i,j;
        int sum[][]=new int[2][2];
        int m1[][]={{1,2},{3,4}};
        int m2[][]={{5,6},{7,8}};
        System.out.println("The Matrix to be Added are");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println("");
        }        
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("The Addition is");
         for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
