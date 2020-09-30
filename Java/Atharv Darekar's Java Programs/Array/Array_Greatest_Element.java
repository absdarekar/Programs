package Array;
import java.util.*;
public class Array_Greatest_Element
{
    void ArrayGreatestElement()
    {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter any 10 Numbers");
        int in[]=new int[10];
        int max=0;
        for(int i=0;i<10;i++)
        {
            in[i]=A.nextInt();
            if(max<in[i])
                max=in[i];
        }
        System.out.println("The Greatest Number is "+max);
    }
}