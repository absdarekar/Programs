package Operators;
public class RelationalAndTernoryOperators1
{
    public static void main(String atharv[])
    {
        int a,b;
        String A,B;
        String c,d,e,f,g,h;
        A="True";
        B="False";
        a=10;
        b=20;
        c=a<b?A:B;
        d=a>b?A:B;
        e=a<=b?A:B;
        f=a>=b?A:B;
        g=a==b?A:B;
        h=a!=b?A:B;
        System.out.println("If a=10 and b=20 then a<b is True or False? \n Answer \t"+c);
        System.out.println("If a=10 and b=20 then a>b is True or False? \n Answer \t"+d);
        System.out.println("If a=10 and b=20 then a<=b is True or False? \n Answer \t"+e);
        System.out.println("If a=10 and b=20 then a>=b is True or False? \n Answer \t"+f);
        System.out.println("If a=10 and b=20 then a==b is True or False? \n Answer \t"+g);
        System.out.println("If a=10 and b=20 then a!=b is True or False? \n Answer \t"+h);
    }
}

