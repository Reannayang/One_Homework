/*
@ to enlarge the araay
@ version 1
@ Runan Yang
@ 7/20/2020
*/


import java.util.Scanner;

public class Q4ArrayEnlarge{

	public static void main(String[] args) throws Exception{
	
		System.out.println("input the number of elements");
		
		Scanner sc = new Scanner(System.in);
		
		int NumOfElements = sc.nextInt();		
		// user input number of elements in this array.
	
		int[] Array = new int[NumOfElements];
		// initialize the array
		
		int NumCopies = 0;
		
		// this loop to input the elements before enlarging the array.
		for (int i = 0; i<Array.length; ++i){
		
			System.out.println("plz input the element No."+ (i+1));
			
			Array[i] = sc.nextInt();
			
			if (i== (0.8* Array.length-1)){
			// this is condition to enlarge
			
			// get the index in order to coy and continue inputing
				NumCopies = i;
				
				System.out.println("the array is re-loading and enlarged......");
				
				Thread.sleep(5000);
				// allow 5 seconds to reload
					
				break;
			}				
		// in this way, this array is already initialized until the index == NumChoices; So, (NumChoices +1) elements are already set
		}
	
		NumOfElements = (int) (NumOfElements*1.5);
		// enlarge; 1.5, double to int; if possible
	
	
		int[] ArrayTwo = new int[NumOfElements];
		
		System.arraycopy(Array,0,ArrayTwo,0,NumCopies+1);
		
		for (int i = NumCopies+1; i<ArrayTwo.length; ++i){
		
			System.out.println("plz input the element No."+ (i+1));
			
			ArrayTwo[i] = sc.nextInt();
		}
	
	
		for(int i = 0; i< ArrayTwo.length; ++i){
		
			System.out.println("the element No."+ (i+1) +"is"+ ArrayTwo[i]);
		
		}
	}
}