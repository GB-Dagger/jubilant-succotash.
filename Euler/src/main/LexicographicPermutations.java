package main;

public class LexicographicPermutations {
	public static void main(String[] args) {
		int[] digits = {0,1,2,3,4,5,6,7,8,9};
		int count = 0;
		int i = 0;
		while(true){
			i++;
			if(Integer.toString(i).contains(digits.toString())){
				count++;
				System.out.println(count);
			}
		}
	}

}
