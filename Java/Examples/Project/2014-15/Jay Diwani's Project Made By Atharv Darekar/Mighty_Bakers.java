import java.util.*;
public class Mighty_Bakers
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        Cakes obj=new Cakes();
        Pasteries obj1=new Pasteries();
        Chocolates obj2=new Chocolates();
        Biscuits obj3=new Biscuits();
        Cookies obj4=new Cookies();
        Nankets obj5=new Nankets();
        Other_Products obj6=new Other_Products(); 
        System.out.println("WELCOME TO MIGHTY BAKERS");
        System.out.println("MAY I KNOW FOR WHAT ARE YOU LOOKING FOR");
        System.out.println("1.CAKES");
        System.out.println("2.PASTERIES");
        System.out.println("3.CHOCOLATES");
        System.out.println("4.BISCUIT");
        System.out.println("5.COOKIES");
        System.out.println("6.NANKETS");
        System.out.println("7.OTHER BAKERY PRODUCTS");
        System.out.println("PLEASE ENTER YOUR CHOICE");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {        
                obj.Cakes();
            }
            break;
            case "2":
            {           
                obj1.Pasteries();
            }
            break;
            case "3":
            {           
                obj2.Chocolates();
            }
            break;
            case "4":
            {       
                obj3.Biscuits();
            }
            break;
            case "5":
            {     
                obj4.Cookies();
            }
            break;
            case "6":
            {        
                obj5.Nankets();
            }
            break;
            case "7":
            {         
                obj6.OtherProducts();
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
        System.out.println("THANK YOU!!!");
        System.out.println("VISIT AGAIN");
        System.out.println("HAVE A GOOD DAY");
    }
}