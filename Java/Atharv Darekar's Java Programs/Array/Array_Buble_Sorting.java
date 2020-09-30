package Array;
import java.io.*;
public class Array_Buble_Sorting
{
    void ArrayBubleSorting()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("Enter the Number of Array Elements");
        int length=Integer.parseInt(A.readLine());
        int array[]=new int[length];
        int i,j,t;
        System.out.println("Enter the Array Elements");
        for(i=0;i<length;i++)
        {
            array[i]=Integer.parseInt(A.readLine());
        }
        for(i=0;i<length-1;i++)
        {
            for(j=0;j<((length-1)-i);j++)
            {
                if(array[j]>array[j+1])
                {
                    t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        System.out.println("The Numbers are Arranged is Ascending Order");
        for(i=0;i<length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
