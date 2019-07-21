package day1;

import java.util.Scanner;

public class MarkUsingSwitch {
	
		 public static String MarkGrad(int p)
		 {

			 for(int i=1;i<=4;i++)

			 {

				 switch(i)

				 {

				 case 1: if(p>=90) return "Grade A";

				 break;

				 case 2: if(p>=75&&p<90) return "Grade B";

				 break;

				 case 3: if(p>=60&&p<75) return "Grade C";

				 break;

				 case 4: if(p<60) return "Grade D";	 
				 }

			 }
			return null;
		}
		 
		public static void main(String[] args) {

			Scanner sc =new Scanner(System.in);

			int m;
			
			m=sc.nextInt();

			System.out.println(MarkGrad(m));

			sc.close();
		}
	}

