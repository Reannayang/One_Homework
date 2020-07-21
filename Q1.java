/*
@ Assignment 1; Exercise 1
@ version 1.2
@ Runan Yang
@ 7/20/2020
*/

import java.util.Scanner;
import java.lang.*;


public class Q1{

	public static void main (String[] args){
	
		System.out.println("Plz input your date of birth in the format MM-DD-YYYY");
		// tell user to input their dob in the specific format
		
			Scanner sc = new Scanner(System.in);
			
			String dob = sc.next();
			
			int BirthYear = Integer.valueOf(dob.substring(6,10));
			// extract year from the dob
			
			int BirthMonth = Integer.valueOf(dob.substring(0,2));
			// extract month from the inpput
			
			int BirthDay = Integer.valueOf(dob.substring(3,5));
			
			int NoofDay = BirthDay;
			// initialize the sequence of the day at first by the day
				
			switch (BirthMonth){
				
				case 1:NoofDay += 0  ; break;
				case 2:NoofDay += 31 ; break;
				case 3:NoofDay += 59 ; break;
				case 4:NoofDay += 90 ; break;
				case 5:NoofDay += 120; break;	
				case 6:NoofDay += 151; break;
				case 7:NoofDay += 181; break;
				case 8:NoofDay += 212; break;
				case 9:NoofDay += 243; break;
				case 10:NoofDay += 273;break;
				case 11:NoofDay += 304;break;
				case 12:NoofDay += 334;break;
				
			}
			// summation of day in the month and days before the day in year
			
			
			// if this is a leap year, 29 days;otherwise, 28 days, which is already added in the switchcase
			if ((BirthYear%4 == 0)&&(BirthMonth>2)) {
			
			NoofDay++;
			
			}
			
			//System.out.println(BirthDay);
			
			//System.out.println(BirthMonth);
			
			System.out.println("This day is the No."+NoofDay+" day in a year"); 
			
		
		
		}
		
	
	
	
	
	
	}




