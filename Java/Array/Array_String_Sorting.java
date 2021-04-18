package Array;
public class Array_String_Sorting
{
    void ArrayStringSorting()
    {
        String array[]={"Delhi","Banglore","Agra","Mumbai","Kolkata"};
        int i,j;
        String t;
        System.out.println("The Array Has Following Cities");
        for(i=0;i<4;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        for(i=0;i<array.length-1;i++)
        {
            for(j=(i+1);j<array.length;j++)
            {
                if(array[i].compareTo(array[j])>0)
                {
                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("The Array Sorted According to Initials");
        for(i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }     
    }
}
