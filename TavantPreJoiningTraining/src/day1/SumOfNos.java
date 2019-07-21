package day1;

import java.util.Scanner;

public class SumOfNos {

	static int SumOfEvenNos(int s,int f)

			{
              	int i,m=0;

				for(i=s;i<=f;i++)
				{
                 	if(i%2==0)
					{
						m=m+i;
					}
				}

				return m;
			}

		 static int SumOfOddNos(int s,int f)

			{

				int i,n=0;

				for(i=s;i<=f;i++)

				{

					if(i%2!=0)

					{
						n=n+i;
					}
				}
				return n;
			}
     public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int b,t;
			
            b=sc.nextInt();

		    t=sc.nextInt();

		    System.out.println("EVEN SUM="+SumOfEvenNos(b,t) );

			System.out.println("ODD SUM="+SumOfOddNos(b,t) );

			sc.close();
		}
	}

