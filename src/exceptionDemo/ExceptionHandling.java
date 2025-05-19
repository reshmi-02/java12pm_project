package exceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

		public static void main(String[] args) {
			
			try {

				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the number 1");
				int num1 = sc.nextInt();
				
				System.out.println("Enter the number 2");
				int num2 = sc.nextInt();
				
				
				System.out.println(num1/num2);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
//			catch(ArithmeticException  e) {
////				System.err.println("ArithmeticException handled");
////				System.err.println(e.getMessage());
//				e.printStackTrace();
//			}
//			catch(InputMismatchException e) {
//				e.printStackTrace();
//			}
			
			finally {
				System.out.println("--Ending--");
			}
		
			
		}
	
}
