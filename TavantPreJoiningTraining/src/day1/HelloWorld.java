package day1;

public class HelloWorld {

  String  getMessage() {

		String Str ="HelloWorld";

		return Str;
	}
	public static void main(String[] args) 
	{
		HelloWorld output=new HelloWorld();
		System.out.println(output.getMessage());
	}
}
