package Array;
import java.io.*;
public class Array_Reverse_Word
{
    void ArrayReverseWord()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("Enter A Words");
        String wordS=A.readLine();
        int ub=wordS.length();
        char word[]=new char[ub];
        int i;        
        for(i=0;i<ub;i++)
        {
            word[i]=wordS.charAt(i);
        }
        System.out.println("The Reverse String Is");
        for(i=ub-1;i>=0;i--)
        {
            System.out.print(word[i]);
        }
    }
}
