package Mathematics;

import java.util.*;

public class MathematicalTableForGargi
{
	public static void main(String[] atharv)
	{

		Scanner A=new Scanner(System.in);
		System.out.println("Enter the number of which mathematical table is required");
		int in=A.nextInt();
		int i=0;
		for (i = 1;i <= 10;i++)
			System.out.println("\n" + in + " × " + i + " = " + in * i);
	}
}
