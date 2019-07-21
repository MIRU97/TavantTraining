package day1;

import java.util.Scanner;

public class Temperature {

		  static double ConvToFaren(double c)	{

			return (c*9/5)+32;
	}
		  static double ConvToCelsi(double f)

		{

			return (f-32)*5/9;

		}

		public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);

	System.out.println("Celsi =" );

	double c,f;

	c=sc.nextDouble();

	System.out.println("Faren =" );

	f=sc.nextDouble();

	System.out.println(" Convert value ="+ConvToFaren(c));

	System.out.println(" Convert value ="+ConvToCelsi(f));

	sc.close();
		}
}
