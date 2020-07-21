/*
@ generate the sequence of numbers in lottery
@ version 1.0
@ Runan Yang
@ 7/20/2020
*/

import java.util.Random;

public class Q3LotterySeq{

	public static void main(String[] args){
	
		int[] LotterySeq = new int[7];
		
		Random rd = new Random();
		
		LotterySeq[6] = rd.nextInt(17);
	
		for(int i = 0; i<6;i++){
		
			LotterySeq[i] = rd.nextInt(34);
		
			for (int j = 1; j<1; j++){
			
				if (LotterySeq[j] == LotterySeq[i]|LotterySeq[i]== 0){
				
					LotterySeq[i] = rd.nextInt(34);
				}
			
			
			}
		
		
		}
		
		System.out.println("The lottery sequence is");
		
		for (int k = 0;k <=6;k++){
		
			System.out.print(LotterySeq[k] + " ");
		
		}
	}





}