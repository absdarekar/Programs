package NumberType;
import java.io.*;
import java.util.*;
public class DuckNumber_
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        PrintWriter A1=new PrintWriter(System.out,true);
        A1.println("Enter A Number");
        String in=A.nextLine();
        int indexof0=in.indexOf("0");
        if(indexof0>0)
        A1.println("Duck Number");
        else
        A1.println("Not A Duck Number");
    }
}
