import java.io.*;
public class BMI
{
    Wait obj=new Wait();
    boolean flag=false;
    void BMI()throws IOException
    {
        try
        {
            BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
            double h,w,bmi;
            String eorc;
            boolean e=false;
            System.out.println("");
            System.out.println("**********************************WELCOME TO HEALTH ANALYSIS PROGRAM PROGRAMMED BY ATHARV DAREKAR**********************************");
            System.out.println("");
            obj.Wait1();
            do
            {
                System.out.println();
                System.out.println("ENTER YOUR WEIGHT (IN Kg)");
                w=Double.parseDouble(A.readLine());
                System.out.println("");
                System.out.println("ENTER YOUR HEIGHT (IN m)");
                h=Double.parseDouble(A.readLine());
                System.out.println("");
                bmi=(w/(h*h));
                if (bmi<=13.0)
                {
                    System.out.println("VERY SEVERELY UNDERWEIGHT");
                    System.out.println("");            
                }
                if((bmi>=13.0)&&(bmi<14.0))
                {
                    System.out.println("SEVERELY UNDERWEIGHT");
                    System.out.println("");            
                }
                if((bmi>=14.0)&&(bmi<16.5))
                {
                    System.out.println("UNDERWEIGHT");
                    System.out.println("");            
                }
                if((bmi>=16.5)&&(bmi<23.0))
                {
                    System.out.println("HEALTHY");
                    System.out.println("");            
                }
                if((bmi>=23.0)&&(bmi<28.0))
                {
                    System.out.println("OVERWEIGHT");
                    System.out.println("");            
                }
                if((bmi>=28.0)&&(bmi<33.0))
                {
                    System.out.println("OBESE CLASS I (MODERATELY OBESE)");
                    System.out.println("");            
                }
                if((bmi>=33.0)&&(bmi<38.0))
                {
                    System.out.println("OBESE CLASS II (SEVERELY OVERWEIGHT)");
                    System.out.println("");            
                }
                if((bmi>=38.0))
                {
                    System.out.println("OBESE CLASS III (VERY SEVERELY OVERWEIGHT)");
                    System.out.println("");            
                }            
                System.out.println("PRESS 'ENTER' TO CONTINUE ELSE ENTER 'EXIT' TO EXIT HEALTH ANALYSIS");
                eorc=A.readLine();
                if(eorc.equals("EXIT"))
                    e=true;
            }while(e==false);
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