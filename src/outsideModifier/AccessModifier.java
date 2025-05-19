package outsideModifier;

import accessModifier.Bike;

public class AccessModifier extends Bike{

	public static void main(String[] args) {
		
//		Bike obj = new Bike();
		AccessModifier obj = new AccessModifier();
		obj.demo();
		System.out.println(obj.a);
	}
}
