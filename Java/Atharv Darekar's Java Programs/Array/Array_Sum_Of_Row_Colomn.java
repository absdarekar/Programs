package Array;
public class Array_Sum_Of_Row_Colomn
{
    void ArraySumOfRowColomn()
    {
        int array[][]={{1,2,3,4},{4,5,6,7},{7,8,9,0}};
        int i,j,sumr0=0,sumr1=0,sumr2=0,sumc0=0,sumc1=0,sumc2=0;
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
            sumr0+=array[0][i];
            sumr1+=array[1][i];
            sumr2+=array[2][i];
            sumc0+=array[i][0];
            sumc1+=array[i][1];
            sumc2+=array[i][2];           
        }
        System.out.println("The Sum Of");
        System.out.println("Row 1 is "+sumr0);
        System.out.println("Row 2 is "+sumr1);
        System.out.println("Row 3 is "+sumr2);
        System.out.println("Colomn 1 is "+sumc0);
        System.out.println("Colomn 2 is "+sumc1);
        System.out.println("Colomn 3 is "+sumc2);
    }
}
