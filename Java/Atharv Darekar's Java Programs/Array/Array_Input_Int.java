package Array;
import java.io.*;
public class Array_Input_Int
{
    void ArrayInput()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        int in[]=new int[3];
        System.out.println("Enter Any 3 Number");
        for(int i=0;i<3;i++)
        {            
            in[i]=Integer.parseInt(A.readLine());
            System.out.println("You Entered "+in[i]);
        }
    }
}