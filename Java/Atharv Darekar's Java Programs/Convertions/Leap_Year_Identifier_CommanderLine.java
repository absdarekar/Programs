package Convertions;
public class Leap_Year_Identifier_CommanderLine
{
    public static void main(String atharv[])
    {
        int stx,inyear;
        inyear=Integer.parseInt(atharv[0]);
        stx=inyear%4;
        if(stx==0)
            System.out.println("It's a Leap Year");
        else
            System.out.println("It's not a Leap Year");
    }
}
