package Convertions;
import java.io.*;
public class Bin2DecConvertor
{
    public static void main(String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Number");
        String InputABinaryNumber=A.readLine();
        int inl=InputABinaryNumber.length();
        int dec=0,i;
        char charati;
        String charatis;
        for(i=0;i<inl;i++)
        {
            charati=InputABinaryNumber.charAt(i);
            charatis=Character.toString(charati);
            if((charatis).equals("1"))
                dec+=Math.pow(2,i);
        }
        System.out.println("The Decimal Number Equvivalent to The given Binary Number is "+dec);
    }
}