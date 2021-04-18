package Patterns;
class Pyramid_Equilateral
{  
    public static void main(String atharv[]) 
    {
        int n=5;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 0; j < ( n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}

