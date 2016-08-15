package main;

import java.math.BigDecimal;

public class ReciprocalCycles {
	public static BigDecimal longest = new BigDecimal(22);
	public static long LongestDivisor = 0;
	public static void main(String[] args) {
		for(int d=1;d<1000;d++){
			long num = divide(d);
			if(num == 0) System.out.println(d + " repeats");
			else continue;
			recurring(d);
		}
	}
	public static long divide(int divisor){	
		BigDecimal dec = new BigDecimal(1);
		try{
		dec.divide(new BigDecimal(divisor));
		}
		catch(Exception e){
			return 0;
		}
		return divisor;
	}
	public static long recurring(int d){
		int x = d;
		return 1;
	}
}
