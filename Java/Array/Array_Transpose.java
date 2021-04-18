package Array;
public class Array_Transpose
{
    void ArrayTranspose()
    {
        int array[][]={{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
        int i,j;
        System.out.println("The Matrix is");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("The Transpose of the above Matrix is");
         for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
