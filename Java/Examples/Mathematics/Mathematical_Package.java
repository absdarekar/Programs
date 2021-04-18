package Mathematics;
public class Mathematical_Package
{
    public static void main (String atharv[])
    {
        double m=6.25;
        double n=8.75;
        System.out.println("The Output of the different Mathematical Function are:");
        System.out.println("Square root of 6.25="+Math.sqrt(m));
        System.out.println("Min value betwwen 6.25 and 8.75="+Math.min(m,n));
        System.out.println("Max value between 6.25 and 8.75="+Math.max(m,n));
        System.out.println("6.25 raised to the power 3="+Math.pow(m,3));
        System.out.println("Natural Log of 6.25="+Math.log(m));
        System.out.println("Absolute Value of (6.25-8.75)="+(float)Math.abs(m-n));
        System.out.println("Rounded value of 6.25="+Math.round(m));
        System.out.println("The floor value of 6.25="+Math.floor(m));
        System.out.println("The ceil value of 6.25="+Math.ceil(m));
        System.out.println("Truncated value of 6.25="+Math.rint(m));
        System.out.println("Exponent value of 6.25="+Math.exp(m));
    }
}