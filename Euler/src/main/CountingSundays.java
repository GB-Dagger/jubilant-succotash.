package main;

public class CountingSundays {

	public static void main(String[] args) {
		for(int year=1901;year<2000;year++){
			if(year % 400 == 0){
				for(int month=0;month<12;month++){
					if(ifLeapYear(year)){
						
					}
				}
			}
		}
	}
	public static boolean ifLeapYear(int year){
		if((year % 4 == 0) && ((year % 100 != 0)||(year % 400 == 0))){
			
		}
		return false;
	}
	public int getDays(int month,boolean leap){
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] leapyear = {31,29,31,30,31,30,31,31,30,31,30,31};
		if(leap) return months[month+1];
		else return leapyear[month+1];
	}
}
