package Array;
public class Array_Magic_Square
{
    void ArrayMagicSquare()
    {
        int i,j,sum=0,sum1=0,dl=0,dr=0,k=2;
        int array[][]={{12,7,14},{13,11,9},{8,15,10}};
        System.out.println("The Matrix is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        for(i=0;i<3;i++)
        {
            dl+=array[i][i];
            dr+=array[i][k];
            k-=1;
            for(j=0;j<3;j++)
            {
                sum+=array[i][j];
                sum1+=array[j][i];            
            }            
            System.out.println("Sum Of Row "+(i+1)+" is "+sum);
            System.out.println("Sum Of Colomns "+(i+1)+" is "+sum1);
            System.out.println("");            
            sum=0;
            sum1=0;
        }
        System.out.println("Sum Of Left Diagonal is "+dl);
        System.out.println("Sum Of Right Diagonal is "+dr);
    }
}
