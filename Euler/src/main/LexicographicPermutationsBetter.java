package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicographicPermutationsBetter {
	
	
	public static void swap(int[] array, int i, int j) {
		int temporary = array[i];
		array[i] = array[j];
		array[j] = temporary;
	}
	
	public static int[] generate(int[] digits, int limit) {
		if (limit == 1) {
			return digits;
		}
		for (int i = 0; i < limit - 1; i++) {
			generate(digits, limit - 1);
			if (limit % 2 == 0) {
				swap(digits, i, limit - 1);
			} else {
				swap(digits, 0, limit - 1);
			}
		}
		return generate(digits, limit - 1);
	}
	
	public static void main(String[] args) {
		generate(new int[] { 0, 1, 2, 3 , 4, 5, 6 ,7,8,9}, 10);
	/*	for (int permutation : permutations) {
			System.out.println(permutation);
		}*/
	}
	public static void permute(int[] digits){
		int n = digits.length;
		//swap(digits, digits[n], digits)
	}
}
