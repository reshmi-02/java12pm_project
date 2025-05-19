package stringDemo;

public class StringDemo {

	public static void main(String[] args) {
		
//		String data = "oranium";   
//		String data2= "oranium";
//		
//		String data3=new String("oranium");
//		
//		
//		System.out.println(data==data2);
//		System.out.println(data.equals(data2));
//		
//		System.out.println(data2==data3);
//		System.out.println(data2.equals(data3));
		
		
		String data = "swetha";
		String data2="PRIYA";
		String data3="      java session       ";
		
		System.out.println(data2.toLowerCase());
		System.out.println(data.toUpperCase());
		
		System.out.println(data.length());
		
		System.out.println(data.charAt(2));
		
		System.out.println(data.indexOf('e'));  //e
		
		System.out.println(data3.trim());
		
		System.out.println(data.concat(data2));
				
		System.out.println(data.contains("the"));
		
		char[] charArray = data.toCharArray();//{'s','w','e',t','h',a' }
		
		for(char value:charArray) {
			
			System.out.println(value);
		}
		
		
		for(int i=0;i<data2.length();i++) {
			
			System.out.println(data2.charAt(i));
			
		}
		
		
	}
}
