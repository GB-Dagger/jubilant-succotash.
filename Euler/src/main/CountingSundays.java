package main;

import java.util.Arrays;
import java.util.List;

public class CountingSundays {
	
	public static void main(String[] args) {
		int day = 1;
		int sundays = 0;
		for(int year=1900;year<=2000;year++){
			while(true){
				System.out.println("Year: " + year + " Day: " + day);
				day+=7;
				if(checkSunday(day, ifLeapYear(year)) && year != 1900) sundays++;
				
				if(day>365 && !ifLeapYear(year)){
					day = day-365;
					if(checkSunday(day, ifLeapYear(year)) && year != 1900) sundays++;
					break;
				}
				else if(day>366 && ifLeapYear(year)){
					day = day-366;
					if(checkSunday(day, ifLeapYear(year)) && year != 1900) sundays++;
					break;
				}
				
			}
		}
		System.out.println(sundays);
	}
	public static boolean ifLeapYear(int year){
		return year % 4 == 0 || year == 2000;
		
	}	
	public static boolean checkSunday(int day,boolean leap){
 		int[] monthslength = {1 ,32,60,91 ,121,152,182,213,244,274,305,335};
		int[] leapyearlength={1 ,32,61,92 ,122,153,183,214,245,275,306,336};
		if(leap && Arrays.binarySearch(leapyearlength, day) >= 0) return true;	
		else if((!leap)&& Arrays.binarySearch(monthslength, day) >= 0) return true;	
		else return false;
	}
}
