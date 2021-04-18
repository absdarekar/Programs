import java.util.*;
import java.io.*;
public class Project_2014_15
{
    public static void main(String atharv[])throws IOException
    {
        Scanner A=new Scanner(System.in);
        FormulaeBookMathematics obj=new FormulaeBookMathematics();
        NewCalculator obj1=new NewCalculator();
        PERIODICTABLE obj2=new PERIODICTABLE();
        BMI obj3=new BMI();
        Wait obj4=new Wait();
        Introduction obj5=new Introduction();
        String choice;
        boolean e=false;
        int i=0,i1=0;
        do
        {
            if(i1!=1)
            {
                obj5.Introduction();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                i1++; 
            }
            if(i!=1)
            {
                System.out.println("********************* WELCOME TO STUDY TOOLS APPLICATION PROGRAMMED BY ATHARV DAREKAR FOR ACADEMYC YEAR 2014-15 ********************");
                System.out.println("____________________________________________________________________________________________________________________________________");
                obj4.Wait1();
                i++;
            }
            System.out.println(" _____________________________________________________________________________________________________________________");
            System.out.println("|                                                                                                                     |");
            System.out.println("|                                                     SELECT A SUBJECT                                                |");
            System.out.println("|                                                                                                                     |");
            System.out.println("|                                                      1.CALCULATOR                                                   |");
            System.out.println("|                                                                                                                     |");
            System.out.println("|                        2.FORMULAE BOOK OF MATHEMATICS (BASED ON THE SYLLABUS OF ICSE STANDARD IX & X)               |");
            System.out.println("|                                                                                                                     |");
            System.out.println("|                                    3.HEALTH ANALYSIS (BASED ON BODY MASS INDEX (BMI))                               |");
            System.out.println("|                                                                                                                     |");
            System.out.println("|                                                    4.PERTIODIC TABLE                                                |");
            System.out.println("|                                                                                                                     |");
            System.out.println("|                                                   ENTER 'EXIT' TO EXIT                                              |");
            System.out.println("|_____________________________________________________________________________________________________________________|");
            System.out.println("");
            System.out.println("NOTE :- ON CAPS LOCK BUTTON PLEASE");
            System.out.println("");
            System.out.println("ENTER YOUR CHOICE");
            choice=A.nextLine();
            switch(choice)
            {
                case "1":
                {
                    obj1.NewCalculator();                     
                    obj4.Wait();
                    System.out.println();
                }
                break;
                case "2":
                {
                    obj.FormulaeBookMathematics();                    
                    obj4.Wait();
                    System.out.println();
                }
                break;
                case "3":
                {
                    obj3.BMI();                    
                    obj4.Wait();
                    System.out.println();
                } 
                break;
                case "4":
                {
                    obj2.Periodictable();                    
                    obj4.Wait();
                    System.out.println();
                }
                break;
                case "EXIT":
                {
                    System.out.println("*********************************************************** THANK YOU *************************************************************"); 
                    e=true;
                }
                break;
                default:
                {
                    System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
                    obj4.Wait1();
                }  
            }                            
        }while(e==false);
    }
}