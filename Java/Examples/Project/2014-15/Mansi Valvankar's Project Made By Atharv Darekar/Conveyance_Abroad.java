import java.util.*;
public class Conveyance_Abroad
{
    public void Conveyance_Abroad()
    {
        Scanner A=new Scanner(System.in);
        Span obj=new Span();
        System.out.println("CONVEYANCE PREFIERED");
        System.out.println("1.SHIP");
        System.out.println("2.PLANE");
        String in=A.nextLine()	;
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
            default:
            {
                System.out.println("INVALID OPTION");
            }
        }
    }
}