package Mathematics;

import java.util.*;

public class RootsOfComplexNumber
{
	public static void main(String[] atharv)
	{
		Scanner A=new Scanner(System.in);
		double a,b=0,x,y,m,n;
		System.out.println("Enter Re(z)");
		x = A.nextDouble();
		System.out.println("Enter Im(z)");
		y = A.nextDouble();
		m = (-4 * x + (Math.sqrt((16 * x * x) + (16 * y * y)))) / 8;
		n = (-4 * x - (Math.sqrt((16 * x * x) + (16 * y * y)))) / 8;
		if (m > 0)
			b = Math.sqrt((-4 * x + (Math.sqrt((16 * x * x) + (16 * y * y)))) / 8);
		else
		if (n > 0)
			b = Math.sqrt((-4 * x - (Math.sqrt((16 * x * x) + (16 * y * y)))) / 8);
			
			a=y/(2*b);
			System.out.println("\nThe Roots are +-("+a+"+("+b+"i))");
	}
}
