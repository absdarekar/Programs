package Miscellaneous;
import java.io.*;
public class MyProfile
{
    public static void main (String atharv[])throws IOException
    {
        String a,b;
        int c;    
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name");
        a=A.readLine();
        System.out.println("Class");
        b=A.readLine();
        System.out.println("Roll no.");
        c=Integer.parseInt(A.readLine());
    }
}
