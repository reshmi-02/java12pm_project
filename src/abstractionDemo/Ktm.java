package abstractionDemo;

public class Ktm extends Bike{

	@Override
	public void bikeEngine() {
		
		System.out.println("Ktm company creates a new bike engine");
	}

	public static void main(String[] args) {
		Ktm obj = new Ktm();
		obj.bikeEngine();
		obj.wheel();
	}
}
