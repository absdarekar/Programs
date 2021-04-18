package Array;
import java.util.*;
public class Array_Input_Int_DDA
{
    void ArrayInputIntDDA()
    {
        Scanner A=new Scanner(System.in);
        int in[][]=new int[2][5];
        int i,j;
        System.out.println("Enter Elements in 2 X 5 table");
        for(i=0;i<2;i++)
        {
            for(j=0;j<5;j++)
            {
                in[i][j]=A.nextInt();
            }            
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(in[i][j]+" ");
            }            
            System.out.println("");
        }
    }
}
