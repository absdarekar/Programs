package NumberType;
public class Random_Numbers_1_100
{
    public static void main(String atharv[])
    {
        System.out.println("Any Five Numbers Between 1 to 100");
        for(int i=1;i<=5;i++)
        {
            int r=(int)(Math.random()*(100-1))+1;
            System.out.println(r);
        }	
    }
}