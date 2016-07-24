package main;

import java.math.BigInteger;

public class PowerDigitSum {

	public static void main(String[] args) {
		int base = 2;
		int power = 1000;
		BigInteger bignum = new BigInteger(String.valueOf(base));
		bignum = bignum.pow(power);
		int sum = 0;
		for(int i=0;i<bignum.toString().length();i++){
			sum += Character.getNumericValue(bignum.toString().charAt(i));
		}
		
		System.out.println(sum);
				
	}

}
