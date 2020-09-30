package Array;
import java.io.*;
public class Array_Input_String
{
    void ArrayInputString()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        String str[]=new String[10];
        System.out.println("Enter 10 Strings");
        for(int i=0;i<10;i++)
        {
            str[i]=(A.readLine());
        }
        for(int j=0;j<10;j++)
        {
            System.out.println("Your Entered 10 Strings are "+str[j]);
        }
    }
}
