import java.util.*;
public class Distination
{
    public void Distination()
    {
        Scanner A=new Scanner(System.in);
        National obj=new National();
        International obj1=new International();
        String in;
        System.out.println("DESTINATION");
        System.out.println("1.NATIONAL");
        System.out.println("2.INTERNATIONAL");
        in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                obj.National();
            }
            break;
            case "2":
            {
                obj1.International();
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
    }
}