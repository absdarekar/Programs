package Array;
import java.io.*;
public class Array_Linear_Search
{
    void ArrayLinearSearch()throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 Elements");
        int in[]=new int[10];
        int k=0;
        for(int i=0;i<10;i++)
        {
            in[i]=Integer.parseInt(A.readLine());
        }
        System.out.println("Enter a Element to Search in the Given Set of Numbers");
        int search=Integer.parseInt(A.readLine());
        for(int j=0;j<10;j++)
        {
            if(search==in[j])
            k=1;
        }
        if(k==1)
        System.out.println("Search Successful ");
        else
        System.out.println("Search Unsuccessful ");
    }
}

                
