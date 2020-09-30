package Array;
import java.io.*;
public class Array_Sum_Of_Diagonal_Of_Matrix_Form_Left_Diagonal2
{
    void ArraySumOfDiagonalOfMatrixForm()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        int row,colomn;
        System.out.println("Enter the Size of Matrix (Row X Column)");
        row=Integer.parseInt(A.readLine());
        colomn=Integer.parseInt(A.readLine());
        int in[][]=new int[row][colomn];
        int i,j,sum=0;
        System.out.println("Enter "+(row*colomn)+" Elements");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                in[i][j]=Integer.parseInt(A.readLine());
            }
        }
        System.out.println("Thus the Table formd is");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                System.out.print(in[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Sum of Digonal of the table is ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colomn;j++)
            {
                if(i==j)
                sum+=in[i][j];
            }
        }
        System.out.print(sum);
    }
}