package Miscellaneous;
import java.io.*;
public class Electronic_Voting_Machine
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        long a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,v=0,v1,x;
        System.out.println("Welcome to the Electronic Voting Machine Programmed by ATHARV DAREKAR\n \nFor School Election");
        do
        { 
            System.out.println("Electronic Voting Machine Programmed by ATHARV DAREKAR");
            System.out.println("Press the Respective Number of the Cnadidate to Vote him\\her");
            System.out.println("\n1.A\n"+"\n2.B\n"+"\n3.C\n"+"\n4.D\n"+"\n5.E\n"+"\n6.F\n"+"\n7.G\n");
            System.out.println("For Result Enter Password");
            v1=v++;
            System.out.println("Voters who voted =\t"+v1);
            x=Long.parseLong(A.readLine());
            if (x==1)
                a++;
            if (x==2)
                b++;
            if (x==3)
                c++;
            if (x==4)
                d++;
            if (x==2919)
            {
                System.out.println("RESULT");
                System.out.println("Candidate A had got votes\t="+a);
                System.out.println("Candidate B had got votes\t="+b);
                System.out.println("Candidate C had got votes\t="+c);
                System.out.println("Candidate D had got votes\t="+d);
            }
        }while(x!=12194);
    }
}
