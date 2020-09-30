package Constructor;
public class prime
{
    int n;
    prime()
    {
        n=0;
    }

    public void input(int x)
    {
        n=x;
    }

    void display()
    {
        int i=1,k=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                k++;
        }
        if(k==2)
            System.out.println("Its A Prime Number");
        else
            System.out.println("Its Not A Prime Number");
    }
}
