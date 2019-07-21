package day1;

	import java.util.Scanner;

	public class Factorial {

	static int CalcFact(int j)

		{

			int i,f=1;

			for(i=1;i<=j;i++)

			{

			f=f*i;

			}

	 return f;

		}

	        public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int x;

			x=sc.nextInt();

			System.out.println("Factorial = "+CalcFact(x));

			sc.close();

			}
}
