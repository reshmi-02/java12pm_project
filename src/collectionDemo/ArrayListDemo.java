package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		TreeSet <Object> arr = new TreeSet<>();
		
		arr.add("Oranium");
		arr.add("priya");
		arr.add("fabevy");
		arr.add("Swetha");
		arr.add("1234");
		
		
		System.out.println(arr);
		System.out.println(arr.size());
		
		
	arr.remove("Oranium");
	System.out.println(arr);
	
	for(Object data : arr) {
		System.out.println(data);
	}
		
//		for(int i = 0 ; i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
//		
//		
//		
		
	}
	
}
