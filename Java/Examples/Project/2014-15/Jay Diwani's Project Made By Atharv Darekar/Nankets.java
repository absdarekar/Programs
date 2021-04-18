import java.util.*;
public class Nankets
{
    public void Nankets()
    {
        Scanner A=new Scanner(System.in);
        double p;
        int qno=0;
        System.out.println("SELECT THE TYPE OF NANKETS YOU SEARCHING FOR");
        System.out.println("2.FRUIT N NUTS NANKET............Rs. 40/pack");
        System.out.println("3.CHOCOLATE NANKET...............Rs. 50/pack");
        System.out.println("4.JELLY NANKET...................Rs. 30/pack");
        System.out.println("5.PINE APPLE NANKET..............Rs. 30/pack");
        System.out.println("6.STRAWBERRY NANKET..............Rs. 20/pack");
        System.out.println("7.VANILA NANKET..................Rs. 20/pack");
        System.out.println("ENTER THE TYPE OF NANKET YOU WANT");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=40*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
             case "2":
            {                
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=50*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "3":
            {                
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "4":
            {                
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "5":
            {                
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=20*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "6":
            {                
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=20*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "7":
            {                
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=20*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "8":
            {                
                System.out.println("PLEASE INSERT HOW MANY NANKETS DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
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
