package NumberType;
import java.io.*;
public class ISBN_Number
{
    public static void main(String atharv[])throws IOException 
    {
        DataInputStream A=new DataInputStream(System.in);
        System.out.println("A Valid ISBN(International Standerd Book Number) is a 10 Digit Number Divisible by 11");
        System.out.println("Enter a ISBN Number");
        String inISBN=(A.readLine());
        int lISBN=inISBN.length();
        if(lISBN==10)
        {
            long intISBN=Long.parseLong(inISBN);
            if(intISBN%11==0)
                System.out.println("Valid ISBN Number");
            else
                System.out.println("Invalid ISBN Number");
        }
        else        
            System.out.println("Invalid ISBN Number");
    }
}