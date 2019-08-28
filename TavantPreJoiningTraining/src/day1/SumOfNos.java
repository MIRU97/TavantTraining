package day1;

import java.util.Scanner;

public class SumOfNumbers {

	 int SumOfEvenNumbers(int firstnumber,int lastnumber)

			{
              	int i,m=0;

				for(i=firstnumber;i<=lastnumber;i++)
				{
                 	if(i%2==0)
					{
						m=m+i;
					}
				}

				return m;
			}

		  int SumOfOddNumbers(int firstnumber,int lastnumber)

			{

				int i,n=0;

				for(i=firstnumber;i<=lastnumber;i++)

				{

					if(i%2!=0)

					{
						n=n+i;
					}
				}
				return n;
			}
     public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			int begin,terminate;
			
            begin=scanner.nextInt();

		    terminate=scanner.nextInt();

	     SumOfNumbers out=new SumOfNumbers();
	     
		    System.out.println("EVEN SUM="+out.SumOfEvenNumbers(begin,terminate) );

			System.out.println("ODD SUM="+out.SumOfOddNumbers(begin,terminate) );

			scanner.close();
		}
	}

