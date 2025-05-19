package interfaceDemo;

public class Ktm implements Bike,Bike2{

	@Override
	public void bikeEngine() {
	System.out.println("ktm new bike engine");
		
	}
	
	public static void main(String[] args) {
		Ktm obj = new Ktm();
		obj.bikeEngine();
		obj.wheel();
		System.out.println(obj.number);
//		obj.number=200;
	}

	@Override
	public void wheel() {
		System.out.println("ktm new wheel");
		
	}

	
}
