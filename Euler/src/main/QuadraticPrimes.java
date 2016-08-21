package main;

import java.util.ArrayList;

public class QuadraticPrimes {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int aSave = -111111;
		int bSave = -111111;
		int consecutivePrimeCount = 0;
		for(int a = -999; a<=999; a++){
			System.out.println(" A:" + a);
			for(int b = -999; b<=999; b++){
				boolean continueBool = true;
				for(int n = 0; continueBool; n++){
					int num = n*n+a*n+b;
					if(!isPrime(num)){
						continueBool = false;
						if(n-1 > consecutivePrimeCount){
							aSave = a;
							bSave = b;
							consecutivePrimeCount = n-1;
							System.out.println("New Number Reached!");
						}
					}
				}
			}
		}
		System.out.println("A:" + aSave + " B:" + bSave + " PrimeCount:" + consecutivePrimeCount);
		
	}
	public static  boolean isPrime(int in){
		for(int i = 1;  i <= in/2; i++){
			if(in%i == 0){
				return false;
			}
		}
		return true;
	}
}