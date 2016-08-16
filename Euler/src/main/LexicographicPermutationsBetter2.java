package main;

import java.util.ArrayList;

public class LexicographicPermutationsBetter2 {

	static int permutationCount = 0;
	static ArrayList<Integer> permutationNumbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		boolean[] bool = {true,true,true,true,true,true,true,true,true,true};
		startRecurse(bool);
		System.out.println(permutationNumbers.size());
	}
	public static void startRecurse(boolean[] digitsAvailable){
		recurseMethod(1, digitsAvailable, 0);
	}
	public static void recurseMethod(int digit, boolean[] digitsAvailable, int number){
		System.out.println("h");
		for(int i = 0; i < 10; i++){
			if(digitsAvailable[i]){
				if(digit < 10 ){
					System.out.println("h");
					digitsAvailable[i] = false;
					digit+=1;
					recurseMethod(digit, digitsAvailable, (number*10) + i);
				}else if(digit == 10){
					System.out.println("i");
					int num = (number*10) + i;
					permutationNumbers.add(num, permutationCount);
					permutationCount++;
					System.out.println(num);
				}
			}
		}
	}
}
