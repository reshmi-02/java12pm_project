package inheritance;

public class Child extends Parent{     //parent data , method + child -> data +method
//	grnadparent ,parent , child 
	int bike = 2;
	
	
	public void childMethod() {
		System.out.println("It is a child method");
	}
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.childMethod();
		obj.parentMethod();
		obj.grandParentMethod();
		System.out.println(obj.bike);
		System.out.println(obj.house);
		System.out.println(obj.land);
	}
	
}
