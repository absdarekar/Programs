package CharacterManipulation;
import java.io.*;
public class toLowerCase 
{  
    void toLowerCase()throws IOException
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("This is toLowerCase() Enter Character For Manipulation");
        System.out.println();
        char in6=(char)(A.read());
        char char_test6 =Character.toLowerCase(in6);
        System.out.println("The Enter Character to Lower Case "+char_test6);
        System.out.println();
    }
}