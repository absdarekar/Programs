
import java.io.*;
public class TrianglePatterns
{
  public static void main(String args[]) throws IOException
  {
    int i=0,j=0;
    String opt="";
    BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 1 for triangle");
    System.out.println("Enter 2 for inverted triangle");
    opt=read.readLine();
    switch(opt)
    {
      case "1":
      {
        for(i=1;i<=5;i++)
        {
          for(j=1;j<=i;j++)
          {
            System.out.print(i+" ");
          }
          System.out.println();
        }
      }
      break;
      case "2":
      {
        for(i=5;i>=1;i--)
        {
          for(j=1;j<=i;j++)
          {
            System.out.print(i+" ");
          }
          System.out.println();
        }
      }
      break;
      default:
      {
        System.out.println("Invalid option");
      }
    }
  }
}
