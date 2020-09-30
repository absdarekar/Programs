package Character_Manipulation;
import java.io.*;
public class Digit 
{
    void Digit()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("This is Digit() Enter Character For Manipulation");
        System.out.println();
        char in4=(char)(A.read());
        boolean char_test4 =Character.isDigit(in4);
        if(char_test4==true)
            System.out.println("The Enter Character is a Digit");
            System.out.println();
        if(char_test4==false)
            System.out.println("The Enter Character is not a Digit");
            System.out.println();
    }
}