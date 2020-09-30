import java.util.*;
public class Tours_And_Travel
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        Distination obj=new Distination();
        System.out.println("WELCOME TO KMST TOURS AND TRAVELS");
        System.out.println("PACKAGE");
        System.out.println("1.FAMILY PACK");
        System.out.println("2.COUPLE PACK ");  
        System.out.println("3.KIDS PACK");
        System.out.println("4.FRIENDS PACK");
        String in,in1,emid;
        int phno,te,tk;
        in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                obj.Distination();
                System.out.println("ENTER THE NUMBER OF TICKETS FOR ELDERS");
                te=A.nextInt();
                System.out.println("ENTER THE NUMBER OF TICKETS FOR CHILDRENS");
                tk=A.nextInt();
            }
            break;
            case "2":
            {
                obj.Distination();
            }
            break;
            case "3":
            {
                obj.Distination();
                System.out.println("ENTER THE NUMBER OF TICKETS FOR CHILDRENS");
                tk=A.nextInt();
            }
            break;
            case "4":
            {
                obj.Distination();
                System.out.println("ENTER THE NUMBER OF TICKETS");
                te=A.nextInt();
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
        System.out.println("");
        System.out.println("WE WILL SERVE YOU THE BEST OF RESOURCES");
        System.out.println("");
        System.out.println("PLEASE PROVIDE OUS YOUR e-mail ID ");
        emid=A.nextLine();
        System.out.println("PLEASE PROVIDE OUS YOUR CONTACT NUMBER");
        phno=A.nextInt();        
        System.out.println("");
        System.out.println("DETAILS AS WELL AS BILL WOULD BE MAIL TO YOU");
        System.out.println("");
        System.out.println("FOR DETAILS LOG ON TO www.KMST.com");
        System.out.println("");
        System.out.println("!!!THANK YOU!!!");
        System.out.println("");
    }
}