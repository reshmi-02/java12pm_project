package staticDemo;

public class StaticDemo {

	int id;
	String name ;
	static String cname;
	
	static {
		cname="Anna Univ";
	}
	public void studentDetails(int id , String name , String cname) {
		
		this.id=id;
		this.name=name;
		this.cname=cname;
		System.out.println("--Student detail--");
		System.out.println("Name of the student : "+name);
		System.out.println("Student id : "+id);
		System.out.println("Student clg name : "+cname);
		
	}
	
	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo();
		obj.studentDetails(1, "Priya", cname);
		obj.studentDetails(2, "Swetha",cname );
	}
	
}
