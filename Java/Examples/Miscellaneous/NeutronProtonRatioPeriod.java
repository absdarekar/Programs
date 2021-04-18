package ScienceAndTechnology;
import java.util.*;
public class NeutronProtonRatioPeriod extends PeriodicTableData
{
    static NeutronProtonRatio obj=new NeutronProtonRatio();
    public static void NPRP()
    {
        Scanner A=new Scanner(System.in);
        int pn=0,i=0,j=0,l=0;
        double n=0,p=0,meanE=0,sumE=0;
        System.out.println("Enter The Period Number To Be Analysed");
        pn=A.nextInt();
        if(pn==1)
            l=2;        
        if(pn==2)
            l=8;        
        if(pn==3)
            l=8;
        if(pn==4)
            l=18;
        if(pn==5)
            l=18;
        if(pn==6)
            l=32;
        if(pn==7)
            l=32;
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
        System.out.println("The n:p of given Elements");
        for(j=0;j<l;j++)
        {
            p=AZ[1][j];
            n=(Math.round(AZ[0][j]))-p;
            nprR[j]=n/p;
            nprE[j]=((AZ[0][j])-p)/p;
        }
        for(i=0;i<l;i++)
        {
            System.out.println("Z="+AZ[1][i]+"\t\t\tA="+AZ[0][i]);
            System.out.println("n:p Ratio ="+nprE[i]);
            sumE+=nprE[i];
            System.out.println();
            meanE=sumE/l;
        }
        System.out.println("Mean n:p Ratio =>>"+meanE);
        System.out.print("\n==============================================================\n==============================================================\n");
        obj.main(null);
    }    
}