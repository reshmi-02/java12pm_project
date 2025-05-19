package polymorphism;

public class MethodOverloading {

	public static void add() {
		
		int a=10,b=30;
		System.out.println("output =  "+ (a+b));
	}

	
	public static void add(int a,double b) {
		
		System.out.println("output =  "+ (a+b));
	}
	
	public static void add(String a,double b) {
		System.out.println("output =  "+ (a+b));
	}
	
	public static void add(double b,String a) {
		System.out.println("output =  "+ (a+b));
	}
	
	public static void add(int a , double b , int c) {
		System.out.println("output = "+ (a+b+c));
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading.add();
		MethodOverloading.add(12.34, "priya");
		MethodOverloading.add(100, 10.20);
		MethodOverloading.add("oranium", 12.34);
		MethodOverloading.add(12, 12.34, 10);

//		System.out.printl
	}
	
}
