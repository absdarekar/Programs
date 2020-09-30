import java.util.*; 
public class Biscuits
{
    public void Biscuits()
    {
        Scanner A=new Scanner(System.in);
        double p;
        int qno=0;
        System.out.println("SELECT THE TYPE OF BISCUITS YOU SEARCHING FOR");
        System.out.println("1.NAMKIN..........................Rs. 30/pack");
        System.out.println("2.CHOCOLATE BISCUIT...............Rs. 40/pack");
        System.out.println("3.CHOCKO CHIP BISCUIT.............Rs. 40/pack");
        System.out.println("4.JELLY BISCUIT...................Rs. 30/pack");
        System.out.println("5.BISCUIT.........................Rs. 20/pack");
        System.out.println("ENTER THE TYPE OF BISCUIT YOU WANT");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("PLEASE INSERT HOW MANY PACK BISCUITS DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            case "2":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK BISCUITS DO YOU ORDER");
                qno=A.nextInt();
                p=40*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "3":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK BISCUITS DO YOU ORDER");
                qno=A.nextInt();
                p=40*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "4":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK BISCUITS DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "5":
            {                
                System.out.println("PLEASE INSERT HOW MANY PACK BISCUITS DO YOU ORDER");
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
