package Constructor;
public class factorial
{
    int a;
    factorial()
    {
        int a=0;
    }

    public void intput(int m)
    {
        a=m;
    }

    public void display()
    {
        int i,f=1;
        for(i=1;i<=a;i++)
        {
            f*=i;
        }        
        System.out.println("Factorial Of "+a+" = "+f);
    }
}

