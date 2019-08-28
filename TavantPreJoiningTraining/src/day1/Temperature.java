package day1;

import java.util.Scanner;

public class Temperature {

		  public double ConvertToFarenheit(double celsius)	{

			return (celsius*9/5)+32;
	}
		  public double ConvertToCelsius(double farenheit)

		{

			return (farenheit-32)*5/9;

		}

		public static void main(String[] args) {

			Scanner scanner= new Scanner(System.in);

	System.out.println("Celsius =" );

	double celsius,farenheit;

	celsius=scanner.nextDouble();

	System.out.println("Farenheit =" );

	farenheit=scanner.nextDouble();

        Temperature out=new Temperature();

	System.out.println(" Converted value ="+out.ConvertToFarenheit(celsius));

	System.out.println(" Converted value ="+out.ConvertToCelsius(farenheit));

	scanner.close();
		}
}
