package demo;

import java.util.Arrays;
import java.util.HashMap;

public class Task {

	public static void gender() {
		String gender="m";
		
		switch(gender) {
		case "m":
		case "M":
			System.out.println("Male");
			break;
		case "F":
		case "f":
			System.out.println("Female");
			break;
		}
		
		
	}
	
	public static void ascending() {
		
		int a=300,b=200,c=100;
		System.out.println("--Ascending order of 3 numbers--");
		if(a<b && a<c) {
			if(b<c) {
				System.out.println(" a = "+a +" b = "+b+" c = "+c);
			}
			else {
				System.out.println(" a = "+a +" c = "+c+" b = "+b);
			}
		}
		
		else if(b<a && b<c) {
			if(c<a) {
				System.out.println(" b = "+b +" c = "+c+" a = "+a);
			}
			else {
				System.out.println(" b = "+b +" a = "+a+" c = "+c);
			}
		}
		
		else {
			if(a<b) {
				System.out.println(" c = "+c +" a = "+a+" b = "+b);
			}
			else {
				System.out.println(" c = "+c +" b = "+b+" a = "+a);
			}
		}
		
	}
	
	
public static void biggestNum() {
	int a=10,b=300,c=20;
	
	if(a>b && a>c) {
		System.out.println(a+" is the biggest number");
	}
	else if (b>a && b>c) {
		System.out.println(b+" is the biggest number");
	}
	else {
		System.out.println(c+" is the biggest number");
	}
	
}
	

public static void circle() {
	
	double pi=3.14;
	int r=2;
	
	System.out.println("Area of circle = "+(pi*r*r));
	
}
	
	public static void factorial() {
		int num=5,temp=1;
		
		for(int i=1;i<=num;i++) {   //3<=5
			temp=temp*i;    //temp=2*3  = 6
		}
		
		System.out.println("Factorial of "+num+" is  "+ temp);
	}
	
	public static void naturalNum() {
		int n=5,temp=0 ;
		for(int i=0;i<=n;i++) {
			temp=temp+i;
		}
		
		System.out.println("Sum of  n natural number is "+temp);
	}
	
	public static void fibonacci() {
		
		int a=0,b=1,temp=0;    //0(a)  1(b)   1
		
		for(int i=1;i<=4;i++) {  //3<=4
			temp=a+b;    //temp=3
			a=b;      //a=2
			b=temp;    //b=3
			
			
		}
		
		System.out.println("Fibonacci series of 4 terms is "+temp);
	}
	
	
	public static void reverseNum() {
		int num = 123,rev=0;
		
		while(num!=0) {   // 0!=0
			int rem=num%10;    //1%10 = 1
			num=num/10;         //1/10   ->0
			rev=rev*10+rem;       //rev=32*10 + 1   = 321
		}
		
		System.out.println("Reverse the number is "+rev);
	}
	
	public static void boxPattern() {
		for(int i=1;i<=4;i++) {     //2<=4
			
			for(int j=1;j<=4;j++) {  //5<=4
				
				if( j==1 || j==4 || i==1 || i==4) {   //*     *
					System.out.print("* ");
				}
				else {
					System.out.print("   ");
				}
				
			}
			
			System.out.println();
		}
	}
	
	public static void reverseArray(int[] arr) {
//[]   0  to 5     
        
        System.out.println("Reversed Array:");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();    
     
//        or
        
        
         int []  rev = new int [arr.length];      //ARR={12,3,45,67,89}
//		length = 5 , last index = 4 
		
		for(int i=(arr.length-1);i>=0;i--) {  //3    3>=0
			
		rev[arr.length-(i+1)]=arr[i];  //rev[ 1]  rev[1]
			
		}
		
		System.out.println(Arrays.toString(rev));
    }
	
	
	public static void sortArrAscending() {
		
		int arr[]= {123,103,45,67,89}; 
		
		
        for (int i = 0; i <arr.length  - 1; i++) {   //0<4
            for (int j = i + 1; j < arr.length; j++){   //1<5 
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array sorted in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
	
	
	public static void sortArrDescending() {
		int arr [ ]= {120,103,45,67,8,67};
		
		 for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] < arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	        System.out.println("Array sorted in descending order:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	}
	
	
	public static void dublicates() {
		int arr []= {120,103,45,33,45,67,50,67,89};
		
//		 boolean hasDuplicates = false;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]);
//	                    hasDuplicates = true;
	                    break;
	                }
	            }
	        }
	}
	
	
	public static void pyramid() {
		
		int rows=3;
		 System.out.println("Pyramid Pattern:");
	        for (int i = 1; i <= rows; i++) {
	            // Print spaces for alignment
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
	            }
	            // Print stars or numbers for the pyramid
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	}
	
	
	public static void flyod() {
		
		int num =0 ; 
		
		for(int i =1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				num++;
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void removeDublicate() {
		 // Original array with duplicates
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        
        // Length of the original array
        int n = arr.length;
        
        // New array to store unique values
        int[] uniqueArr = new int[n]; // maximum size to store unique values
        
        int uniqueIndex = 0; // Index to insert unique elements in the new array
        
        // Iterate over the original array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // Check if the element is already in the uniqueArr
            for (int j = 0; j < uniqueIndex; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If it's not a duplicate, add it to the new array
            if (!isDuplicate) {
                uniqueArr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        
        // Create a new array of the exact size of unique elements
        uniqueArr = Arrays.copyOf(uniqueArr, uniqueIndex);
        
        // Output the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }


	public static void prime() {
		
		int num=5;
		
		 if (num <= 1) {
	            System.out.println(num + " is not a prime number.");
	        } else {
	            boolean isPrime = true; // Assume the number is prime initially
	            
	            if(num==2) {
	            	isPrime=true;
	            }
	            
	            else {
	            	 // Loop through all numbers from 2 to num-1
		            for (int i = 2; i<num; i++) {
		                // If num is divisible by any number, it's not prime
		                if (num % i == 0) {
		                    isPrime = false;
		                    break; // No need to check further if we found a divisor
		                }
		            }
	            }

	            // Output the result
	            if (isPrime) {
	                System.out.println(num + " is a prime number.");
	            } else {
	                System.out.println(num + " is not a prime number.");
	            }
	        }

	}
	
	public static void palindrome() {
		int num = 121,rev=0;
		int temp=num;
		
		while(num!=0) {   // 0!=0
			int rem=num%10;    //1%10 = 1
			num=num/10;         //1/10   ->0
			rev=rev*10+rem;       //rev=32*10 + 1 =  321
		}
		
		System.out.println("Reverse the number is "+rev);
		System.out.println("Given number is "+temp);
		if(rev==temp){
				System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
		
	}
	
	
	public static void butterflyPattern() {
		// Number of rows
        int N = 5;

        // Variables to store number of spaces and stars
        int spaces = 2 * N - 1; //7
        int stars = 0; //1

        // The outer loop will run for (2 * N - 1) times
        for (int i = 1; i <= 2 * N - 1; i++) {
            // Upper half of the butterfly
            if (i <= N) {
                spaces = spaces - 2;
                stars++;
            }
            // Lower half of the butterfly
            else {
                spaces = spaces + 2;
                stars--;
            }
            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= stars; j++) {
                if (j != N) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}
	
	public static void occuranceOfEachCharacter(String word) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] charArray = word.toCharArray();
		
//		with space count 
//		for(char letter:charArray) {
//			
//			if(map.containsKey(letter)) {
//				map.put(letter, map.get(letter)+1);
//			}
//			else {
//				map.put(letter, 1);
//			}
//			
//		}
//		
//		System.out.println(word + " : " + map);
		
		
//		without space count
//for(char letter:charArray) {
//			
//			if(String.valueOf(letter).isBlank()==false) {
//				if(map.containsKey(letter)) {
//					map.put(letter, map.get(letter)+1);
//				}
//				else {
//					map.put(letter, 1);
//				}
//			}
//			
//		}
//		
//		System.out.println(word + " : " + map);
		
		
		//chracter occurance like aabbbcc
for(char letter:charArray) {
			
			
				if(map.containsKey(letter)) {
					map.put(letter, map.get(letter)+1);
				}
				else {
					map.put(letter, 1);
				}
			
			
		}
		
		for(Character  letter : map.keySet()) {
			System.out.print((letter )+""+ (map.get(letter)));
		}
		
	}
	
	
	public static void reverseStirng(String word)	{
		
		String reverse="";  //word =oranium   mu 
		
		for(int i=(word.length()-1);i>=0;i--) {
		
			reverse=reverse+word.charAt(i);
		}
		
		System.out.println("Reverse the string : "+reverse);
	}
	
	public static void stringPalindrome(String word) {
		
		String reverse="";
		
		for(int i=(word.length()-1);i>=0;i--) {
			
			reverse=reverse+word.charAt(i);
		}
		
		System.out.println(word);
		System.out.println(reverse);
		
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
			
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
	
	
	public static void VowelsConsonantCOunt(String word) {
		
		int vowels=0,consonant=0;
		String data=word.toLowerCase();
		
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i) == 'a' || data.charAt(i) == 'e' || data.charAt(i) == 'i' || data.charAt(i) == 'o' ||data.charAt(i) == 'u') {
				vowels++;
			}
			else {
				consonant++;
			}
		}
		
		System.out.println("Vowels count : "+vowels);
		System.out.println("consonant count : "+consonant);
	}
	
	public static String removeDuplicateString(String input) {
		String[] words = input.split(" ");   //{TEA,IS , VERY,VERY,HOT}
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {   //4<5
            boolean found = false;  
            for (int j = 0; j < i; j++) {  //0<4
                if (words[i].equals(words[j])) {  //WORDS[3] .EQUALS(WORDS[1])
                    found = true;
                    break;
                }
            }
            if (!found) {    
                output.append(words[i]).append(" ");
            }
        }

        return output.toString().trim();

	}
	
	
	public static void capitalizeFirstWord() {
		String input = "hi oranium tech";
        char[] chars = input.toCharArray();  // {H,i,}

        //Capitalize first letter if it's a lowercase letter
        if (chars[0] >= 'a' && chars[0] <= 'z') {
            chars[0] = (char)(chars[0] - 32);  //upper case value 
        }

        //Print result
        for (int i = 0; i< chars.length; i++) {
            System.out.print(chars[i]);
        }
	}
	
	
	public static void findDublicateCharacters(String input) {
		input = input.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        for (int i = 0; i < input.length(); i++) {  //1<11   PROGRAMMING
            int count = 0;
            for (int j = 0; j < input.length(); j++) {   //0<11 
                if (input.charAt(i) == input.charAt(j)) { //  CHARAT(1) == CHARAT(1) 
                    count++;  //2
                }
            }
            if (count > 1 && i == input.indexOf(input.charAt(i))) {  //2 &&  1==1
                System.out.print(input.charAt(i)); // Print the character if it's a duplicate and it's the first occurrence
            }
        }

	}
	
	public static void main(String[] args) {
//		
//		 String input = "Programming";
//	        Task.findDublicateCharacters(input);

		
//		Task.capitalizeFirstWord();
//		  String input = "Tea is very very hot!";
//	        System.out.println(Task.removeDuplicateString(input));

//		Task.VowelsConsonantCOunt("programming");
//		Task.stringPalindrome("amman");
//		Task.reverseStirng("Oranium");
//		Task.occuranceOfEachCharacter("aabbbcc");
//		Task.butterflyPattern();
		
//		Task.palindrome();
//		Task.removeDuplicate();
		Task.prime();
//		Task.gender();
//		Task.ascending();
//		Task.biggestNum();
//		Task.circle();
//		Task.factorial();
//		Task.naturalNum();
//		Task.fibonacci();
//		Task.reverseNum();
//		Task.boxPattern();
//		int [] array={12,3,45,67,89};
//		Task.reverseArray(array);
//		
//		Task.sortArrAscending();
//		Task.sortArrDescending();
//		Task.dublicates();
//		Task.pyramid();
//		Task.flyod();
	}
}

