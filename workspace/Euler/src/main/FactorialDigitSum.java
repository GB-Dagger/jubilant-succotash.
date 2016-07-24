package main;
import java.math.BigInteger;
public class FactorialDigitSum {
	public static void main(String[] args) {
		String bignum = factorial(100).toString();
		int sum = 0;
		for(int i = 0;i<bignum.length();i++){
			sum += Integer.valueOf(bignum.substring(i, i+1));
		}
		System.out.println(sum);
	}
	public static BigInteger factorial(int base){
		BigInteger num = new BigInteger(String.valueOf(base));
		for(int i = 0;i<base;i++){
			num = num.multiply(new BigInteger(String.valueOf(base-i)));
		}
		return num;		
	}
}	
