package Character_Manipulation;
import java.io.*;
public class LowerCase 
{
    void LowerCase()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("This is LowerCase() Enter Character For Manipulation");
        System.out.println();
        char in1=(char)(A.read());
        boolean char_test1 =Character.isLowerCase(in1);
        if(char_test1==true)
            System.out.println("The Enter Character is a Lower Case");
            System.out.println();
        if(char_test1==false)
            System.out.println("The Enter Character is not a Lower Case");
            System.out.println();
    }
}