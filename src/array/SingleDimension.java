package array;

public class SingleDimension {

	
	
	public static void main(String[] args) {
		
		int numbers [ ]= {12,34,5,6,7};   //length - 5    last data index value = (length-1)
		
		System.out.println(numbers[0]);
		System.out.println(numbers.length);
		
		
//		for(int i=0;i<numbers.length;i++) {   //2<5
//			System.out.println(numbers[i]); //   //numbers[2]
//		}
		
		for(int  data : numbers ) {  //numbers ={12,34,5,6,7}  data=12
			if(data%2==0) {
				System.out.println(data);
			}
		}
		
		
//		int [ ] numbers2= {12,34,5,6,7};
//		
//		int  numbers3 [ ] = new int [5];
//		numbers3[0]=1;
//		numbers3[1]=2;
//		numbers3[2]=3;
//		numbers3[3]=4;
//		numbers3[4]=5;
		
		
		
		
	}
	
}
