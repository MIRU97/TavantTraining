package day1;

	import java.util.Scanner;

	public class Factorial {

	int CalculateFactorial(int value)

		{

			int i,fact=1;

			for(i=1;i<=value;i++)

			{

			fact=fact*i;

			}

	 return fact;

		}

	        public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			int factorial;

			factorial=scanner.nextInt();
			
                        Factorial out=new Factorial();
			
			System.out.println("Factorial = "+out.CalculateFactorial(factorial));

			scanner.close();

			}
}
