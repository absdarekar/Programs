package NumberType;
public class PRODUCT_of_multiples7_100_200
{
    public static void main (String atharv[])
    {
        int i,d=0;
        for(i=100;i<200;i++)
        {
            if(i%7==0)
                d=i+i;

        }
        System.out.println("The Sum of All The Multiples Of Seven Between 100 to 200 is\t"+d);
    }
}