package CharacterManipulation;
import java.io.*;
public class toUpperCase 
{
    void toUpperCase()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("This is toUpperCase() Enter Character For Manipulation");
        System.out.println();
        char in=(char)(A.read());
        char char_test0 =Character.toUpperCase(in);
        System.out.println("The Enter Character to Upper Case "+char_test0);
        System.out.println();
    }
}
