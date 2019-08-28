package day1;

import java.util.Scanner;

public class MarkUsingSwitch {
	
		 public String MarkValidator(int marks)
		 {

			 for(int i=1;i<=4;i++)

			 {

				 switch(i)

				 {

				 case 1: if(marks>=90) return "Grade A";

				 break;

				 case 2: if(marks>=75&&marks<90) return "Grade B";

				 break;

				 case 3: if(marks>=60&&marks<75) return "Grade C";

				 break;

				 case 4: if(marks<60) return "Grade D";	 
				 }

			 }
			return null;
		}
		 
		public static void main(String[] args) {

			Scanner scanner =new Scanner(System.in);

			int m;
			
			m=scanner.nextInt();

			MarkUsingSwitch out=new MarkUsingSwitch();
			
			System.out.println(out.MarkValidator(m));

			scanner.close();
		}
	}

