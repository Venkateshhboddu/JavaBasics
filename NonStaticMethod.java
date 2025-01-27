package basicprograms.JavaBasics;

public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticMethod ns = new NonStaticMethod();
		ns.totalMarks();

	}

	void totalMarks() {

		int maths = 95;

		int physics = 80;

		int Chemistry = 75;

		int English = 89;

		int social =80;

		int Core = 90;

		int TotalMarks = maths+physics+Chemistry+English+social+Core;

		System.out.println("The Total marks: "+TotalMarks);
	}

}
