package Geometry;
public class Circle
{
    public static void main(String atharv[])
    {
        int r1=14,r2=21;
        double ar,ar1,ar2,c1,c2;
        ar1=22/7*r1*r1;
        ar2=22/7*r2*r2;
        ar=ar2-ar1;
        c1=2*22/7*r1;
        c2=2*22/7*r2;
        System.out.println("The Inner Area ="+ar1);
        System.out.println("The Outer Area ="+ar2);
        System.out.println("The Area of Ring ="+ar);
        System.out.println("The Inner Circumferance ="+c1);
        System.out.println("The outer Circumferance ="+c2);
    }
}