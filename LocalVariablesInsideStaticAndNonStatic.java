package basicprograms.JavaBasics;

public class LocalVariablesInsideStaticAndNonStatic {

	public static void main(String[] args)
	{
		Add(10, 52.9);
		
		LocalVariablesInsideStaticAndNonStatic lv = new LocalVariablesInsideStaticAndNonStatic();
		
		lv.sub(56, 20);
	}

	//Static method
	static void Add(int a, double b) {
		
		System.out.println(a+b);
	}
	
	void sub(int x , int z) {
		
		System.out.println(x-z);
	}
	
}
