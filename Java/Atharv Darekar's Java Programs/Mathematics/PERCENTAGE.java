package Mathematics;
import java.io.*;
public class PERCENTAGE
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        int a;
        do
        {
            double m,p,c,b,h,g,e1,e2,hi,co,T;
            System.out.println("WELCOME TO THE PERCENTAGE ANALYSIS PROGARAM PROGRAMMED BY ATHARV DAREKAR");
            System.out.println("CHOOSE A CATAGORY");
            System.out.print("");
            System.out.println("1.UNIT TEST EXAM");
            System.out.println("2.TERM EXAM/FINAL EXAM");
            System.out.print("");
            a=Integer.parseInt(A.readLine());
            switch (a)
            {
                case 1:
                System.out.println("INCLUDIN ORALS/PRACTICLES/PROJECT MARKS");
                System.out.println("ENTER THE MARKS OBTAINED IN MATHEMATICS");
                m=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN PHYSICS");
                p=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN CHEMISTRY");
                c=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN BIOLOGY");
                b=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN HISTORY & CIVICS");
                h=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN GEOGRAPHY");
                g=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN ENGLISH-I");
                e1=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN ENGLISH-II");
                e2=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN HINDI");
                hi=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN COMPUTER");
                co=Double.parseDouble(A.readLine());
                T=((m+p+c+b+h+g+e1+e2+hi+co)*100)/550;
                System.out.print("YOU HAD OBTAIN\t"+T);
                System.out.print("\t PERCENTAGE IN UNIT TEST EXAM");
                System.out.print("");
                System.out.println("PRESS 3 FOR EXIT");
                System.out.print("");
                break;

                case 2:
                System.out.println("INCLUDIN ORALS/PRACTICLES/PROJECT MARKS");
                System.out.println("ENTER THE MARKS OBTAINED IN MATHEMATICS");
                m=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN PHYSICS");
                p=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN CHEMISTRY");
                c=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN BIOLOGY");
                b=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN HISTORY & CIVICS");
                h=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN GEOGRAPHY");
                g=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN ENGLISH-I");
                e1=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN ENGLISH-II");
                e2=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN HINDI");
                hi=Double.parseDouble(A.readLine());
                System.out.println("ENTER THE MARKS OBTAINED IN COMPUTER");
                co=Double.parseDouble(A.readLine());
                T=((m+p+c+b+h+g+e1+e2+hi+co)*100)/1100;
                System.out.print("YOU HAD OBTAIN\t"+T);
                System.out.print("\t PERCENTAGE IN TERM EXAM/FINAL EXAM");
                System.out.println("");
                System.out.println("PRESS 3 FOR EXIT");
                System.out.println("");
                break;

                case 3:
                System.out.println("THANK YOU!!");
                break;

                default:
                System.out.println("INVALID OPTION PLEASE TRY AGAIN");
            }
        }while(a!=3);
    }
}