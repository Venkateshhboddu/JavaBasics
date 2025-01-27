package basicprograms.JavaBasics;

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading cv = new ConstructorOverloading();  // this object will only call First constructor
		
		ConstructorOverloading cv1ConstructorOverloading = new ConstructorOverloading(10,20);

	}
	
	ConstructorOverloading(){
		
		System.out.println("This method is a constructor");
	}
	
    ConstructorOverloading(int a,int b){
    	
    	System.out.println("This will mul oof a*b : "+a*b);
    	
    }
	

}
