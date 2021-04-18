import java.util.*;
public class Other_Products
{
    public void OtherProducts()
    {
        Scanner A=new Scanner(System.in);
        double p;
        int qno=0;
        System.out.println("SELECT THE TYPE OF BAKERY PRODUCT YOU SEARCHING FOR");
        System.out.println("1.BREAD.....................Rs. 30/pack");
        System.out.println("2.BUTTER....................Rs. 20/pack");
        System.out.println("3.PAW.......................Rs. 10/pack");
        System.out.println("4.RUSKS.....................Rs. 30/pack");
        System.out.println("5.TOAST.....................Rs. 30/pack");
        System.out.println("ENTER THE TYPE OF BAKERY PRODUCT YOU WANT");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                System.out.println("PLEASE INSERT HOW MANY BREADS DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "2":
            {    
                System.out.println("PLEASE INSERT HOW MANY BUTTERS DO YOU ORDER");
                qno=A.nextInt();
                p=20*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "3":
            {        
                System.out.println("PLEASE INSERT HOW MANY PAW DO YOU ORDER");
                qno=A.nextInt();
                p=10*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "4":
            {            
                System.out.println("PLEASE INSERT HOW MANY RUSKS DO YOU ORDER");
                qno=A.nextInt();
                p=30*qno;
                System.out.println("YOUR BILL Rs. "+p);
            }
            break;
            case "5":
            {  
                System.out.println("PLEASE INSERT HOW MANY TOAST DO YOU ORDER");
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
