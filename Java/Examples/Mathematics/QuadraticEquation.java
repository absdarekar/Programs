package Mathematics;

import java.util.*;
public class QuadraticEquation
{
	public static void main(String atharv[])
	{
		Scanner A=new Scanner(System.in);
		double a=0,b=0,c=0,D=0,Al=0,Bt=0,abs=0;
		System.out.println("Enter the coefficient of ax2+bx+c=0 to find its roots");
		System.out.println("Enter a");
		a = A.nextDouble();
		System.out.println("Enter b");
		b = A.nextDouble();
		System.out.println("Enter c");
		c = A.nextDouble();
		D = Math.pow(b, 2) - (4 * a * c);
		if (D > 0)
		{
			System.out.println("The Roots are Real and Unequal");
			Al = (-b + Math.sqrt(D)) / 2 * a;
			Bt = (-b - Math.sqrt(D)) / 2 * a;
			System.out.println("The Roots are A=" + Al + " and B=" + Bt);
		}
		if (D < 0)
		{
			System.out.println("The Roots are Imaginary");
			abs = Math.abs(D);
			double sqrt_abs=Math.sqrt(abs);
			if (b != 0)
				System.out.println("The Roots are (" + b + " +- " + sqrt_abs + "i)" + "/" + 2 * a);
			if (b == 0)
				System.out.println("The Roots are (+-" + (sqrt_abs / (2 * a)) + "i)");
		}
		if (D == 0)
		{
			System.out.println("The Roots are Real and equal");
			Al = (-b) / 2 * a;
			System.out.println("The Root is " + Al);
		}	

	}
}	
