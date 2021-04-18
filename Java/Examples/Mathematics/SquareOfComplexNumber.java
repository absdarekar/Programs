package Mathematics;

import java.util.Scanner;
import java.nio.channels.*;
public class SquareOfComplexNumber
{
	public static void main(String atharv[])
	{
		Scanner A=new Scanner(System.in);
		double x,y,sqrt,a,b;
		System.out.println("Enter Re(z)");
		x=A.nextDouble();
		System.out.println("Enter Im(z)");
		y=A.nextDouble();
		a=(x*x)-(y*y);
		b=2*x*y;
		System.out.println("Square =("+a+")+("+b+")i");
	}
}
