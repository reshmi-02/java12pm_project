package superDemo;

public class Child extends Parent{

	public Child() {
		super();
		System.out.println("It is a child class constructor");
	}
	
	public void display() {
		System.out.println("It is a child method");
		super.demo();
		System.out.println(super.num);
		
	}
	
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.display();
	}
}
