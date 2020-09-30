package Array;
import java.io.*;
public class Array_Sum_Int
{
    void ArraySum()throws IOException	
    {
        DataInputStream A=new DataInputStream(System.in);
        int in[]=new int[10];
        int s=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter your Marks Of all Subjects(10) one by one");
            in[i]=Integer.parseInt(A.readLine());
        }
        for(int j=0;j<10;j++)
        {
            s+=in[j];            
        }
        System.out.println("Sum of Your Marks is "+s);
    }
}
