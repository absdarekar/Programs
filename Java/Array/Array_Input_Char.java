package Array;
import java.io.*;
public class Array_Input_Char
{
    void ArrayInputChar()throws IOException
    {
       DataInputStream A=new DataInputStream(System.in);
        char ch[]=new char[10];
        System.out.print("Enter 10 Characters ");
        for(int i=0;i<10;i++)
        {
            ch[i]=(char)(A.read());
        }
        for(int j=0;j<10;j++)
        {
            System.out.println("Your Entered 10 Characters are "+ch[j]);
        }
    }
}