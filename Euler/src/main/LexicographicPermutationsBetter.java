package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicographicPermutationsBetter {
	
	public static int count = 0;
	public static void swap(int[] array, int i, int j) {
		int temporary = array[i];
		array[i] = array[j];
		array[j] = temporary;
	}
	
	public static int[] generate(int[] digits, int limit, int parent) {
		count++;
		int id = count;
		System.out.println("ID: " + id + " parent: " + parent);
		if (limit == 1) {
			System.out.println(Arrays.toString(digits));
			return digits;
		}
		for (int i = 0; i < limit - 1; i++) {
			generate(digits, limit - 1, id);
			if (limit % 2 == 0) {
				swap(digits, i, limit - 1);
			} else {	
				swap(digits, 0, limit - 1);
			}
		}
		return generate(digits, limit - 1, id);
	}
	public static void permute(int[] digits){
		int n = digits.length;
		swap(digits, digits[n], digits[n-1]);
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(findIndex(1000000));
		System.out.println("Time: " + (System.currentTimeMillis()-start) + "ms");
	}
	public static  long findIndex(int index){
		String num = "";
		long distance = factorial(10);
		for(int i = 0;i<10;addIndex(i,num)){
			long factorialdiff = factorial(10) - factorial(9);
			if(factorialdiff * (i+1) - index < factorialdiff){
				
				break;
			}
			 
		}
		return Long.parseLong(num);
	}
	public static void addIndex(int i, String num){
		if(num.contains(Integer.toString(i)));	
	}
	public static long factorial(int num){
		long factorial = num;
		for(int i=num-1;i> 0;i--){
			factorial *= i;
		}
		return factorial;
	}
}
