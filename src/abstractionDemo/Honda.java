package abstractionDemo;

public class Honda  extends Bike{

	@Override
	public void bikeEngine() {
	System.out.println("Honda company creates a new bike engine");	
	}
	
	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.bikeEngine();
		obj.wheel();
		
		System.out.println(obj.number);
		obj.number=200;
		System.out.println(obj.number);
	}
}
