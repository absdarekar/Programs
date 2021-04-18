package ScienceAndTechnology;
import java.util.*;
public class NumberOfNeutrons extends PeriodicTableData
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        int gn=0,i=0,j=0,l=0;
        double n=0,p=0,meanR=0,meanE=0,sumR=0,sumE=0;
        System.out.println("Enter The Group Number To Be Analysed");
        gn=A.nextInt();
        if(gn==1)
            l=7;        
        if(gn==2)
            l=6;        
        if(gn==3)
            l=32;
        if(gn==4)
            l=4;
        if(gn==5)
            l=4;
        if(gn==6)
            l=4;
        if(gn==7)
            l=4;
        if(gn==8)
            l=4;
        if(gn==9)
            l=4;
        if(gn==10)
            l=4;
        if(gn==11)
            l=4;
        if(gn==12)
            l=4;
        if(gn==13)
            l=6;
        if(gn==14)
            l=6;
        if(gn==15)
            l=6;
        if(gn==16)
            l=6;
        if(gn==17)
            l=6;
        if(gn==18)
            l=7;
        double AZ[][]=new double[2][l];
        double nprR[]=new double[l];
        double nprE[]=new double[l];
        for(j=0;j<l;j++)
        {
            AZ[1][j]=group(gn,j);// Atomic Number
            AZ[0][j]=AtomicMassGroup(AZ[1][j]);// Atomic Mass
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<l;j++)
            {
                p=AZ[1][j];
                n=(Math.round(AZ[0][j]))-p;
                System.out.println("Z="+p+" Number of Neutrons="+n);
            }
        }
        System.out.print("\n==============================================================\n==============================================================\n");
    }
}