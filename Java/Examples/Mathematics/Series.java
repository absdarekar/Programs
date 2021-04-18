import java.io.*;
public class Series
{
  public static void main(String args[])throws IOException
  {
    String opt="";
    int term=0;
    float i=0,sum=0;
    BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 1 or 2");
    opt=read.readLine();
    switch(opt)
    {
      case "1":
      {
        term=getTerm(read);
        for(i=1;i<=term;i++)
        {
          sum+=1/(4*i);
        }
        System.out.println(sum);
      }
      break;
      case "2":
      {
        term=getTerm(read);
        for(i=1;i<=term;i++)
        {
          if(i%2==0)
            sum+=i/calculateFactorial(i);
          else
            sum-=i/calculateFactorial(i);
        }
        System.out.println(sum);
      }
      break;
      default:
      {
        System.out.println("Invalid option");
      }
    }
  }
  public static int getTerm(BufferedReader read)throws IOException
  {
    int term=0;
    System.out.println("Enter the nth term for the series");
    term=Integer.parseInt(read.readLine());
    return term;
  }
  public static float calculateFactorial(float num)
  {
    int i=0,factorial=1;
    for(i=1;i<=num;i++)
      factorial*=i;
    return factorial;
  }
}
