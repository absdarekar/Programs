package Array;
import java.io.*;
public class Array_Input_Int2
{
    void ArrayInput2()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        int in[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter your Marks Of all Subjects(10) one by one");
        }
        for(int j=0;j<10;j++)
        {
            System.out.println("You Entered "+in[j]);
        }
    }
}
