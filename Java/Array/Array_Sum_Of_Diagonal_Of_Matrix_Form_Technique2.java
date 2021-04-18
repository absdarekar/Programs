package Array;
public class Array_Sum_Of_Diagonal_Of_Matrix_Form_Technique2
{
    void ArraySumOfDiagonalOfMatrixFormTechnique2()
    {
        int i,j,ld=0,rd=0,k=3;
        int array[][]={{1,2,3,4},{4,5,6,7},{7,8,9,0},{0,1,2,3}};
        System.out.println("The Matrix has Following Elements");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        for(i=0;i<4;i++)
        {
            ld=ld+array[i][i];
        }
        System.out.println("The Sum Of Left Diagonal is "+ld);
        for(i=0;i<4;i++)
        {
            rd=rd+array[i][k];
            k-=1;
        }
         System.out.println("The Sum Of Right Diagonal is "+rd);
    }
}
