package inheritance;

public class Son2 extends Parent{

	public void son2Method() {
		System.out.println("Son2 method");
	}
	
	public static void main(String[] args) {
		
		Son2 obj = new Son2();
		obj.son2Method();
		obj.parentMethod();
		obj.grandParentMethod();
	}
}
