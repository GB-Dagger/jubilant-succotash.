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
		recurseMethod(1, digitsAvailable, 0, 10);
	}
	public static void recurseMethod(int digit, boolean[] digitsAvailable, int number, int size){
		//System.out.println("h");
		for(int i = 0; i < size; i++){
			if(digitsAvailable[i]){
				if(digit < size ){
					//System.out.println("h");
					boolean[] tmpDigitsAvailable = digitsAvailable;
					tmpDigitsAvailable[i] = false;
					digit+=1;
					recurseMethod(digit, newbool(digit), (number*10) + i,size--);
				}else if(digit >= 10){
					System.out.println(i);
					System.out.println(i);

					int num = (number*10) + i;
					permutationNumbers.add(num);
					permutationCount++;
					System.out.println(num);
				}
			}
		}
	}
	public static boolean[] newbool(int d){
		boolean[] bool = new boolean[d];
		for(boolean v: bool){
			v = true;
		}
		return bool;
	}
}
