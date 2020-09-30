package ScienceAndTechnology;
import java.util.*;
public class NeutronProtonRatio
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        NeutronProtonRatioPeriod obj=new NeutronProtonRatioPeriod();
        NeutronProtonRatioGroup obj1=new NeutronProtonRatioGroup();
        System.out.println("Choose the Stream for Analysis");
        System.out.println("1.Periodic Analysis");
        System.out.println("2.Group Analysis");
        System.out.println("Enter 3 for Exit");
        int opt=A.nextInt();
        switch(opt)
        {
            case 1:
            obj.NPRP();
            break;
            case 2:
            obj1.NPRG();
            break;
            case 3:
            break;
            default:
            System.out.println("Invalid Option Please Try Again");
        }
    }
}
