package Array;
import java.util.*;
public class Array_Matrix_Addition2
{
    void ArrayMatrixAddition2()
    {
        Scanner A=new Scanner(System.in);        
        System.out.println("Enter the size Of Matrix (Row X Colomn)");
        System.out.println("THE MATRIX SIZE OF BOTH THE MATRIX TO BE ADDED MUST BE SAME");   
        int row,colomn;
        row=A.nextInt();
        colomn=A.nextInt();
        int i,j;        
        int sum[][]=new int[row][colomn];
        int m1[][]=new int[row][colomn];
        int m2[][]=new int[row][colomn];                     
        System.out.println("Enter the First Matrix to be added");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                m1[i][j]=A.nextInt();
            }
            System.out.println("");
        }        
        System.out.println("Enter the Second Matrix to be added");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                m2[i][j]=A.nextInt();
            }
            System.out.println("");
        }
        System.out.println("The Matrix to be Added are");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println("");
        }        
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("The Addition is");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
