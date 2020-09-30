package Character_Manipulation;
import java.io.*;
public class Letter 
{   
    void Letter()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("This is Letter() Enter Character For Manipulation");
        System.out.println();
        char in5=(char)(A.read());
        boolean char_test5 =Character.isLetter(in5);
        if(char_test5==true)
            System.out.println("The Enter Character is a Letter");
            System.out.println();
        if(char_test5==false)
            System.out.println("The Enter Character is not a Letter");
            System.out.println();
    }
}

