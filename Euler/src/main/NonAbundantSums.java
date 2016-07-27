package main;

public class NonAbundantSums {

	public static void main(String[] args) {
		
	}
	public static int getDivisorSum(int num){
		int sum = 0;
		for(int i=1;i< num;i++){
			if(num % i == 0) sum += i;
		}
		return sum;		
	}

}
