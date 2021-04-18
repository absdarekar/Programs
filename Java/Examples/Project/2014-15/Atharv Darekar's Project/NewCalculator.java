import java.util.*;
import java.io.*;
public class NewCalculator
{
    Scanner A=new Scanner(System.in);
    DataInputStream A2=new DataInputStream(System.in);
    Wait obj=new Wait();
    boolean flag=false;
    void NewCalculator()throws IOException
    {        
        try
        {
            double result=0,ind;
            boolean e1=false,e2=false;
            double an,si,co,ta;
            double round,cbrt,d;
            int cbrtint;
            float df;
            String ins,t,charat0s,in;
            char charat0;
            double pi=((22/7)+(355/113))/2;
            System.out.println("");
            System.out.println("**********************************WELCOME TO CALCULATOR PROGRAMMED BY ATHARV DAREKAR**********************************");
            System.out.println("");
            obj.Wait1();
            do
            {
                System.out.println();
                System.out.println("ENTER NUMBER TO BE OPERATED ALONG WITH THE OPERATOR AS SHOWN BELOW :");
                System.out.println("'+25' TO ADD\n'-56' TO SUBTRACT\n'*85' TO MULTIPLY\n'/87' TO DIVIDE\n'%54' TO FIND MOD\n'|4' TO FIND SQUARE ROOT\n'!8' TO FIND CUBE ROOT\n'^2' TO FIND POWER OF THE BASE");
                System.out.println("'T' FOR TRIGENOMETRICAL RATIOS");
                System.out.println("");
                System.out.println("ENTER '=' FOR RESULT");
                System.out.println("ENTER AND RE-ENTER '==' TO RE-SET CALCULATOR");
                System.out.println();
                System.out.print(result);
                do
                {            
                    ins=A.nextLine();
                    charat0=(ins.charAt(0));
                    charat0s=Character.toString(charat0);
                    if(charat0s.equals("/"))
                    {
                        t=ins.replace("/","");                    
                        ind=Double.parseDouble(t);
                        if(ind!=0)
                        {
                            result*=(1/ind);
                        }
                        else
                        {
                            System.out.println("INFINITY");
                        }
                    }
                    if(charat0s.equals("+"))
                    {
                        t=ins.replace("+","");
                        ind=Double.parseDouble(t);
                        result+=ind;
                    }
                    if(charat0s.equals("-"))
                    {
                        t=ins.replace("-","");
                        ind=Double.parseDouble(t);
                        result-=ind;
                    }
                    if(charat0s.equals("*"))
                    {
                        t=ins.replace("*","");
                        ind=Double.parseDouble(t);
                        result*=ind;
                    } 
                    if(charat0s.equals("|"))
                    {
                        t=ins.replace("|","");
                        ind=Double.parseDouble(t);
                        result=Math.sqrt(ind);   
                    }
                    if(charat0s.equals("!"))
                    {
                        t=ins.replace("!","");
                        ind=Double.parseDouble(t);
                        cbrt=Math.pow(ind,Math.pow(3,-1));
                        cbrtint=(int)(cbrt);
                        d=cbrt-cbrtint;
                        df=(float)(d);
                        if((df>=0.9998888))
                        {
                            round=Math.round(cbrt);
                        }
                        else
                        {
                            round=cbrt;
                        }
                        result=round;
                    }
                    if(charat0s.equals("%"))
                    {
                        t=ins.replace("%","");
                        ind=Double.parseDouble(t);
                        if(ind!=0)
                        {
                            result%=ind;
                        }
                        else
                        {
                            System.out.println("INFINITY");
                        }
                    }                
                    if(charat0s.equals("^"))
                    {
                        t=ins.replace("^","");
                        ind=Double.parseDouble(t);
                        result=Math.pow(result,ind);
                    }       
                    if(ins.equals("T"))
                    {
                        System.out.println("1.Sine OF AN ANGLE");
                        System.out.println("2.Cosecant OF AN ANGLE");
                        System.out.println("3.Tangent OF AN ANGLE");
                        String m=(A2.readLine());
                        switch (m)
                        {
                            case "1":
                            {
                                System.out.println("ENTER VALUE FOR ANGLE");
                                an=Double.parseDouble(A2.readLine());
                                si=(pi*an)/180;
                                System.out.println("Sine VALUE OF GIVEN ANGLE IS\t"+Math.sin(si));
                            }
                            break;
                            case "2":
                            {
                                System.out.println("ENTER VALUE FOR ANGLE");
                                an=Double.parseDouble(A2.readLine());
                                co=(pi*an)/180*an;
                                System.out.println("Cosecant VALUE OF GIVEN ANGLE IS\t"+Math.cos(co));
                            }
                            break;
                            case "3":
                            {
                                System.out.println("ENTER VALUE FOR ANGLE");
                                an=Double.parseDouble(A2.readLine());
                                ta=(pi*an)/180*an;
                                System.out.println("Tangent VALUE OF GIVEN ANGLE IS\t"+Math.tan(ta));
                            }
                            break;
                            default:
                            System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                            obj.Wait1();
                        }                
                    }                
                    System.out.println(result);
                    if(ins.equals("=="))
                        result=0;
                    if(ins.equals("="))
                        e1=true;  
                }while(e1==false);
                System.out.println("PRESS 'ENTER' TO CONTINUE ELSE ENTER 'EXIT' TO EXIT CALCULATOR");
                in=A.nextLine();
                e1=false;
                if(in.equals("EXIT"))            
                    e2=true;            
            }while(e2==false); 
        }catch(Exception e){flag=true;}
        finally
        {
            if(flag==true)
            {
                System.out.println("RUN-TIME ERROR COMMITED");
                obj.Wait1();
                System.out.println("RESOLVING PLEASE WAIT");
                obj.Wait1();
                System.out.println("ERROR RESOLVED");
                obj.Wait1();               
            }
        }
    }
}