import java.util.*;
public class International
{
    public void International()
    {   Scanner A=new Scanner(System.in);
        Conveyance_Abroad obj=new Conveyance_Abroad();
        String in;     
        System.out.println("TOURIST ATTRACTION AROUND THE WORLD");
        System.out.println("1.ITALY");
        System.out.println("2.SINGAPORE");
        System.out.println("3.U.A.E (UNITED ARAB EMIRATES)");
        System.out.println("4.ENGALND");
        System.out.println("5.SPAIN");
        System.out.println("6.THAILAND");
        System.out.println("7.CHINA");
        System.out.println("8.JAPAN");
        System.out.println("9.AUSTRAILIA");
        System.out.println("10.NEWZEALAND");
        in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "2":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "3":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "4":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "5":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "6":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "7":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "8":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "9":
            {
                obj.Conveyance_Abroad();
            }
            break;
            case "10":
            {
                obj.Conveyance_Abroad();
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
    }
}
