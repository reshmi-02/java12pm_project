package demo;

public class MethodTyppes {

	public void add() {
		System.out.println("---without parameter and without return type---");
		int a=10,b=20;
		System.out.println("Ans = "+(a+b));
	}
	
	
	public void sub(int a,int b) {
		
		System.out.println("---with parameter and without return type---");
		System.out.println("Ans = "+(a-b));
		
	}
	
	public static  int multi() {
		System.out.println("---without parameter and with return type---");
		int a=2,b=10;
		return a*b;  //20
	}
	
	
	public int div(int a,int b) {
		System.out.println("---with parameter and with return type---");
		return a/b;
	}
	
	public static void main(String[] args) {
		
		MethodTyppes obj = new MethodTyppes();
		obj.add();
		obj.sub(20,10);
//		int multi = obj.multi();   //20
//		System.out.println(multi);
		
		System.out.println(obj.multi());
		
		System.out.println(obj.div(20, 5));
	}
}
