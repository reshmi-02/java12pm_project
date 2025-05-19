package demo;

public class OperatorDemo {

	public static void arith() {
//		
//		System.out.println(10/20);
//		System.out.println(10%20);
		
		System.out.println('r'+'t');   //114+116
		
		System.out.println("oranium"+120);
		
		System.out.println('r'+120);  //114+120
		
		System.out.println('r'+"oranium");
		
		System.out.println("oranium"+true);
//		System.out.println(true+100);
//		System.out.println(true+'y');
	}
	
	
	public static void ternary() {
		
		int a=10,b=10;
		
	System.out.println(  (a==b)  ?  ( a + " is equal to " + b) : ( a + " is not equal to " + b )  );
		
		//10 is not equal to 20
	}
	
	
	public  static void incre() {
		
		int a=12;
		System.out.println(a++);  //12 (13) 
		System.out.println(a--);   //13 (12)
		
		
		int b=100, c=200;
//		int ans=b+c;
		
//		System.out.println(ans);
		
		b+=c;     b=b+c;
		c-=b;      c=c-b;
	}
	
	
	
	public static void main (String args []) {
		
		OperatorDemo.arith();
		OperatorDemo.ternary();
		OperatorDemo.incre();
		
	}
	
}
