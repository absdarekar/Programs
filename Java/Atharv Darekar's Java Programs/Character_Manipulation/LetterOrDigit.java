package Character_Manipulation;
import java.io.*;
public class LetterOrDigit 
{
    void LetterOrDigit()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("This is LetterOrDigit() Enter Character For Manipulation");
        System.out.println();
        char in3=(char)(A.read());
        boolean char_test3 =Character.isLetterOrDigit(in3);
        if(char_test3=true)
            System.out.println("The Enter Character is a Letter Or Digit");
            System.out.println();
        if(char_test3==false)
            System.out.println("The Enter Character is not a Letter Or Digit");
            System.out.println();
    }
}
