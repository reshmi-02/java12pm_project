package inheritance;

public class Son1 extends Parent{

	public void son1Method() {
		System.out.println("Son1 method");
	}
	
	
	public static void main(String[] args) {
		
		Son1 obj = new Son1();
		obj.son1Method();
		obj.parentMethod();
		obj.grandParentMethod();
		
	}
}
