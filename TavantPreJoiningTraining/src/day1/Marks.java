package day1;

import java.util.Scanner;

public class MarkValidator {

	public String IsPass(int p)

	{
		if(p>=40) 

		return "Pass";

		else

		return "Fail";
	}

	public String MarkGrade(int p)

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

	Scanner scanner = new Scanner(System.in);

      int m;

      System.out.println("Mark=");

      m=scanner.nextInt();

      MarkValidator out=new MarkValidator();
		
      System.out.println(out.IsPass(m));

      System.out.println(out.MarkGrade(m));

      scanner.close();
	} 
}
