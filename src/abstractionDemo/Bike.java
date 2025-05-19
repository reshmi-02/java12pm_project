package abstractionDemo;

public abstract class Bike {   //abstract class

	
	int number = 20;
	
	public  void wheel() {      //non-abstract method    or not-static method
		System.out.println("Bike wheel");
	}
	
	public  abstract void bikeEngine();   //abstract method 
	
	
	
}
