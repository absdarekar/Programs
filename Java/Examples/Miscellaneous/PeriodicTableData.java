package ScienceAndTechnology;
public class PeriodicTableData
{
    public static double period(int pn,int row,int colomn)
    {
        if(pn==1)
        {
            double period[][]={{1.0079,4.0026},{1,2}};
            return period[row][colomn];
        }
        else
        if(pn==2)
        {
            double period[][]={{6.941,9.0122,10.811,12.0107,14.0067,15.9994,18.9984,20.1797,},{3,4,5,6,7,8,9,10}};
            return period[row][colomn];
        }
        else
        if(pn==3)
        {
            double period[][]={{22.9897,24.305,26.9815,28.0855,30.9738,32.065,35.453,39.948},{11,12,13,14,15,16,17,18}};
            return period[row][colomn];
        }
        else
        if(pn==4)
        {
            double period[][]={{39.0983,40.078,44.9559,47.867,50.9415,51.9961,54.938,55.845,58.9332,58.6934,63.546,65.38,69.723,72.64,74.9216,78.96,79.904,83.8},{19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36}};
            return period[row][colomn];
        }
        else
        if(pn==5)
        {
            double period[][]={{85.4678,87.62,88.9059,91.224,92.9064,95.94,98,101.07,102.906,106.42,107.868,112.411,114.818,118.71,121.76,127.6,126.905,131.923},{37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54}};
            return period[row][colomn];
        }
        else
        if(pn==6)
        {
            double period[][]={{132.906,137.327,138.906,140.116,140.908,144.24,145,150.36,151.964,157.25,158.925,162.5,164.93,167.259,168.934,173.04,174.967,178.49,180.948,183.84,186.207,190.23,192.217,195.078,196.967,200.59,204.383,207.2,208.98,209,210.222,222},{55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86}};
            return period[row][colomn];
        }
        else
        if(pn==7)
        {
            double period[][]={{223,226,227,232.038,231.036,238.029,237,244,243,247,247,251,252,257,258,259,268,267,268,271,272,277,276,281,280,285,284,289,288,293,294,294},{87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118}};
            return period[row][colomn];
        }
        else
            return 0;
    }

    public static double group(int gn,int colomn)
    {
        if(gn==1)
        {
            double group[]={1,3,11,19,37,55,87};
            return group[colomn];
        }
        else        
        if(gn==2)
        {
            double group[]={4,12,20,38,56,88};
            return group[colomn];
        }
        else
        if(gn==3)
        {
            double group[]={21,39,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103};
            return group[colomn];
        }
        else
        if(gn==4)
        {
            double group[]={22,40,72,104};
            return group[colomn];
        }
        else
        if(gn==5)
        {
            double group[]={23,41,73,105};
            return group[colomn];
        }
        else
        if(gn==6)
        {
            double group[]={24,42,74,106};
            return group[colomn];
        }
        else
        if(gn==7)
        {
            double group[]={25,43,75,107};
            return group[colomn];
        }
        else
        if(gn==8)
        {
            double group[]={26,44,76,108};
            return group[colomn];
        }
        else
        if(gn==9)
        {
            double group[]={27,45,77,109};
            return group[colomn];
        }
        else
        if(gn==10)
        {
            double group[]={28,46,78,110};
            return group[colomn];
        }
        else
        if(gn==11)
        {
            double group[]={29,47,79,111};
            return group[colomn];
        }
        else
        if(gn==12)
        {
            double group[]={30,48,80,112};
            return group[colomn];
        }
        else
        if(gn==13)
        {
            double group[]={5,13,31,49,81,113};
            return group[colomn];
        }
        else
        if(gn==14)
        {
            double group[]={6,14,32,50,82,114};
            return group[colomn];
        }
        else
        if(gn==15)
        {
            double group[]={7,15,33,51,83,115};
            return group[colomn];
        }
        else
        if(gn==16)
        {
            double group[]={8,16,34,52,84,116};
            return group[colomn];
        }
        else
        if(gn==17)
        {
            double group[]={9,17,35,53,85,117};
            return group[colomn];
        }
        else
        if(gn==18)
        {
            double group[]={2,10,18,36,54,86,118};
            return group[colomn];
        }
        else
            return 0;
    }

    public static double AtomicMassGroup(double Z)
    {
        int pn=0,l=0,j=0;
        double z=0;
        boolean flag=false;
        if(1<=Z&&Z<=2)
            pn=1;
        else
        if(3<=Z&&Z<=10)
            pn=2;
        else
        if(11<=Z&&Z<=18)
            pn=3;
        else
        if(19<=Z&&Z<=36)
            pn=4;
        else
        if(37<=Z&&Z<=54)
            pn=5;
        else
        if(55<=Z&&Z<=86)
            pn=6;
        else
        if(87<=Z&&Z<=118)
            pn=7;
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
        while(flag==false)
        {
            z=period(pn,1,j);// Atomic Number
            if(z==Z)
                flag=true;
            else
                j++;
        }
        return period(pn,0,j);
    }
}