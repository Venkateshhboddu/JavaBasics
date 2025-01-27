package basicprograms.JavaBasics;

public class NonStaticParameterizedMethod {

	public static void main(String[] args) {


		NonStaticParameterizedMethod npm = new NonStaticParameterizedMethod();

		npm.div(40, 5);

		npm.sub(54, 29);

	}

	void sub(int a , int b) {

		int subtract = a-b;

		System.out.println("The value of sub is : " +subtract);
	}

	void div (int x ,int y) {

		int div = x/y;

		System.out.println("The value of div : " +div);

	}


}
