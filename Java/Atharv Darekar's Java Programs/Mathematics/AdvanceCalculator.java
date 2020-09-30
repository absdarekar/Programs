package Mathematics;
import java.io.*;
import java.math.*;
public class AdvanceCalculator
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO ADVANCE CALCULATOR PROGRAMMED BY ATHARV DAREKAR");
        int k,m;
        double a,b,c,d,e,f,g,h,i,j,l,an,si,co,ta,cs,ct,sc,n,o,p;
        do
        {
            System.out.println("Choose an Operation");
            System.out.println("1.Addition of two numbers");
            System.out.println("2.Differnce between two numbers");
            System.out.println("3.Multiplication of two numbers");
            System.out.println("4.Division of two numbers");
            System.out.println("5.Remainder");
            System.out.println("6.Squre root of a number");
            System.out.println("7.Cube root of a number");
            System.out.println("8.Power of number");
            System.out.println("9.Trignometrical Ratios Of Angles");
            System.out.println("Press 10 for Exit");
            k=Integer.parseInt(A.readLine());
            switch (k)
            {
                case 1:
                System.out.println("Enter values for First number");
                a=Double.parseDouble(A.readLine());
                System.out.println("Enter values for Second number");
                b=Double.parseDouble(A.readLine());
                c=a+b;
                System.out.println("Addition of the two numbers is");
                System.out.println(c);
                break;
                case 2:
                System.out.println("Enter values for First number");
                a=Double.parseDouble(A.readLine());
                System.out.println("Enter values for Second number");
                b=Double.parseDouble(A.readLine());
                d=a-b;
                System.out.println("Differnce between the two numbers is");
                System.out.println(d);
                break;
                case 3:
                System.out.println("Enter values for First number");
                a=Double.parseDouble(A.readLine());
                System.out.println("Enter values for Second number");
                b=Double.parseDouble(A.readLine());
                e=a*b;
                System.out.println("Multiplication of the two numbers is");
                System.out.println(e);
                break;
                case 4:
                System.out.println("Enter values for Divisor");
                a=Double.parseDouble(A.readLine());
                System.out.println("Enter values for Divident");
                b=Double.parseDouble(A.readLine());
                f=a/b;
                System.out.println("Division of the two numbers");
                System.out.println(f);
                break;
                case 5:
                System.out.println("Enter values for Divisor");
                n=Double.parseDouble(A.readLine());
                System.out.println("Enter values for Divident");
                o=Double.parseDouble(A.readLine());
                p=n%o;
                System.out.println("Division of the two numbers");
                System.out.println(p);
                break;
                case 6:
                System.out.println("Enter a value");
                a=Double.parseDouble(A.readLine());
                g=Math.sqrt(a);
                System.out.println("The squre root of the value is");
                System.out.println(g);
                break;
                case 7:
                System.out.println("Enter a value");
                a=Double.parseDouble(A.readLine());
                System.out.println("The cube root of the value is");
                h=Math.pow(a,1/3);
                System.out.println(h);
                break;
                case 8:
                System.out.println("Enter values for Base");
                a=Double.parseDouble(A.readLine());
                System.out.println("Enter values for Power");
                b=Double.parseDouble(A.readLine());
                i=Math.pow(a,b);
                System.out.println(i);
                break;
                case 9:
                System.out.println("111.Sine of an Angle");
                System.out.println("222.Cos of an Angle");
                System.out.println("333.Tan of an Angle");
                m=Integer.parseInt(A.readLine());
                switch (m)
                {
                    case 111:
                    System.out.println("Enter Value For Angle");
                    an=Double.parseDouble(A.readLine());
                    si=(22.0/(7.0*180.0))*an;
                    System.out.println("Sine Vaue of Given Angle is\t"+Math.sin(si));
                    break;
                    case 222:
                    System.out.println("Enter Value For Angle");
                    an=Double.parseDouble(A.readLine());
                    co=(22.0/(7.0*180.0))*an;
                    System.out.println("Cos Vaue of Given Angle is\t"+Math.cos(co));
                    break;
                    case 333:
                    System.out.println("Enter Value For Angle");
                    an=Double.parseDouble(A.readLine());
                    ta=(22.0/(7.0*180.0))*an;
                    System.out.println("Tan Vaue of Given Angle is\t"+Math.tan(ta));
                    break;

                    default:
                    System.out.println("INVALID OPTION PLEASE TRY AGAIN");
                }
                break;
                case 10:
                System.out.println("THANK YOU!!");
                break;
                default:
                System.out.println("INVALID OPTION PLEASE TRY AGAIN");
            }
        }while(k!=10);
    }
}