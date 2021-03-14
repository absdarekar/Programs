import java.io.*;
public class Range
{
  public static void main(String args[])throws IOException
  {
    int i=0,min=0,max=0;
    int[] array=new int[10];
    BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 10 integers");
    for(i=0;i<10;i++)
    {
      array[i]=Integer.parseInt(read.readLine());
    }
    max=array[0];
    for(i=0;i<10;i++)
    {
      if(max<=array[i])
      {
        max=array[i];
      }
    }
    min=array[0];
    for(i=0;i<10;i++)
    {
      if(min>=array[i])
      {
        min=array[i];
      }
    }
    System.out.println("The smallest integer is "+min);
    System.out.println("The largest integer is "+max);
  }
}
