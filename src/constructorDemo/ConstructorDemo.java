package constructorDemo;

public class ConstructorDemo {
	int a;
	public ConstructorDemo() {    //default constructor 
		this(10,20);
		System.out.println("Default Constructor");
		a=20;
		System.out.println(a);
	}
	
	public ConstructorDemo(int a, int b) {
		this(100,10,12.30);
		System.out.println(a+b);
		
	}
	
	public ConstructorDemo(int a, int b,double c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) { 
		ConstructorDemo obj = new ConstructorDemo();
//		ConstructorDemo obj1 = new ConstructorDemo(10,20);
//		ConstructorDemo obj2 = new ConstructorDemo(100,200,12.50);
	}
}
