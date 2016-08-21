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
	public static  boolean isPrime(int n){
		if(n == 2) return true;
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}