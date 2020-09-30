package NumberType;
class Armstrong_1_to_1000
{
    public static void main (String atharv[])
    {
        for (int k=1;k<=1000;k++)
        {
            int n=k,d=0,s=0;
            while(n>0)
            {
                d = n % 10;
                s = s+(d * d * d);
                n = n/10;
            }
            if (s==k)
            {
                System.out.println (k+" is Armstrong number");
            }
        }
    }
}