import java.io.*;
public class FormulaeBookMathematics
{
    UpdateFormulaeBook obj=new UpdateFormulaeBook();
    BufferedReader A=new BufferedReader (new InputStreamReader(System.in));
    Wait obj1=new Wait();
    boolean flag=false;
    void FormulaeBookMathematics()throws IOException
    {
        try
        {
            double p,r,t,si,ci,i,s1,s2,s3,l,b,h,hy,tsa,csa,lsa,s,v,c,a,p1,p2,d1,d2,d,ue,e,s123,eacha,n,amt;
            String opt,ch;
            boolean ei=false;
            String eorc;
            System.out.println("");
            System.out.println("**********************************WELCOME TO FORMULAE BOOK OF MATHEMATICS PROGRAMMED BY ATHARV DAREKAR**********************************");
            System.out.println("");
            obj1.Wait1();
            do
            {
                System.out.println();
                System.out.println("SELECT CATEGORY");
                System.out.println("111.COMMERCIAL MATHEMATICS");
                System.out.println("222.ALGEBRA");
                System.out.println("333.CO-ORDINATE GEOMETRY");
                System.out.println("444.GEOMETRY");
                System.out.println("555.MENSURATION");
                System.out.println("666.STATISTICS");
                System.out.println("ENTER YOUR CHOICE");
                ch=(A.readLine());
                switch (ch)
                {
                    case "111":
                    {
                        System.out.println("COMMERCIAL MATHEMATICS");                
                        System.out.println("1.SIMPLE INTEREST");
                        System.out.println("2.COMPOUND INTEREST");
                        System.out.println("3.AMOUNT");
                    }
                    break;
                    case "222":
                    {
                        System.out.println("ALGEBRA");
                        System.out.println("42.QUADRATIC EQUATIONS");
                        System.out.println("43.MATRICE ADDITION");
                    }
                    break;
                    case "333":
                    {
                        System.out.println("CO-ORDINATE GEOMETRY");
                        System.out.println("41.EQUATION OF LINE");
                    }
                    break;
                    case "444":
                    {
                        System.out.println("GEOMETRY");                
                        System.out.println("4.PYTHAGORAS THEOREM");
                        System.out.println("5.ANGLE SUM OF POLYGONS");
                        System.out.println("6.VALUE OF AN ANGLE OF AN EQUILATERAL POLYGON");                
                    }
                    break;
                    case "555":
                    {
                        System.out.println("MENSURATION");                
                        System.out.println("7.AREA OF TRIANGLE (HERONS Formuela)");
                        System.out.println("8.AREA OF TRIANGLE (RIGHT ANGLED TRIANGLE)");
                        System.out.println("9.AREA OF TRIANGLE (EQUILATERAL TRIANGLE)");
                        System.out.println("10.AREA OF TRIANGLE (ISOSCELES TRIANGLE)");
                        System.out.println("11.AREA OF QUADRILATERAL (IRREGULAR)");
                        System.out.println("12.AREA OF RECTANGEL");
                        System.out.println("13.AREA OF SQARE");
                        System.out.println("14.AREA OF PARALLALOGRAM");
                        System.out.println("15.AREA OF RHOMBUS");
                        System.out.println("16.AREA OF TRAPEZIUM");
                        System.out.println("17.AREA OF CIRCLE");
                        System.out.println("18.AREA OF CONCENTRIC CIRCLE");
                        System.out.println("19.CIRCUMFERANCE OF CIRCLE");
                        System.out.println("20.SURFACE AREA OF CUBOID ");
                        System.out.println("21.SURFACE AREA OF CUBE");
                        System.out.println("22.SURFACE AREA OF CYLINDER");
                        System.out.println("23.VOLUME OF CUBOID");
                        System.out.println("24.VOLUME OF CUBE");
                        System.out.println("25.VOLUME OF CYLINDER");
                        System.out.println("26.LATREL SURFACE AREA OF CUBOID");
                        System.out.println("27.LATREL SURFACE AREA OF CUBE");
                        System.out.println("28.CURVED SURFACE AREA OF CYLINDER");
                        System.out.println("29.VOLUME OF CONE");
                        System.out.println("30.CURVED SURFACE AREA OF CONE");
                        System.out.println("31.TOTAL SURFACE AREA OF CONE");
                        System.out.println("32.VOLUME OF SPHERE");
                        System.out.println("33.SURFACE AREA OF SPHERE");
                        System.out.println("34.SPHERICAL SHELL");
                        System.out.println("35.VOLUME OF HEMISPHERE");
                        System.out.println("36.TOTAL SURFACE AREA OF HEMISPHERE");                
                    }
                    break;
                    case "666":
                    {
                        System.out.println("666.STATISTICS");
                        System.out.println("37.MEAN");
                        System.out.println("38.MEAN OF GROUPED DATA");
                        System.out.println("39.MEDIAN");
                        System.out.println("40.QUARTILE");
                    }
                    break;
                    default:
                    {
                        System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                        obj1.Wait1();
                        System.out.println("ENTER 'EXIT' AND PLEASE TRY AGAIN");                                       
                    }
                }
                opt=(A.readLine());            
                switch (opt)
                {
                    case "1":
                    {
                        System.out.println("ENTER VALUE FOR PRINCIPLE/CAPITAL");
                        p=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR RATE %(PER ANNUM)");
                        r=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR TIME SPAN (YEAR)");
                        t=Double.parseDouble(A.readLine());
                        si=p*r*t/100;
                        System.out.println("SIMPLE INTEREST Rs."+si);
                    }
                    break;
                    case "2":
                    {
                        System.out.println("ENTER VALUE FOR PRINCIPLE/CAPITAL");
                        p=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR RATE %(PER ANNUM)");
                        r=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR TIME SPAN (YEAR)");
                        t=Double.parseDouble(A.readLine());
                        ci=(p*(Math.pow((100+r/100),t)))-p;
                        System.out.println("COMPOUND INTEREST Rs."+ci);
                    }
                    break;
                    case "3":
                    {
                        System.out.println("ENTER VALUE FOR PRINCIPLE/CAPITAL");
                        p=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR COMPOUND/SIMPLE INTEREST");
                        i=Double.parseDouble(A.readLine());
                        amt=p+i;
                        System.out.println("AMOUNT Rs."+amt);
                    }
                    break;
                    case "4":
                    {
                        String z;
                        System.out.println("1.TO FIND HYPOTENUSE");
                        System.out.println("2.TO FIND BASE");
                        System.out.println("3.TO FIND HIGHT");
                        z=(A.readLine());
                        switch (z)
                        {
                            case "1":
                            {
                                System.out.println("ENTER VALUE FOR HEIGHT");
                                h=Double.parseDouble(A.readLine());
                                System.out.println("ENTER VALUE FOR BASE");
                                b=Double.parseDouble(A.readLine());
                                hy=Math.sqrt((h*h+b*b));
                                System.out.println("HYPOTENUSE OF THE TRIANGLE "+hy);
                            }
                            break;
                            case "2":
                            {
                                System.out.println("ENTER VALUE FOR HEIGHT");
                                h=Double.parseDouble(A.readLine());
                                System.out.println("ENTER VALUE FOR Hypotenus");
                                hy=Double.parseDouble(A.readLine());
                                b=Math.sqrt((hy*hy-h*h));
                                System.out.println("BASE OF THE TRIANGLE "+b);
                            }
                            break;
                            case "3":
                            {
                                System.out.println("ENTER VALUE FOR Hypotenus");
                                hy=Double.parseDouble(A.readLine());
                                System.out.println("ENTER VALUE FOR BASE");
                                b=Double.parseDouble(A.readLine());
                                h=Math.sqrt((hy*hy-b*b));
                                System.out.println("HEIGHT OF THE TRIANGLE "+h);
                            }
                            break;
                            default:
                            {
                                System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                                obj1.Wait1();
                            }
                        }
                    }
                    break;
                    case "5":
                    {
                        System.out.println("ENTER NUMBER OF SIDES OF THE POLYGON");
                        n=Double.parseDouble(A.readLine());
                        a=(2*n-4)*90;
                        System.out.println("ANGLE SUM OF THE POLYGON "+a+"*");
                    }
                    break;
                    case "6":
                    {
                        System.out.println("ENTER NUMBER OF SIDES OF THE POLYGON");
                        n=Double.parseDouble(A.readLine());
                        eacha=((2*n-4)*90)/n;
                        System.out.println("EACH ANGLE OF THE MEASURES "+eacha);
                    }
                    break;
                    case "7":
                    {
                        System.out.println("ENTER VALUE FOR SIDE 1");
                        s1=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR SIDE 2");
                        s2=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR SIDE 3");
                        s3=Double.parseDouble(A.readLine());
                        s123=(s1+s2+s3)/2;
                        a=Math.sqrt((s123-s1)*(s123-s2)*(s123-s3));
                        System.out.println("THE AREA OF THE TRIANGLE "+a);
                    }
                    break;
                    case "8":
                    {
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR BASE");
                        b=Double.parseDouble(A.readLine());
                        a=h*b*0.5;
                        System.out.println("THE AREA OF THE TRIANGLE "+a);
                    }
                    break;
                    case "9":
                    {
                        System.out.println("ENTER VALUE FOR SIDE");
                        s=Double.parseDouble(A.readLine());
                        a=s*s*(Math.sqrt(3)/4);
                        System.out.println("THE AREA OF THE TRIANGLE "+a);
                    }
                    break;
                    case "10":
                    {
                        System.out.println("ENTER VALUE FOR EQUAL SIDES");
                        e=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR UNEQUAL SIDE");
                        ue=Double.parseDouble(A.readLine());
                        a=ue*0.25*Math.sqrt(e*e*4-ue*ue);
                        System.out.println("THE AREA OF THE  TRIANGLE "+a);
                    }
                    break;
                    case "11":
                    {
                        System.out.println("ENTER VALUE FOR DIAGONAL");
                        d=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR 1 PERPENDICUALR TO THE DIAGONAL");
                        d1=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR 2 PERPENDICUALR TO THE DIAGONAL");
                        d2=Double.parseDouble(A.readLine());
                        a=(d/2)*(d1+d2);
                        System.out.println("AREA OF THE IRREGUAL QUADRILATERAL "+a);
                    }
                    break;
                    case "12":
                    {
                        System.out.println("ENTER VALUE FOR LENGHT");
                        l=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR BREADTH");
                        b=Double.parseDouble(A.readLine());
                        a=l*b;
                        System.out.println("AREA OF THE RECTANGLE "+a);
                    }
                    break;
                    case "13":
                    {
                        System.out.println("ENTER VALUE FOR SIDE");
                        s=Double.parseDouble(A.readLine());
                        a=s*s;
                        System.out.println("AREA OF THE SQUARE"+a);
                    }
                    break;
                    case "14":
                    {
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR BASE");
                        b=Double.parseDouble(A.readLine());
                        a=b*h;
                        System.out.println("AREA OF THE PARALLELOGRAM "+a);
                    }
                    break;
                    case "15":
                    {
                        System.out.println("ENTER VALUE FOR DIAGONAL 1");
                        d1=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR DIAGONAL 2");
                        d2=Double.parseDouble(A.readLine());
                        a=d1*d2*0.5;
                        System.out.println("AREA OF THE RHOMBUS "+a);
                    }
                    break;
                    case "16":
                    {
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR PARALLEL 1");
                        p1=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR PARALLEL 2");
                        p2=Double.parseDouble(A.readLine());
                        a=(p1+p2)*h*0.5;
                        System.out.println("AREA OF THE TRAPEZIUM "+a);
                    }
                    break;
                    case "17":
                    {
                        System.out.println("ENTER VALUE FOR RADIUS");
                        r=Double.parseDouble(A.readLine());
                        a=r*r*22/7;
                        System.out.println("AREA OF THE CIRCLE "+a);
                    }
                    break;
                    case "18":
                    {
                        obj.AreaOfConcentricCircles();
                    }
                    break;        
                    case "19":
                    {
                        System.out.println("ENTER VALUE FOR RADIUS");
                        r=Double.parseDouble(A.readLine());
                        c=r*2*22/7;
                        System.out.println("CIRCUMFERANCE OF THE CIRCLE "+c);
                    }
                    break;
                    case "20":
                    {
                        System.out.println("ENTER VALUE FOR LENGHT");
                        l=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR BREADTH");
                        b=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        tsa=(l*b+l*h+b*h)*2;
                        System.out.println("SURFACE AREA OF THE CUBOID "+tsa);
                    }
                    break;
                    case "21":
                    {
                        System.out.println("ENTER VALUE FOR SIDE");
                        s=Double.parseDouble(A.readLine());
                        tsa=s*s*6;
                        System.out.println("SURFACE AREA OF THE CUBE "+tsa);
                    }
                    break;
                    case "22":
                    {
                        System.out.println("ENTER VALUE FOR RADIUS");
                        r=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        tsa=r*(h+r)*2*22/7;
                        System.out.println("SURFACE AREA OF THE CYLINDER "+tsa);
                    }
                    break;
                    case "23":
                    {
                        System.out.println("ENTER VALUE FOR LENGHT");
                        l=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR BREADTH");
                        b=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        v=l*b*h;
                        System.out.println("VOLUME OF THE CUBOID "+v);
                    }
                    break;
                    case "24":
                    {
                        System.out.println("ENTER VALUE FOR SIDE");
                        s=Double.parseDouble(A.readLine());
                        v=s*s*s;
                        System.out.println("VOLUME OF THE CUBE "+v);
                    }
                    break;
                    case "25":
                    {
                        System.out.println("ENTER VALUE FOR RADIUS");
                        r=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        v=r*r*h*22/7;
                        System.out.println("VOLUME OF THE CYLINDER "+v);
                    }
                    break;
                    case "26":
                    {
                        System.out.println("ENTER VALUE FOR LENGTH");
                        l=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR BREADTH");
                        b=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        lsa=(l+b)*h*2;
                        System.out.println("LATREL SURFACE AREA OF THE CUBOID "+lsa);
                    }
                    break;
                    case "27":
                    {
                        System.out.println("ENTER VALUE FOR SIDE");
                        s=Double.parseDouble(A.readLine());
                        lsa=s*s*4;
                        System.out.println("LATERAL SURFACE AREA OF THE CUBE "+lsa);
                    }
                    break;
                    case "28":
                    {
                        System.out.println("ENTER VALUE FOR RADIUS");
                        r=Double.parseDouble(A.readLine());
                        System.out.println("ENTER VALUE FOR HEIGHT");
                        h=Double.parseDouble(A.readLine());
                        csa=r*h*2*22/7;
                        System.out.println("CURVED SURFACE AREA OF THE CYLINDER "+csa);
                    }
                    break;              
                    case "29":
                    {
                        obj.VolumeOfCone();
                    }
                    break;
                    case "30":
                    {
                        obj.CurvedSurfaceAreaCone();
                    }
                    break;
                    case "31":
                    {
                        obj.TotalSurfaceAreaCone();
                    }
                    break;
                    case "32":
                    {
                        obj.VolumeOfSphere();                
                    }
                    break;
                    case "33":
                    {
                        obj.SurfaceAreaOfSphere();
                    }
                    break;
                    case "34":
                    {
                        obj.SphericalShell();
                    }
                    break;
                    case "35":
                    {
                        obj.VolumeOfHemisphere();
                    }
                    break;
                    case "36":
                    {
                        obj.TotalSurfaceAreaHemisphere();
                    }
                    break;
                    case "37": 
                    {
                        obj.Mean();
                    }
                    break;
                    case "38":
                    {
                        obj.MeanOfGroupedData();
                    }
                    break;
                    case "39":
                    {
                        obj.Median();
                    }
                    break;
                    case "40":
                    {
                        obj.Quartile();
                    }
                    break;
                    case "41":
                    {
                        obj.EquationOfLine();
                    }
                    break;
                    case "42":
                    {
                        obj.Discriminant();
                    }
                    break;
                    case "43":
                    {
                        obj.MatrixAddition();
                    }
                    break;                    
                    case "EXIT":
                    {
                        ei=true;
                    }
                    break;
                    default:
                    {
                        System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                        obj1.Wait1();
                    }
                }
                System.out.println("PRESS 'ENTER' TO CONTINUE ELSE ENTER 'EXIT' TO EXIT FORMULAE BOOK OF MATHEMATICS");
                eorc=A.readLine();
                if(eorc.equals("EXIT"))
                    ei=true;
            }while(ei==false);        
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait1();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait1();
                System.out.println("ERROR RESOLVED");
                obj1.Wait1();              
            }
        }
    }
}