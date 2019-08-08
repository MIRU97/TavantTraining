package day1;

	import java.util.Scanner;

	public class Factorial {

	int CalculateFactorial(int j)

		{

			int i,f=1;

			for(i=1;i<=j;i++)

			{

			f=f*i;

			}

	 return f;

		}

	        public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			int x;

			x=scanner.nextInt();

			System.out.println("Factorial = "+CalculateFactorial(x));

			scanner.close();

			}
}
