package Operators;
public class RelationalOperators1
{
    public static void main(String atharv[])
    {
        int a,b;
        Boolean c,d,e,f,g,h;
        a=10;
        b=20;
        c=a<b;
        d=a>b;
        e=a<=b;
        f=a>=b;
        g=a==b;
        h=a!=b;
        System.out.println("If a=10 and b=20 then a<b is="+c);
        System.out.println("If a=10 and b=20 then a<b is="+d);
        System.out.println("If a=10 and b=20 then a<b is="+e);
        System.out.println("If a=10 and b=20 then a<b is="+f);
        System.out.println("If a=10 and b=20 then a<b is="+g);
        System.out.println("If a=10 and b=20 then a<b is="+h);
        System.out.println("If a=10 and b=20 then (a<b)&&(a>b) is="+(c&&d));
        System.out.println("If a=10 and b=20 then (a<b)&&(a>b) is="+(e||f));
        System.out.println("If a=10 and b=20 then (a<b)&&(a>b) is="+!(g));
        System.out.println("If a=10 and b=20 then (a<b)&&(a>b) is="+!(h));
    }
}