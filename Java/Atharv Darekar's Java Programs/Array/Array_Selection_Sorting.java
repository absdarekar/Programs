package Array;
import java.io.*;
public class Array_Selection_Sorting
{
    void ArraySelectionSorting()throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Values to be Stored");
        int arrayrange=Integer.parseInt(A.readLine());
        int in[]=new int[arrayrange];
        System.out.println("Enter the Values to be Sorted");
        int i=0,t,min,j,max;
        for(i=0;i<arrayrange;i++)
        {
            in[i]=Integer.parseInt(A.readLine());
        }
        for(i=0;i<((in.length)-1);i++)
        {
            min=i;
            for(j=i+1;j<(in.length);j++)
            {
                if(in[j]<in[min])
                    min=j;
            }
            t=in[i];
            in[i]=in[min];
            in[min]=t;
        }
        System.out.println("The Elements are Arranged in Ascending Order");
        for(i=0;i<(in.length);i++)
        {
            System.out.print(in[i]+" ");
        }
        for(i=0;i<((in.length)-1);i++)
        {
            max=i;
            for(j=i+1;j<(in.length);j++)
            {
                if(in[j]>in[max])
                    max=j;
            }
            t=in[i];
            in[i]=in[max];
            in[max]=t;
        }
        System.out.println();
        System.out.println("The Elements are Arranged in Descending Order");
        for(i=0;i<(in.length);i++)
        {
            System.out.print(in[i]+" ");
        }
    }
}
