package Array;
import java.io.*;
public class Array_Binary_Search
{
    void ArrayBinarySearch() throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Values to be Stored");
        int arrayrange=Integer.parseInt(A.readLine());
        int in[]=new int[arrayrange];
        System.out.println("Enter the Values (in Ascending Order)");
        for(int i=0;i<arrayrange;i++)
        {
            in[i]=Integer.parseInt(A.readLine());
        }
        System.out.println("Enter a Value to be Searched");
        int search=Integer.parseInt(A.readLine());
        boolean k=false;
        int low=0,up=in.length-1,mid=0;
        while(low<=up)
        {
            mid=(low+up)/2;
            if(search==in[mid])
            {
                k=true;
                break;
            }
            else
            {
                if(search>in[mid])
                    low=mid+1;
                else
                    up=mid-1;
            }
        }
        if(k==true)
            System.out.println("Search Successful");
        else
            System.out.println("Search Unsuccessful");
    }
}
