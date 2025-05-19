package polymorphism;

public class Child extends MethodOverriding{
	 
	public static void display() {
		System.out.println("It is a child display method");
	}
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.display();
		
		MethodOverriding obj1 = new MethodOverriding();
		obj1.display();
	}
}
