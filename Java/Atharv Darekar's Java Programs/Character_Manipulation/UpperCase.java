package Character_Manipulation;
import java.io.*;
public class UpperCase 
{
    void UpperCase()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("This is UpperCase() Enter Character For Manipulation");
        System.out.println();
        char in2=(char)(A.read());
        boolean char_test2 =Character.isUpperCase(in2);
        if(char_test2==true)
            System.out.println("The Enter Character is a Upper Case");
            System.out.println();
        if(char_test2==false)
            System.out.println("The Enter Character is not a Upper Case");
            System.out.println();
    }
}
