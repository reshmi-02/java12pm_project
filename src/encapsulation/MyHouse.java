package encapsulation;

public class MyHouse {

	
	public static void main(String[] args) {
		
		FriendHouse obj = new FriendHouse();  //constructor calling
		
//		System.out.println(obj.lockerAmt);
//		obj.lockerAmt=2000;
//		System.out.println(obj.lockerAmt);
		
//	int lockerAmt = obj.getLockerAmt();
//	System.out.println(lockerAmt);
		
		System.out.println(obj.getLockerAmt());
		
		obj.setLockerAmt(2000);
		
		System.out.println(obj.getLockerAmt());
	}
}
