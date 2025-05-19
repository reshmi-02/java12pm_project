package demo;

public class ControlStatement {

	public static void ifDemo() {
		
		int num=26;
		
		if(num%2==0) {  //false    1==0
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+"is a odd number");
		}
		
	} 
	
	public static void ifElse() {
		
		int num = 0;
		
		if(num>0) {  //0>0
			System.out.println(num+" is a positive number");
		}
		else if(num<0) {  //0<0
			System.out.println(num+" is a negative number");
		}
		else if(num==0) {//0==0
			System.out.println(num+" is a neutral number");
		}
		else {
			System.out.println("Invalid data");
		}
		
	}
	
	public static void nestedIf() {
		int num = 3;
		
		if(num%2==0) { // f
			
					System.out.println(num +"  is completely divisible by 2");
			
					if(num%4==0) {  //4
							System.out.println(num +"  is completely divisible by 4");
					}
					else {
							System.out.println(num +"  is not completely divisible by 4");
					}
			
		}
		else {
			System.out.println(num +"  is not completely divisible by 2");
		}
		
	}
	
	public static void switchDemo() {
		
		String browser="chrome";
		
		switch(browser) {
				case "edge":
					System.out.println("Edge browser");
					break;
				case "firefox":
					System.out.println("Firefox browser");
					break;
				case "chrome":
					System.out.println("Chrome browser");
					break;
				default:
					System.out.println("Enter a valid browser");
			
		}
	}
	
	public static void whileLoop() {
		
		//1 to 5
		
//		int num=5; 
//		
//		while(num<=5) {  //6<=5
//			
//			System.out.println(num);   //5
//			num++;   //6
//			
//		}

//		int num=4; 
//		
//		do {
//			System.out.println(num);  //4
//			num--; //3
//		}
//		while(num==1);  //3==1
		
		for(int i=5;i<=10;i++) {   //11<=10    11++
			System.out.println(i);   //10
		}

		
	}
	
	public static void loop() {
		
		for(int i=1;i<=5;i++) {   //6<=5
			
				for(int j=1;j<=i;j++) { //1<=5
						System.out.print("*  ");   //* * 
				}
				
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
//		ControlStatement.ifDemo();
//		ControlStatement.ifElse();
//		ControlStatement.nestedIf();
//		ControlStatement.switchDemo();
//		ControlStatement.whileLoop();
		ControlStatement.loop();
		
		
	}
}
