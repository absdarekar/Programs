package Array;
import java.io.*;
public class Array_Binary_Search2
{
    void ArrayBinarySearch2()throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Values to be Stored");
        int arrayrange=Integer.parseInt(A.readLine());
        int in[]=new int[arrayrange];
        int i,min,j,t;
        System.out.println("Enter the Values ");
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
