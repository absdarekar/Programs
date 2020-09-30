package Miscellaneous;
import java.io.*;
public class Quiz
{
    public static void main (String atharv[]) throws IOException
    {
        BufferedReader A=new BufferedReader (new InputStreamReader(System.in));
        int a,b,c,d,e;
        System.out.println("WELCOME TO QUIZ PROGRAMMED BY ATHARV DAREKAR");
        System.out.println("Q1.The Statment n+=4 is equivalent to:\n1.++n\n2.n=n+4\n3.n+1\n4.none");
        a=Integer.parseInt(A.readLine());
        switch(a)
        {
            case 1:
            System.out.println("Wrong Answer");
            break;
            case 2:
            System.out.println("Correct Answer");
            break;
            case 3:
            System.out.println("Wrong Answer");
            break;
            case 4:
            System.out.println("Wrong Answer");
            break;
            default:
            System.out.println("Error ");
        }
        System.out.println("Q2.Deafault value of Boolean data type is:\n1.False\n2.True\n3.1\n4.0");
        b=Integer.parseInt(A.readLine());
        switch(b)
        {
            case 1:
            System.out.println("Correct Answer");
            break;
            case 2:
            System.out.println("Wrong Answer");
            break;
            case 3:
            System.out.println("Wrong Answer");
            break;
            case 4:
            System.out.println("Wrong Answer");
            break;
            default:
            System.out.println("Error ");
        }
        System.out.println("Q3.What would be the output of a++;a=-1\n1.1\n2.0\n3.-1\n4.2");
        c=Integer.parseInt(A.readLine());
        switch(c)
        {
            case 1:
            System.out.println("Wrong Answer");
            break;
            case 2:
            System.out.println("Wrong Answer");
            break;
            case 3:
            System.out.println("Correct Answer");
            break;
            case 4:
            System.out.println("Wrong Answer");
            break;
            default:
            System.out.println("Error ");
        }
        System.out.println("Q4.A character litrel is enclosed in:\n1.Single Inverted comma\n2.Curly Brakets\n3.Squre Brackets\n4.Double Inverted comma");
        d=Integer.parseInt(A.readLine());
        switch(d)
        {
            case 1:
            System.out.println("Wrong Answer");
            break;
            case 2:
            System.out.println("Wrong Answer");
            break;
            case 3:
            System.out.println("Wrong Answer");
            break;
            case 4:
            System.out.println("Correct Answer");
            break;
            default:
            System.out.println("Error ");
        }
        System.out.println("Q5.What type of value is returned by sqrt function:\n1.Float\n2.Double\n3.Integer\n4.All");
        e=Integer.parseInt(A.readLine());
        switch(e)
        {
            case 1:
            System.out.println("Wrong Answer");
            break;
            case 2:
            System.out.println("Correct Answer");
            break;
            case 3:
            System.out.println("Wrong Answer");
            break;
            case 4:
            System.out.println("Wrong Answer");
            break;
            default:
            System.out.println("Error ");

        }

        System.out.println("THAKNK YOU!!!");
    }
}
