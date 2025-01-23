package basicprograms;

public class StaticParameterizedMethod {

	public static void main(String[] args) {
		
		add(8, 9);
		multi(8, 8.3f);

	}
	
	static void add(int a,int b)
	{
		int c =a+b;
		System.out.println("the sum = "+c);
	}

	static void multi(int a , float b) {
		
		System.out.println(a*b);
	}
}
