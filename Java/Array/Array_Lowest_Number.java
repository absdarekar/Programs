package Array;
import java.util.*;
public class Array_Lowest_Number
{
    void ArrayLowestNumber()
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter any 10 Numbers");
        int in[]=new int[10];
        int min=0;
        for(int i=0;i<10;i++)
        {
            in[i]=A.nextInt();
            min=in[0];
            if(min>in[i])
                min=in[i];
        }
        System.out.println("The Lowest Number is "+min);
    }
}