package demo;

public class Intro{

//	int num1=10,num2=30;   //variable 
//	byte a=100;
//	float c = 12;   
//	boolean boo = true;  //instance or global variable 
	
	 static String word="java";
	
	
	 void display(   ) {     //method
		int data=120; //local variable 
		
//		static int number=100;
		
//		System.out.println("data1 = " + num1); 
//		System.out.println("data2 = "+num2);
//		System.out.println("number = "+data);
		
		System.out.println("word ="+word);
	}
	
	
	public static void main (String args []) {  //main method
		
		Intro obj = new Intro();  //object creation 
		
//		static int number=100;
		
//		System.out.println(Intro.word);
//		obj.display();
		
//		char gender = 'f';  //local variable 
//		System.out.println("gender = "+gender);
//		
//		System.out.println("Display method : ");  //print
//		obj.display();  //function calling 
//		System.out.println("Total = " + (obj.num1+obj.num2) ); // variable calling
		
	int rows=3, num=1;
				for(int i=1;i<=rows;i++){
				for(int j=1;j<=i;j++){
				System.out.print((num)+" ");
				num++;
				}
				System.out.println();
				}
	}
		
	
	
}
