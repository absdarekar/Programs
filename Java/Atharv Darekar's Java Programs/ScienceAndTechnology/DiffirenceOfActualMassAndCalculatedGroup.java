package ScienceAndTechnology;
import java.util.*;
public class DiffirenceOfActualMassAndCalculatedGroup extends PeriodicTableData
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        int gn=0,i=0,j=0,l=0;
        double mnpr=0,p=0,massC,massA,d;
        System.out.println("Enter The Group Number To Be Analysed");
        gn=A.nextInt();
        if(gn==1)
        {
            l=7;
            mnpr=1.108;
        }
        if(gn==2)
        {    
            l=6;  
            mnpr=1.2681;
        }
        if(gn==3)
        {
            l=32;
            mnpr=1.4811;
        }
        if(gn==4)
        {
            l=4;
            mnpr=1.3756;
        }
        if(gn==5)
        {
            l=4;
            mnpr=1.3779;
        }
        if(gn==6)
        {
            l=4;
            mnpr=1.3729;
        }
        if(gn==7)
        {
            l=4;
            mnpr=1.3753;
        }
        if(gn==8)
        {
            l=4;
            mnpr=1.3781;
        }
        if(gn==9)
        {
            l=4;
            mnpr=1.3744;
        }
        if(gn==10)
        {
            l=4;
            mnpr=1.3663;
        }
        if(gn==11)
        {
            l=4;
            mnpr=1.3755;
        }
        if(gn==12)
        {
            l=4;
            mnpr=1.3933;
        }
        if(gn==13)
        {
            l=6;
            mnpr=1.311;
        }
        if(gn==14)
        {
            l=6;
            mnpr=1.2856;
        }
        if(gn==15)
        {
            l=6;
            mnpr=1.2909;
        }
        if(gn==16)
        {
            l=6;
            mnpr=1.2998;
        }
        if(gn==17)
        {
            l=6;
            mnpr=1.3099;
        }
        if(gn==18)
        {
            l=7;
            mnpr=1.2974;
        }
        double AZ[][]=new double[2][l];
        double nprR[]=new double[l];
        double nprE[]=new double[l];
        for(j=0;j<l;j++)
        {
            AZ[1][j]=group(gn,j);// Atomic Number
            AZ[0][j]=AtomicMassGroup(AZ[1][j]);// Atomic Mass
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