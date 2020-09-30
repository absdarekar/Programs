package ScienceAndTechnology;
import java.util.*;
public class NeutronProtonRatioGroup extends PeriodicTableData
{
    static NeutronProtonRatio obj=new NeutronProtonRatio();
    public static void NPRG()
    {
        Scanner A=new Scanner(System.in);
        int gn=0,i=0,j=0,l=0;
        double n=0,p=0,meanE=0,sumE=0;
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