package main;

import java.util.Arrays;

public class CountingSundays {
	
	public static void main(String[] args) {
		int day = 6;
		int sundays = 0;
		for(int year=1901;year<2000;year++){
			while(true){
				System.out.println("Year: " + year + " Day: " + day);
				day+=7;
				if(checkSunday(day, ifLeapYear(year))) sundays++;
				
				if(day>=365 && !ifLeapYear(year)){
					day = day-365+1;
					break;
				}
				else if(day>=366 && ifLeapYear(year)){
					day = day-366+1;
					break;
				}
				
			}
		}
		System.out.println(sundays);
	}
	public static boolean ifLeapYear(int year){
		if(((year % 4 == 0))){
			return true;	
		}
		else{
			return false;
		}
		
	}
	public static boolean checkSunday(int day,boolean leap){
		int[] monthslength = {1 ,32,60,91 ,121,152,182,213,244,274,205,335};
		int[] leapyearlength={1 ,32,61,92 ,122,153,183,214,245,275,306,336};
		if(leap && Arrays.asList(leapyearlength).contains(day)) return true;	
		else if((!leap)&& Arrays.asList(monthslength).contains(day)) return true;	
		else return false;
	}
}
