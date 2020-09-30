import java.util.*;
public class Cookies
{
    public void Cookies()
    {
        Scanner A=new Scanner(System.in);
        double p;
        int qno=0;
        System.out.println("SELECT THE TYPE OF COOKIES YOU SEARCHING FOR");
        System.out.println("1.FRUITS N NUTS COOKIE...........Rs. 50/pack");
        System.out.println("2.CHOCOLATE COOKIE...............Rs. 40/pack");
        System.out.println("3.CHOCKO CHIP COOKIE.............Rs. 40/pack");
        System.out.println("4.JELLY COOKIE...................Rs. 30/pack");
        System.out.println("5.COOKIE.........................Rs. 20/pack");
        System.out.println("ENTER THE TYPE OF COOKIE YOU WANT");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("PLEASE INSERT HOW MANY PACK COOKIES DO YOU ORDER");
                qno=A.nextInt();
                p=50*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            case "2":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK COOKIES DO YOU ORDER");
                qno=A.nextInt();
                p=40*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "3":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK COOKIES DO YOU ORDER");
                qno=A.nextInt();
                p=40*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "4":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK COOKIES DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "5":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK COOKIES DO YOU ORDER");
                qno=A.nextInt();
                p=20*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
    }
}
