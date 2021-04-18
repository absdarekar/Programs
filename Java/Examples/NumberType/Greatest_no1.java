package NumberType;
public class Greatest_no1
{
    public static void main(String atharv[])
    {
        double a,b,c;
        a=Double.parseDouble(atharv[0]);
        b=Double.parseDouble(atharv[1]);
        c=Double.parseDouble(atharv[2]);
        if(a>b)
        {
            if(a>c)
                System.out.println(a+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
        else
        {
            if(b>c)
                System.out.println(b+"\t is Greater Among The Given Numbers");
            else
                System.out.println(c+"\t is Greater Among The Given Numbers");
        }
    }
}

