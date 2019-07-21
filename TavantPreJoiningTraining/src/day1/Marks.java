package day1;

import java.util.Scanner;

public class Marks {

	public static String IsPass(int p)

	{
		if(p>=40) 

		return "Pass";

		else

		return "Fail";
	}

	public static String MarkGrade(int p)

	{
		if(p>=90)

		return "Grade A";

		else if(p>=75&&p<90)

		return "Grade B";

		else if(p>=60&&p<75)

	    return "Grade C";

		else

		return  "Grade D";	

	}

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

      int m;

      System.out.println("Mark=");

      m=sc.nextInt();

      System.out.println(IsPass(m));

      System.out.println(MarkGrade(m));

      sc.close();
	} 
}