import java.util.*;
public class Jwellers
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        Segment obj=new Segment();
        String in,in1,q,p;
        System.out.println("WELCOME TO THE GOLDEN JOURNEY TO");
        System.out.println("      VAISHNAVI JWELLERS");
        System.out.println("");
        System.out.println("WHAT KIND OF JWELLERY DO YOU WANT ?");
        System.out.println("1.OCCASIONAL / FUNCTIONAL");
        System.out.println("2.DAILY WEAR");
        System.out.println("");
        System.out.println("ENTER YOUR CHOICE");
        in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("WHAT ITEM DO YOU WANT ?");
                System.out.println("1.EAR RING");
                System.out.println("2.BRACELATE");
                System.out.println("3.MANGALSUTRA");
                System.out.println("4.RING (FINGER)");
                System.out.println("5.BANGLES");
                System.out.println("6.ANCLETS");
                System.out.println("7.NECKLACE");
                System.out.println("ENTER YOUR CHOICE");
                in1=A.nextLine();
                switch(in1)
                {
                    case "1":
                    {
                        obj.segment();
                    }
                    break;
                    case "2":
                    {
                        obj.segment();
                    }
                    break;
                    case "3":
                    {
                        obj.segment();
                    }
                    break;
                    case "4":
                    {
                        obj.segment();
                    }
                    break;
                    case "5":
                    {
                        obj.segment();
                    }
                    break;
                    case "7":
                    {
                        obj.segment();
                    }
                    break;
                    default:
                    {
                        System.out.println("INVALID OPTION");
                    }
                }
            }
            break;
            case "2":
            {
                System.out.println("WHAT ITEM DO YOU WANT ?");
                System.out.println("1.EAR RING");
                System.out.println("2.BRACELATE");
                System.out.println("3.MANGALSUTRA");
                System.out.println("4.RING (FINGER)");
                System.out.println("5.BANGLES");
                System.out.println("6.ANCLETS");
                System.out.println("7.NECKLACE");
                System.out.println("ENTER YOUR CHOICE");
                in1=A.nextLine();
                switch(in1)
                {
                    case "1":
                    {
                        obj.segment();
                    }
                    break;
                    case "2":
                    {
                        obj.segment();
                    }
                    break;
                    case "3":
                    {
                        obj.segment();
                    }
                    break;
                    case "4":
                    {
                        obj.segment();
                    }
                    break;
                    case "5":
                    {
                        obj.segment();
                    }
                    break;
                    case "7":
                    {
                        obj.segment();
                    }
                    break;
                    default:
                    {
                        System.out.println("INVALID OPTION");
                    }
                }
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
        System.out.println("ENTER YOUR QUANTITY");
        q=A.nextLine();
        System.out.println("PAY 'TOTAL PRIZE' ON DILIVERY");
        System.out.println("");
        System.out.println("!!THANK YOU!!");
        System.out.println("");
        System.out.println("PLEASE DO VISIT US AGAIN");
        System.out.println("");
        System.out.println("!!!HAVE A GOOD DAY!!!");
    }
}