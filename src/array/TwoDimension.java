package array;

public class TwoDimension {

	public static void main(String[] args) {
		
		int numbers [][]= {   {12,34,56},{1,2,3},{123,456}   };
		
		System.out.println(numbers[1][2]);
		
		System.out.println(numbers.length);
		
		System.out.println(numbers[2].length);
		
//		for(int i=0;i<numbers.length;i++) {    //2<3
//			
//			for(int j=0;j<numbers[i].length;j++) {   //0<numbers[2].length   0<2
//				System.out.print(numbers[i][j]+" ");   //numbers[0][2]
//			}
//			System.out.println();
//		}
//		
		
		
		for(int []  singleDimension: numbers) {//{   {12,34,56},{1,2,3},{123,456}   };
			 
			for( int data : singleDimension) {  //singleDimension={12,34,56}  data=12
				System.out.print(data+" ");
			}
			
			System.out.println();	
		}
		
	}
	
}

//0  -> datas   numbers[0].length
//1 -> datas   numbers[1].length
//2  -> datas  numbers[2].length
