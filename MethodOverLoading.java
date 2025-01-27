package basicprograms.JavaBasics;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mv = new MethodOverLoading();

		mv.login(8888896340l); //Calling Static Parameterized overloading method by using reference object mv
		mv.login("venkateshv29@gmail.com");//Calling Static Parameterized overloading method by using reference object mv

		sub(10.9f, 2);  // calling non static parameterized overloading method
		sub(329, 219); //calling non static parameterized overloading method
	}


	//This method is a non static Parameterized method
	void login (long mobileNumber) {

		System.out.println("Login successfull with phoneNo "+mobileNumber);
	}

	//This method is a non static Parameterized method
	void login (String Email) {

		System.out.println("Login successfull with Email "+Email);

	}

	//This method is a static Parameterized method

	static void sub(int a , int b) {

		System.out.println(a-b);
	}

	static void sub(float a , int b) {

		System.out.println(b-a);
	}
}
