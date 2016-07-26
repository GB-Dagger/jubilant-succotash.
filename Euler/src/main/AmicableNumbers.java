package main;

public class AmicableNumbers {

	public static void main(String[] args) {		
		int[] amicableNums;
		for(int i=0;i<10000;i++){
			
		}
	}
	public static int getDivisorSum(int num){
		int sum = 0;
		for(int i=1;i< num;i++){
			if(num % i == 0) sum += i;
		}
		return sum;		
	}
}
