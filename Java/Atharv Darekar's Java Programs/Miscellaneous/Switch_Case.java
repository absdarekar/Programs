package Miscellaneous;
import java.io.*;
public class Switch_Case
{
    public static void main(String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        String in;
        System.out.println("Enter 'Days' or 'Months'");
        in=(A.readLine());
        switch(in)
        {
            case "Days":
            {
                System.out.println("Enter any Number From 1 to 7");
                in=(A.readLine());
                switch(in)
                {
                    case "1":
                    System.out.println("Today is Monday");
                    break;
                    case "2":
                    System.out.println("Today is Tuesday");
                    break;
                    case "3":
                    System.out.println("Today is Wednesday");
                    break;
                    case "4":
                    System.out.println("Today is Thursday");
                    break;
                    case "5":
                    System.out.println("Today is Friday");
                    break;
                    case "6":
                    System.out.println("Today is Saturday");
                    break;
                    case "7":
                    System.out.println("Today is Sunday");
                    break;
                    default:
                    System.out.println("Invalid Option");
                }
            }
            break;
            case "Months":
            {
                System.out.println("Enter any Number From 1 to 12");
                in=(A.readLine());
                switch (in)
                {
                    case "1":
                    System.out.println("January");
                    break;
                    case "2":
                    System.out.println("February");
                    break;
                    case "3":
                    System.out.println("March");
                    break;
                    case "4":
                    System.out.println("April");
                    break;
                    case "5":
                    System.out.println("May");
                    break;
                    case "6":
                    System.out.println("June");
                    break;
                    case "7":
                    System.out.println("July");
                    break;
                    case "8":
                    System.out.println("August");
                    break;
                    case "9":
                    System.out.println("September");
                    break;
                    case "10":
                    System.out.println("October");
                    break;
                    case "11":
                    System.out.println("November");
                    break;
                    case "12":
                    System.out.println("December");
                    break;
                    default:
                    System.out.println("Invalid Option");
                }

            }
            break;
            default:
            System.out.println("Invalid Option");
        }
    }
}