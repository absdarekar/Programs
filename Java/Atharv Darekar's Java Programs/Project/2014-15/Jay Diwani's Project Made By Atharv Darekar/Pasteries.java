import java.util.*;
public class Pasteries
{
    public void Pasteries()
    {
        Scanner A=new Scanner(System.in);
        double p;
        int qno=0;
        System.out.println("SELECT THE TYPE OF PASTERIES YOU SEARCHING FOR");
        System.out.println("1.ICE-CREAM PASTERIE...............Rs. 30/pc");
        System.out.println("2.FRUIT N NUTS PASTERIE............Rs. 40/pc");
        System.out.println("3.CHOCOLATE PASTERIE...............Rs. 50/pc");
        System.out.println("4.JELLY PASTERIE...................Rs. 30/pc");
        System.out.println("5.PINE APPLE PASTERIE..............Rs. 30/pc");
        System.out.println("6.STRAWBERRY PASTERIE..............Rs. 20/pc");
        System.out.println("7.VANILA PASTERIE..................Rs. 20/pc");
        System.out.println("8.BLACK CURRENT PASTERIE...........Rs. 60/pc");
        System.out.println("ENTER THE TYPE OF PASTERIE YOU WANT");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
             case "2":
            {                
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=40*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "3":
            {                
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=50*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "4":
            {                
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "5":
            {                
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "6":
            {                
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=20*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "7":
            {                
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=20*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "8":
            {                
                System.out.println("PLEASE INSERT HOW MANY PASTERIES DO YOU ORDER");
                qno=A.nextInt();
                p=60*qno;
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
