package NumeralSystem;
import java.util.*;
public class Conversion_of_ASCIICharInput
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        int in;
        char ascii;
        System.out.println("Enter ASCII Code");
        in=A.nextInt();
        ascii=(char)(in);
        System.out.println("The Character Of The Given ASCII Code Is "+"'"+ascii+"'");
    }
}
