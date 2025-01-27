package basicprograms.JavaBasics;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;

		int b = 200 ;

		if (b>a && a<b)
		{
			System.out.println("This AND Block will be executed");
		}

		if( b<a || b>a) {

			System.out.println("This OR block will be executed if any one of the condition matched");

		}

		if (!(b<a && a<b))
		{
			System.out.println("This AND not Block will be executed though condtion not matched");
		}

		if(!(b<a || b==a))
		{

			System.out.println("This OR not block will be executed though condition not matched");

		}

	}

}
