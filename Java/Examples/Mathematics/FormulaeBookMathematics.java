package Mathematics;
import java.io.*;
public class FormulaeBookMathematics
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader (new InputStreamReader(System.in));
        double p,r,t,si,ci,i,s1,s2,s3,l,b,h,hy,tsa,csa,lsa,s,v,c,a,p1,p2,d1,d2,d,ue,e,s123,eacha,n,amt;
        int opt,ch;
        System.out.println("WELCOME TO THE FORMULAE BOOK FOR MATHEMATICS PROGRAMMED BY ATHARV DAREKAR FOR MATHEMATICS");
        do
        {
            System.out.println("Choose Catagory");
            System.out.println("111.COMMERCIAL MATHEMATICS");
            System.out.println("222.GEOMETRY");
            System.out.println("333.MENSURATION");            
            System.out.println("Enter Your Choice");
            ch=Integer.parseInt(A.readLine());
            switch (ch)
            {
                case 111:
                {
                    System.out.println("COMMERCIAL MATHEMATICS");                
                    System.out.println("1.Simple Interest");
                    System.out.println("2.Compound Interest");
                    System.out.println("3.Amount");                
                    System.out.println("For EXIT Type 28");
                }
                break;
                case 222:
                {
                    System.out.println("GEOMETRY");                
                    System.out.println("4.Pythagoras Therome");
                    System.out.println("5.Angle Sum of Polgons");
                    System.out.println("6.Value of an Angle of equilateral Polgons");                
                    System.out.println("For EXIT Type 28");
                }
                break;
                case 333:
                {
                    System.out.println("MENSURATION");                
                    System.out.println("7.Area of Triangle (Herons Formuela)");
                    System.out.println("8.Area of Triangle (Right angle Triangle)");
                    System.out.println("9.Area of Triangle (Equilateral Triangle)");
                    System.out.println("10.Area of Triangle (Isosceles Triangle)");
                    System.out.println("11.Area of Quadrilaterals (Irregular)");
                    System.out.println("12.Area of Rectangle");
                    System.out.println("13.Area of Square");
                    System.out.println("14.Area of Parallelogram");
                    System.out.println("15.Area of Rhombus");
                    System.out.println("16.Area of Trapazium");
                    System.out.println("17.Area of Circle");
                    System.out.println("18.Circumferance of Circle");
                    System.out.println("19.Surface Area of Cuboid ");
                    System.out.println("20.Surface Area of Cube");
                    System.out.println("21.Surface Area of Cylinder");
                    System.out.println("22.Volume of Cuboid");
                    System.out.println("23.Volume of Cube");
                    System.out.println("24.Volume of Cylinder");
                    System.out.println("25.Latrel Surface Area of Cuboid");
                    System.out.println("26.Latrel Surface Area of Cube");
                    System.out.println("27.Curved Surface Area of Cylinder");
                    System.out.println("For EXIT Type 28");
                }
                break;
                default:
                System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
            }
            opt=Integer.parseInt(A.readLine());            
            switch (opt)
            {
                case 1:
                {
                    System.out.println("Enter a Value for Principal/Capital");
                    p=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Rate %(per annum)");
                    r=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Time span (year)");
                    t=Double.parseDouble(A.readLine());
                    si=p*r*t/100;
                    System.out.println("Simple Interest on the Given Data is Rs."+si);
                }
                break;
                case 2:
                {
                    System.out.println("Enter a Value for Principal/Capital");
                    p=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Rate %(per annum)");
                    r=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Time span (year)");
                    t=Double.parseDouble(A.readLine());
                    ci=(p*(Math.pow((100+r/100),t)))-p;
                    System.out.println("Compound Interest on the Given Data is Rs."+ci);
                }
                break;
                case 3:
                {
                    System.out.println("Enter a Value for Principle");
                    p=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Compound/Simple Interest");
                    i=Double.parseDouble(A.readLine());
                    amt=p+i;
                    System.out.println("Amount for the given Data is Rs."+amt);
                }
                break;
                case 4:
                {
                    int z;
                    System.out.println("1.To find Hypotenus");
                    System.out.println("2.To find Base");
                    System.out.println("3.To find Hight");
                    z=Integer.parseInt(A.readLine());
                    switch (z)
                    {
                        case 1:
                        {
                            System.out.println("Enter a value for Height");
                            h=Double.parseDouble(A.readLine());
                            System.out.println("Enter a value for Base");
                            b=Double.parseDouble(A.readLine());
                            hy=Math.sqrt((h*h+b*b));
                            System.out.println("Hypotenus of the Triangle for the Given value is "+hy);
                        }
                        break;
                        case 2:
                        {
                            System.out.println("Enter a value for Height");
                            h=Double.parseDouble(A.readLine());
                            System.out.println("Enter a value for Hypotenus");
                            hy=Double.parseDouble(A.readLine());
                            b=Math.sqrt((hy*hy-h*h));
                            System.out.println("Base of the Triangle for the Given value is "+b);
                        }
                        break;
                        case 3:
                        {
                            System.out.println("Enter a value for Hypotenus");
                            hy=Double.parseDouble(A.readLine());
                            System.out.println("Enter a value for Base");
                            b=Double.parseDouble(A.readLine());
                            h=Math.sqrt((hy*hy-b*b));
                            System.out.println("Height of the Triangle for the Given value is "+h);
                        }
                        break;
                        default:
                        {
                            System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                        }
                    }
                }
                break;
                case 5:
                {
                    System.out.println("Enter number of sides of the Polygon");
                    n=Double.parseDouble(A.readLine());
                    a=(2*n-4)*90;
                    System.out.println("Angle Sum of the Given Polygon is "+a+"*");
                }
                break;
                case 6:
                {
                    System.out.println("Enter number of sides of the Polygon");
                    n=Double.parseDouble(A.readLine());
                    eacha=((2*n-4)*90)/n;
                    System.out.println("Each angle of the Given Polygon measures "+eacha);
                }
                break;
                case 7:
                {
                    System.out.println("Enter a Value for side 1");
                    s1=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for side 2");
                    s2=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for side 3");
                    s3=Double.parseDouble(A.readLine());
                    s123=(s1+s2+s3)/2;
                    a=Math.sqrt((s123-s1)*(s123-s2)*(s123-s3));
                    System.out.println("The area of the Given Triangle is "+a);
                }
                break;
                case 8:
                {
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Base");
                    b=Double.parseDouble(A.readLine());
                    a=h*b*0.5;
                    System.out.println("The area of the Given Triangle is "+a);
                }
                break;
                case 9:
                {
                    System.out.println("Enter a Value for Side");
                    s=Double.parseDouble(A.readLine());
                    a=s*s*(Math.sqrt(3)/4);
                    System.out.println("The area of the Given Triangle is "+a);
                }
                break;
                case 10:
                {
                    System.out.println("Enter a Value for Equal Sides");
                    e=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Unequal Side");
                    ue=Double.parseDouble(A.readLine());
                    a=ue*0.25*Math.sqrt(e*e*4-ue*ue);
                    System.out.println("The area of the Given Triangle is "+a);
                }
                break;
                case 11:
                {
                    System.out.println("Enter a Value for Diagonal");
                    d=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for 1 Perpendicular to the Diagonal");
                    d1=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for 2 Perpendicular to the Diagonal");
                    d2=Double.parseDouble(A.readLine());
                    a=(d/2)*(d1+d2);
                    System.out.println("Area of the given Irregular Quadrilateral is "+a);
                }
                break;
                case 12:
                {
                    System.out.println("Enter a Value for Length");
                    l=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Breadth");
                    b=Double.parseDouble(A.readLine());
                    a=l*b;
                    System.out.println("Area of the given Rectangle is "+a);
                }
                break;
                case 13:
                {
                    System.out.println("Enter a Value for Side");
                    s=Double.parseDouble(A.readLine());
                    a=s*s;
                    System.out.println("Area of the given "+a);
                }
                break;
                case 14:
                {
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Base");
                    b=Double.parseDouble(A.readLine());
                    a=b*h;
                    System.out.println("Area of the given Parallelogram is "+a);
                }
                break;
                case 15:
                {
                    System.out.println("Enter a Value for Diagonal 1");
                    d1=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Diagonal 2");
                    d2=Double.parseDouble(A.readLine());
                    a=d1*d2*0.5;
                    System.out.println("Area of the given Rhombus is "+a);
                }
                break;
                case 16:
                {
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Parallel 1");
                    p1=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Parallel 2");
                    p2=Double.parseDouble(A.readLine());
                    a=(p1+p2)*h*0.5;
                    System.out.println("Area of the given Trapezium is "+a);
                }
                break;
                case 17:
                {
                    System.out.println("Enter a Value for Radius");
                    r=Double.parseDouble(A.readLine());
                    a=r*r*22/7;
                    System.out.println("Area of the given Circle is "+a);
                }
                break;
                case 18:
                {
                    System.out.println("Enter a Value for Radius");
                    r=Double.parseDouble(A.readLine());
                    c=r*2*22/7;
                    System.out.println("Circumference of the given Circle is "+c);
                }
                break;
                case 19:
                {
                    System.out.println("Enter a Value for Length");
                    l=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Breadth");
                    b=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    tsa=(l*b+l*h+b*h)*2;
                    System.out.println("Surface Area of the given Cuboid is "+tsa);
                }
                break;
                case 20:
                {
                    System.out.println("Enter a Value for Side");
                    s=Double.parseDouble(A.readLine());
                    tsa=s*s*6;
                    System.out.println("Surface Area of the give Cube is "+tsa);
                }
                break;
                case 21:
                {
                    System.out.println("Enter a Value for Radius");
                    r=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    tsa=r*(h+r)*2*22/7;
                    System.out.println("Surface Area of the given Cylinder is "+tsa);
                }
                break;
                case 22:
                {
                    System.out.println("Enter a Value for Length");
                    l=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Breadth");
                    b=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    v=l*b*h;
                    System.out.println("Volume of the given Cuiboid is "+v);
                }
                break;
                case 23:
                {
                    System.out.println("Enter a Value for Side");
                    s=Double.parseDouble(A.readLine());
                    v=s*s*s;
                    System.out.println("Volume of the given Cube is "+v);
                }
                break;
                case 24:
                {
                    System.out.println("Enter a Value for Radius");
                    r=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    v=r*r*h*22/7;
                    System.out.println("Volume of the given Cylinder is "+v);
                }
                break;
                case 25:
                {
                    System.out.println("Enter a Value for Length");
                    l=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Breadth");
                    b=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    lsa=(l+b)*h*2;
                    System.out.println("Latrel Surface Area of the given Cuboid is "+lsa);
                }
                break;
                case 26:
                {
                    System.out.println("Enter a Value for Side");
                    s=Double.parseDouble(A.readLine());
                    lsa=s*s*4;
                    System.out.println("Latrel Surface Area of the given is "+lsa);
                }
                break;
                case 27:
                {
                    System.out.println("Enter a Value for Radius");
                    r=Double.parseDouble(A.readLine());
                    System.out.println("Enter a Value for Height");
                    h=Double.parseDouble(A.readLine());
                    csa=r*h*2*22/7;
                    System.out.println("Curved Surface Area of the given is "+csa);
                }
                break;
                case 28:
                {
                    System.out.println("THANK YOU!!");
                }
                break;
                default:
                {
                    System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                }
            }
        }while(opt!=28);
    }
}
