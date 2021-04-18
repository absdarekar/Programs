import java.util.*;
public class National
{
    public void National()
    {   Scanner A=new Scanner(System.in);
        Conveyance_National obj=new Conveyance_National();
        String in;     
        System.out.println("TOURIST ATTRACTION IN INDIA");
        System.out.println("1.JAMMU & KASHMIR");
        System.out.println("2.OOTY");
        System.out.println("3.MASOORE");
        System.out.println("4.KERALA");
        System.out.println("5.GOA");
        System.out.println("6.MUMBAI");
        System.out.println("7.BANGALURU");
        System.out.println("8.RAJASTAN");
        System.out.println("9.EAST-INDIA");
        System.out.println("10.BENGOL");
        in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                obj.Conveyance_National();
            }
            break;
            case "2":
            {
                obj.Conveyance_National();
            }
            break;
            case "3":
            {
                obj.Conveyance_National();
            }
            break;
            case "4":
            {
                obj.Conveyance_National();
            }
            break;
            case "5":
            {
                obj.Conveyance_National();
            }
            break;
            case "6":
            {
                obj.Conveyance_National();
            }
            break;
            case "7":
            {
                obj.Conveyance_National();
            }
            break;
            case "8":
            {
                obj.Conveyance_National();
            }
            break;
            case "9":
            {
                obj.Conveyance_National();
            }
            break;
            case "10":
            {
                obj.Conveyance_National();
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
    }
}
