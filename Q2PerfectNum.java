/*
@ print out all the perfect numbers smaller than 1000
@ version 1.0
@ Runan Yang
@ 7/20/2020
*/

import java.lang.Math;

public class Q2PerfectNum{

	public static void main(String[] args){
	
		System.out.println("The perfect numbers are");
		
		for(int i = 2;i<1000 ;i++){
		
			int sum = 1;
			
			for(int j = 2; j < Math.sqrt(i);j++){
				
				if(i%j==0){
				
					int k = i/j ;
					
					
					sum = j + k + sum;
					
					
				
				}
			
			
			
			}
			
			
			if (sum == i){
						
				System.out.println(i);
					
			}
		
		
		}
	
	
	
	
	
	}



}