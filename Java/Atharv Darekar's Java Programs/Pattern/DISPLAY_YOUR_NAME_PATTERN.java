package Pattern;
import java.util.*;
public class DISPLAY_YOUR_NAME_PATTERN
{
    public static void main(String atharv[])
    {
        int a,b;
        String st;
        Scanner A=new Scanner(System.in);
        System.out.println("TYPE THE WORD YOU WANT TO DISPLAY  ");
        st=A.nextLine();
        b=st.length();
        for(a=0;a<=b;a++)
        {
            System.out.println(st.substring(0,a));
        }
    }
}
