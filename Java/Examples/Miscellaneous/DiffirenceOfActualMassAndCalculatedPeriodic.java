package ScienceAndTechnology;
import java.util.*;
public class DiffirenceOfActualMassAndCalculatedPeriodic extends PeriodicTableData
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        int pn=0,i=0,j=0,l=0;
        double massA=0,massC=0,mnpr=0,d=0;
        System.out.println("Enter The Period Number To Be Analysed");
        pn=A.nextInt();
        if(pn==1)
        {
            l=2;
            mnpr=0.5046;
        }
        if(pn==2)
        {
            l=8;
            mnpr=1.1075;
        }
        if(pn==3)
        {
            l=8;
            mnpr=1.0713;
        }
        if(pn==4)
        {
            l=18;
            mnpr=1.1931;
        }
        if(pn==5)
        {
            l=18;
            mnpr=1.3297;
        }
        if(pn==6)
        {
            l=32;
            mnpr=1.4667;
        }
        if(pn==7)
        {
            l=32;
            mnpr=1.5499;
        }
        double AZ[][]=new double[2][l];
        double nprR[]=new double[l];
        double nprE[]=new double[l];
        for(i=0;i<2;i++)
        {
            for(j=0;j<l;j++)
            {
                if(i==0)
                {
                    AZ[0][j]=period(pn,0,j);// Atomic Mass
                }
                if(i==1)
                {   
                    AZ[1][j]=period(pn,1,j);// Atomic Number
                }
            }
        }
        for(j=0;j<l;j++)
        {
            massC=((AZ[1][j])*(mnpr+1));
            massA=AZ[0][j];
            d=massA-massC;
            System.out.print("Z="+AZ[1][j]+" A="+AZ[0][j]+" A Calculated="+massC+" Diffirence="+d);
            System.out.println();
        }
        System.out.print("\n==============================================================\n==============================================================\n");
    }
}