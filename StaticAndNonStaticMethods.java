package basicprograms.JavaBasics;

public class StaticAndNonStaticMethods {

	public static void main(String[] args) {

		StaticAndNonStaticMethods SNon = new StaticAndNonStaticMethods();

		SNon.subtraction(); //it call the non static method

		StaticAndNonStaticMethods.addition(); // this will call static method

	}

	public static void addition()
	{
	  int a =50;
	  int b =30;
	  int c =a+b;
	  System.out.println("The addition of a+b is : "+c);
	}

	void subtraction()
	{
		int H = 60;
		int G = 40;
		int sub =H-G;
		System.out.println("The subtraction of H-G is : "+sub);
	}


}
