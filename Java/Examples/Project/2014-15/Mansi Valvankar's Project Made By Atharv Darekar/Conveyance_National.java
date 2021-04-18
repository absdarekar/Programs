import java.util.*;
public class Conveyance_National
{
    public void Conveyance_National()
    {
        Span obj=new Span();
        Scanner A=new Scanner(System.in);
        System.out.println("CONVEYANCE PREFIERED");
        System.out.println("1.TRAIN");
        System.out.println("2.PLANE");
        System.out.println("3.ROAD");
        String in=A.nextLine();
        switch(in)
        {
            case "1":
            {
                obj.Span();
            }
            break;
            case "2":
            {
                obj.Span();
            }
            break;
            case "3":
            {
                obj.Span();
            }
            break;
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
    }
}
