package basicprograms.JavaBasics;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticMethod sm = new StaticMethod();
		StaticMethod.Add();

	}

	static void Add() {

		int value1 = 12;

		int value2 = 23;

		System.out.println(value1+value2);
	}

}
