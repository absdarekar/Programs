import java.util.*;
public class Chocolates
{
    public void Chocolates()
    {
        Scanner A=new Scanner(System.in);
        double p;
        int qno=0;
        System.out.println("SELECT THE TYPE OF CHOCOLATES YOU SEARCHING FOR");
        System.out.println("1.DARK CHOCOLATE....................Rs. 30/pc");
        System.out.println("2.FRUIT N NUTS CHOCOLATE............Rs. 40/pc");
        System.out.println("3.MILK CHOCOLATE....................Rs. 50/pc");
        System.out.println("4.JELLY CHOCOLATE...................Rs. 30/pc");
        System.out.println("5.VANILA CHOCOLATE..................Rs. 20/pc");
        System.out.println("ENTER THE TYPE OF CHOCOLATE YOU WANT");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("PLEASE INSERT HOW MANY CHOCOLATES DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            case "2":
            {                
                System.out.println("PLEASE INSERT HOW MANY CHOCOLATES DO YOU ORDER");
                qno=A.nextInt();
                p=40*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "3":
            {                
                System.out.println("PLEASE INSERT HOW MANY CHOCOLATES DO YOU ORDER");
                qno=A.nextInt();
                p=50*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "4":
            {                
                System.out.println("PLEASE INSERT HOW MANY CHOCOLATES DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "5":
            {                
                System.out.println("PLEASE INSERT HOW MANY CHOCOLATES DO YOU ORDER");
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
