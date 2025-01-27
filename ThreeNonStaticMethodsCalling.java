package basicprograms.JavaBasics;

public class ThreeNonStaticMethodsCalling {

	public static void main(String[] args) {

		ThreeNonStaticMethodsCalling nm = new ThreeNonStaticMethodsCalling();
		nm.add();
		nm.mul();
		nm.sub();
	}

	void add() {
		int a =10;
		int b =30;
		System.out.println("The value of A+B is: " +a+b);
	}

	void mul() {
		int d=5;
		int e=6;
		System.out.println("The value of d*e: "+d*e);
	}

	void sub() {
		int x =2000;
		int z = 1050;
		System.out.println("The value of x-z: " +(x-z));
	}
}
