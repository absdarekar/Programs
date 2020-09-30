import java.io.*;
import java.util.*;
public class UpdateFormulaeBook
{
    DataInputStream A=new DataInputStream(System.in);
    Scanner A1=new Scanner(System.in);
    PrintWriter A2=new PrintWriter(System.out,true);
    Wait obj1=new Wait();
    double pi=((22/7)+(355/113))/2;
    boolean flag=false;
    void VolumeOfSphere()throws IOException
    {
        try
        {
            double r,vol;       
            System.out.println("ENTER RADIUS OF THE SPHERE");
            r=Double.parseDouble(A.readLine());
            vol=pi*r*r*r*4/3;
            System.out.println("THE VOLUME THE GIVEN SPHERE "+vol);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void VolumeOfCone()throws IOException
    {
        try
        {
            double r,h,vol;
            System.out.println("ENTER RADIUS OF THE BASE OF THE CONE");
            r=Double.parseDouble(A.readLine());
            System.out.println("ENTER THE HEIGHT OF THE CONE");
            h=Double.parseDouble(A.readLine());
            vol=pi*r*r*1/3*h;
            System.out.println("THE VOLUME THE GIVEN SPHERE "+vol);        
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void CurvedSurfaceAreaCone()throws IOException
    {
        try
        {
            double ar,l,r;
            System.out.println("ENTER RADIUS OF THE BASE OF THE CONE");
            r=Double.parseDouble(A.readLine());
            System.out.println("ENTER THE SLANT HEIGHT OF THE CONE");
            l=Double.parseDouble(A.readLine());
            ar=pi*r*l;
            System.out.println("CURVED SURFACE AREA OF THE GIVEN CONE "+ar);        
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void SurfaceAreaOfSphere()
    {
        try
        {
            double ar,r;
            System.out.println("ENTER RADIUS OF THE SPHERE");
            r=A1.nextDouble();
            ar=pi*r*r*4;
            System.out.println("THE SURFACE AREA OF THE GIVEN SPHERE "+ar);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void TotalSurfaceAreaCone()throws IOException
    {
        try
        {
            double ar,l,r;
            System.out.println("ENTER RADIUS OF THE BASE OF THE CONE");
            r=Double.parseDouble(A.readLine());
            System.out.println("ENTER THE HEIGHT OF THE CONE");
            l=Double.parseDouble(A.readLine());
            ar=pi*r*(l+r);
            System.out.println("THE VOLUME THE GIVEN SPHERE "+ar);        
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void VolumeOfHemisphere()throws IOException
    {
        try
        {
            double r,vol;
            System.out.println("ENTER RADIUS OF THE HEMISPHERE OF SPHERE");
            r=Double.parseDouble(A.readLine());
            vol=pi*r*r*r*2/3;
            System.out.println("THE GIVEN HEMISPHERE OF SPHERE "+vol);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }      
    }

    void TotalSurfaceAreaHemisphere()throws IOException
    {
        try
        {
            double r,ar;
            System.out.println("ENTER RADIUS OF THE HEMISPHERE OF SPHERE");
            r=Double.parseDouble(A.readLine());
            ar=3*pi*r*r;
            System.out.println("THE TOTAL SURFACE AREA OF THE GIVEN HEMISPHERE OF SPHERE "+ar);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void SphericalShell()throws IOException
    {
        try
        {
            double R,r,vol;       
            System.out.println("ENTER RADIUS OF THE OUTER SPHERE");
            R=Double.parseDouble(A.readLine());
            System.out.println("ENTER RADIUS OF THE INNER SPHERE");
            r=Double.parseDouble(A.readLine());
            vol=pi*((R*R*R)-(r*r*r))*4/3;
            System.out.println("THE VILUME OF THE MATERIAL "+vol);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void AreaOfConcentricCircles() throws IOException
    {
        try
        {
            double R,r,ar;
            System.out.println("ENTER RADIUS OF THE OUTER CIRCLE");
            R=Double.parseDouble(A.readLine());
            System.out.println("ENTER RADIUS OF THE INNER CIRCLE");
            r=Double.parseDouble(A.readLine());
            ar=pi*((R*R)-(r*r));
            System.out.println("THE AREA INCLOSED BETWEEN THE TWO CONCENTRIC CIRCLES "+ar);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void Mean() throws IOException
    {
        try
        {
            System.out.println("ENTER THE NUMBER OF OBSERVATIONS");
            int obs=Integer.parseInt(A.readLine());
            double array[]=new double[obs];
            double sum=0,avg;
            int i;
            System.out.println("ENTER EACH OBSERVATION ONE BY ONE");
            for(i=0;i<obs;i++)
            {
                array[i]=Integer.parseInt(A.readLine());
            }
            for(i=0;i<obs;i++)
            {
                sum+=array[i];
            }
            avg=sum/obs;
            System.out.println("THE ARITHEMATICAL MEAN / AVERAGE OF THE GIVEN OBSERVATION "+avg);

        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void Median()
    {
        try
        {
            System.out.println("ENTER THE NUMBER OF OBSERVATIONS");
            int obs=A1.nextInt();
            int i,j;
            double t=0,median;
            double array[]=new double[obs];
            System.out.println("ENTER THE NUMBERS");
            for(i=0;i<obs;i++)
            {
                array[i]=A1.nextInt();
            }
            for(i=0;i<obs-1;i++)
            {
                for(j=0;j<((obs-1)-i);j++)
                {
                    if(array[j]>array[j+1])
                    {
                        t=array[j];
                        array[j]=array[j+1];
                        array[j+1]=t;
                    }
                }
            }
            if(obs%2==0)
            {
                median=((array[((obs-1)/2)]+array[((obs+1)/2)])/2);
            }
            else
            {
                median=array[obs/2];
            }
            System.out.println("THE MEDIAN OF THE GIVEN DATA "+median);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void Quartile()throws IOException
    {
        try
        {        
            System.out.println("ENTER THE NUMBER OF OBSERVATIONS");
            int obs=Integer.parseInt(A.readLine());
            int i,j;
            double t=0,Q2=0;
            int Q1,Q3;
            double array[]=new double[obs];
            System.out.println("ENTER THE NUMBERS");
            for(i=0;i<obs;i++)
            {
                array[i]=A1.nextInt();
            }
            for(i=0;i<obs-1;i++)
            {
                for(j=0;j<((obs-1)-i);j++)
                {
                    if(array[j]>array[j+1])
                    {
                        t=array[j];
                        array[j]=array[j+1];
                        array[j+1]=t;
                    }
                }
            }
            if(obs%2==0)
            {            
                Q1=((obs+1)/4)-1;
                Q3=(((obs+1)*3)/4)-1;
                Q2=array[Q3]-array[Q1];
            }
            else
            {
                Q1=(obs)/4;
                Q3=(3*(obs)/4);
                Q2=array[Q3]-array[Q1];
            }
            System.out.println("THE UPPER QUARTILE "+array[Q3]);
            System.out.println("THE LOWER QUARTILE "+array[Q1]);
            System.out.println("THE INTER-QUARTILE "+Q2);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void MeanOfGroupedData()
    {
        try
        {
            int colomn,row,i,j;
            double mean,sum_product_fx=0,sum_f=0;
            String dataoption;
            row=2;
            System.out.println("ENTER THE TYPE OF DATA");
            System.out.println("1.UNGROUPED DATA");
            System.out.println("2.GROUPED CONTINIOUS DATA");
            System.out.println("3.GROUPED DISCONTINIOUS DATA");
            dataoption=A1.nextLine();
            switch(dataoption)
            {
                case "1":
                {
                    System.out.println("ENTER THE NUMBER OF COLOMN OF TABLE OF THE DATA COLOMN (HERE ARE 2 ROWS 1 AS CLASS AND 2 AS FREQUENCY)");
                    System.out.println("Ex.");
                    String ex[][]={{"CLASS    ","5","6","7","8","9"},{"FREQUENCY","4","5","3","6","2"}};
                    System.out.println("HERE ARE 5 COLOMN");
                    for(i=0;i<2;i++)
                    {
                        for(j=0;j<6;j++)
                        {
                            System.out.print(ex[i][j]+"\t");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.println("ENTER THE VALUE");
                    colomn=A1.nextInt();
                    double arraytable[][]=new double[row][colomn];
                    System.out.println("ENTER THE CLASS IN THE SERIES");
                    for(i=0;i<row;i++)
                    {
                        for(j=0;j<colomn;j++)
                        {
                            arraytable[i][j]=A1.nextDouble();
                        }
                        if(i==0)
                        System.out.println("ENTER THE FREQUENCY IN THE SAME SERIES AS THE CLASS");
                    }
                    for(i=0;i<colomn;i++)
                    {
                        sum_product_fx+=((arraytable[0][i])*(arraytable[1][i]));
                        sum_f+=arraytable[1][i];
                    }
                    mean=sum_product_fx/ sum_f;
                    System.out.println("THE MEAN OF GIVEN DATA "+mean);
                }
                break;
                case "2":
                {
                    System.out.println("ENTER THE NUMBER OF COLOMN OF TABLE OF DATA COLOMN (HERE ARE 2 ROWS 1 AS CLASS AND 2 AS FREQUENCY)");
                    System.out.println("Ex.");
                    String ex[][]={{"CLASS INTERVAL","5 10","10 15","15 20","20 25","25 30"},{"FREQUENCY     ","4","5","3","6","2"}};
                    System.out.println("HERE ARE 5 COLOMN");
                    for(i=0;i<2;i++)
                    {
                        for(j=0;j<6;j++)
                        {
                            System.out.print(ex[i][j]+"\t");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.println("ENTER THE VALUE");
                    colomn=A1.nextInt();
                    double classintervel[][]=new double[colomn][2];
                    double frequency[]=new double[colomn];
                    System.out.println("ENTER THE CLASS INTERVAL");
                    for(i=0;i<colomn;i++)
                    {
                        for(j=0;j<2;j++)
                        {
                            classintervel[i][j]=A1.nextDouble();
                        }
                        System.out.println("");
                    }
                    System.out.println("ENTER THE FREQUENCY SERIALY AS THE CLASS INTERVALS ARE ENTERED");
                    System.out.println("");
                    for(i=0;i<colomn;i++)
                    {
                        frequency[i]=A1.nextDouble();                   
                    }
                    for(i=0;i<colomn;i++)
                    {
                        sum_product_fx+=(((classintervel[i][0]+classintervel[i][1])/2)*frequency[i]);
                        sum_f+=frequency[i];
                    }
                    mean=sum_product_fx/sum_f;
                    System.out.println("THE MEAN OF GIVEN DATA IS "+mean);
                }                
                break;
                case "3":
                {                
                    System.out.println("ENTER THE NUMBER OF COLOMN OF TABLE OF DATA COLOMN (HERE ARE 2 ROWS 1 AS CLASS AND 2 AS FREQUENCY)");
                    System.out.println("Ex.");
                    String ex[][]={{"CLASS INTERVALS","5 10","15 20","25 30","35 40","45 50"},{"FREQUENCY     ","4","5","3","6","2"}};
                    System.out.println("HERE ARE 5 COLOMN");
                    for(i=0;i<2;i++)
                    {
                        for(j=0;j<6;j++)
                        {
                            System.out.print(ex[i][j]+"\t");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.println("ENTER THE VALUE");
                    colomn=A1.nextInt();
                    double classintervel[][]=new double[colomn][2];
                    double frequency[]=new double[colomn];
                    System.out.println("ENTER THE CLASS INTERVALS");
                    for(i=0;i<colomn;i++)
                    {
                        for(j=0;j<2;j++)
                        {
                            classintervel[i][j]=A1.nextDouble();
                        }
                        System.out.println("");
                    }
                    double intervel=(classintervel[0][1]-classintervel[1][1])/2;
                    for(i=0;i<colomn;i++)
                    {                    
                        classintervel[i][0]=((classintervel[i][0])+intervel);
                        classintervel[i][1]=((classintervel[i][1])-intervel);                    
                    }
                    System.out.println("ENTER THE FREQUENCY SERIALY AS THE CLASS INTERVALS ARE ENTERED");
                    System.out.println("");
                    for(i=0;i<colomn;i++)
                    {
                        frequency[i]=A1.nextDouble();                   
                    }                
                    for(i=0;i<colomn;i++)
                    {
                        sum_product_fx+=(((classintervel[i][0]+classintervel[i][1])/2)*frequency[i]);
                        sum_f+=frequency[i];
                    }
                    mean=sum_product_fx/sum_f;
                    System.out.println("THE MEAN OF GIVEN DATA "+mean);
                }
                break;
                default:
                System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                obj1.Wait1();
            }
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void EquationOfLine()throws IOException
    {
        try
        {
            System.out.println("ENTER THE VALUE OF\nm (SLOPE),\nx (CO-ORDINATE),\nc (y-INTERCEPT),\ny (CO-ORDINATE)\nAND THE VALUE TO BE CALCULATED AS '?'");
            String mxcy[]=new String[4];
            int i;
            char Smat0,Sxat0,Scat0,Syat0;
            double m=0,x=0,c=0,y=0;
            boolean flagm=false,flagx=false,flagc=false,flagy=false;
            for(i=0;i<4;i++)
            {
                if(i==0)
                    System.out.print("m=");
                if(i==1)
                    System.out.print("x=");
                if(i==2)
                    System.out.print("c=");
                if(i==3)
                    System.out.print("y=");
                mxcy[i]=(A.readLine());
            }
            Smat0=mxcy[0].charAt(0);
            Sxat0=mxcy[1].charAt(0);
            Scat0=mxcy[2].charAt(0);
            Syat0=mxcy[3].charAt(0);
            flagm=Character.isDigit(Smat0);
            flagx=Character.isDigit(Sxat0);
            flagc=Character.isDigit(Scat0);
            flagy=Character.isDigit(Syat0);
            if(flagm==true)
                m=Double.parseDouble(mxcy[0]);
            if(flagx==true)
                x=Double.parseDouble(mxcy[1]);
            if(flagc==true)
                c=Double.parseDouble(mxcy[2]);
            if(flagy==true)
                y=Double.parseDouble(mxcy[3]);
            if((flagm==true)&&(flagx==true)&&(flagc==true)&&(flagy==false))
            {
                y=(m*x)+c;
                System.out.println("CO=ORDINATE y= "+y);
            }
            if((flagm==false)&&(flagx==true)&&(flagc==true)&&(flagy==true))
            {
                m=(y-c)/x;            
                System.out.println("SLOPE m= "+m);
            }
            if((flagm==true)&&(flagx==false)&&(flagc==true)&&(flagy==true))
            {
                x=(y-c)/m;
                System.out.println("CO-ORDINATE x= "+x);
            }
            if((flagm==true)&&(flagx==true)&&(flagc==false)&&(flagy==true))
            {
                c=y-(m*x);
                System.out.println("y-INTERCEPT c= "+c);
            }        
            System.out.println("EQUATION OF LINE "+"y = "+m+" x "+" + "+c);
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }

    void Discriminant()
    {
        try
        {
            Scanner A=new Scanner(System.in);
            double a,b,c,dis,r1,r2;
            System.out.println("ENTER THE VALUE FOR VARIEABLE a,b,c TO KNOW THE ROOTS OF THE QUADRATIC EQUATION \ni.e. ax2+bx+c=0");
            System.out.print("a=");
            a=A.nextDouble();
            System.out.print("b=");
            b=A.nextDouble();
            System.out.print("c=");
            c=A.nextDouble();
            dis=b*b-(4*a*c);
            if(dis>0)
                System.out.println("THE ROOTS ARE REAL AND UNEQUAL");
            if(dis<0)
                System.out.println("THE ROOTS ARE IMAGNARY");
            if(dis==0)
                System.out.println("THE ROOTS ARE REAL AND EQUAL");
            System.out.println("");
            if(dis>=0)
            {
                System.out.println("THE ROOTS ARE");
                r1=(-b+Math.sqrt(dis))/2*a;
                r2=(-b-Math.sqrt(dis))/2*a;
                System.out.print(r1+" & "+r2+"\n");
            }
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

    void MatrixAddition()
    {
        try
        {
            int row,colomn,i,j;
            A2.println("ENTER THE ORDER OF MATRIX (ROW X COLOMN)");
            row=A1.nextInt();
            colomn=A1.nextInt();
            A2.println("ENTER VALUE OF FIRST MATRIX");
            double m1[][]=new double[row][colomn];
            for(i=0;i<row;i++)
            {
                for(j=0;j<colomn;j++)
                {
                    m1[i][j]=A1.nextInt();
                }
                A2.println("");
            }        
            A2.println("ENTER VALUE OF SECOND MATRIX");
            double m2[][]=new double[row][colomn];
            for(i=0;i<row;i++)
            {
                for(j=0;j<colomn;j++)
                {
                    m2[i][j]=A1.nextInt();
                }
                A2.println("");
            }
            double sum[][]=new double[row][colomn];
            for(i=0;i<row;i++)
            {
                for(j=0;j<colomn;j++)
                {
                    sum[i][j]=m1[i][j]+m2[i][j];
                }
            }
            A2.println("THE SUM OF THE GIVEN MATRICES");
            for(i=0;i<row;i++)
            {
                for(j=0;j<colomn;j++)
                {
                    A2.print(sum[i][j]+" ");
                }
                A2.println("");
            }
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj1.Wait();
                System.out.println("RESOLVING PLEASE WAIT");
                obj1.Wait();
                System.out.println("ERROR RESOLVED");
                obj1.Wait();
            }
        }
    }
}