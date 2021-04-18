package NumberType;
import java.util.*;
public class Random_Game
{
    public static void main(String atharv[])
    {
        Scanner A=new Scanner(System.in);
        String p1,p2;
        double a,u=2,l=1;
        System.out.println("WELCOME TO RANDOM GAME PROGRAMMED BY ATHARV DAREKAR");
        System.out.println("");
        do
        {
        System.out.println("Enter The Name Of Fist Player");
        p1=A.nextLine();
        System.out.println("");        
        System.out.println("Enter The Name Of Second Player");
        p2=A.nextLine();
        System.out.println("");        
        System.out.println("And The Winner Is :-");
        System.out.println("");
        a=Math.round(((Math.random()*(u-l))+l));
        if(a==1)         
            System.out.println(p1+"\t"+" WINS");
        if(a==2)
            System.out.println(p2+"\t"+" WINS");
        }while(a!=0);
    }
}