import java.util.Scanner;
public class Cipher
{
  public static void main(String args[])
  {
    String word="";
    char character;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter a sentence");
    while(read.hasNext())
    {
      word=read.next();
      character=word.charAt(0);
      System.out.print(Character.toUpperCase(character)+".");
    }
  }
}
