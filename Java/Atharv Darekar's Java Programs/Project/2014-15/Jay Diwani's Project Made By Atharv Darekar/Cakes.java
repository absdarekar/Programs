import java.util.*;
public class Cakes
{
    public void Cakes()
    {
        Scanner A=new Scanner(System.in);
        double qkg=0,p;
        int qno=0;
        System.out.println("SELECT THE TYPE OF CAKE YOU SEARCHING FOR");
        System.out.println("1.ICE-CREAM CAKE...............Rs. 150/Kg");
        System.out.println("2.FRUIT CAKE...................Rs. 200/Kg");
        System.out.println("3.DEATH BY CHOCOLATE...........Rs. 250/Kg");
        System.out.println("4.JELLY CAKE...................Rs. 150/Kg");
        System.out.println("5.BLACK FOREST.................Rs. 350/Kg");
        System.out.println("ENTER THE TYPE OF CAKE YOU WANT");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("PLEASE INSERT HOW MANY Kgs DO YOU ORDER");
                qkg=A.nextDouble();
                System.out.println("PLEASE INSERT HOW MANY CAKES DO YOU ORDER");
                qno=A.nextInt();
                p=150*qno*qkg;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "2":
            {
                System.out.println("PLEASE INSERT HOW MANY Kgs DO YOU ORDER");
                qkg=A.nextDouble();
                System.out.println("PLEASE INSERT HOW MANY CAKES DO YOU ORDER");
                qno=A.nextInt();
                p=200*qno*qkg;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "3":
            {                
                System.out.println("PLEASE INSERT HOW MANY Kgs DO YOU ORDER");
                qkg=A.nextDouble();
                System.out.println("PLEASE INSERT HOW MANY CAKES DO YOU ORDER");
                qno=A.nextInt();
                p=250*qno*qkg;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "4":
            {                
                System.out.println("PLEASE INSERT HOW MANY Kgs DO YOU ORDER");
                qkg=A.nextDouble();
                System.out.println("PLEASE INSERT HOW MANY CAKES DO YOU ORDER");
                qno=A.nextInt();
                p=150*qno*qkg;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "5":
            {                
                System.out.println("PLEASE INSERT HOW MANY Kgs DO YOU ORDER");
                qkg=A.nextDouble();
                System.out.println("PLEASE INSERT HOW MANY CAKES DO YOU ORDER");
                qno=A.nextInt();
                p=350*qno*qkg;
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
