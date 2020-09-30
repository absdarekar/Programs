package Mathematics;
import java.util.*;
import java.io.*;
public class Product_Matrix
{
    public static void main(String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        int r1=0,c1=0,r2=0,c2=0;
        String in;
        System.out.println("Enter Order of First Matrix (Ex. 2 X 2)");
        in=A.readLine();
        Scanner order1=new Scanner(in).useDelimiter("\\s*X\\s*");
        r1=order1.nextInt();
        c1=order1.nextInt();
        System.out.println("");
        System.out.println("Enter Order of Second Matrix (Ex. 2 X 3)");
        Scanner order2=new Scanner(in).useDelimiter("\\s*X\\s*");
        in=A.readLine();
        r2=order2.nextInt();
        c2=order2.nextInt();               
    }
}
