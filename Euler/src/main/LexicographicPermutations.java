package main;

public class LexicographicPermutations {

	public static void main(String[] args) {
		int count = 1;
		long i = 123456789;
		long start = System.currentTimeMillis();
		while(true){
			i++;
			if(matchesNum(i)){
				count++;
				if(count == 100) break;
				System.out.println(i);
			}
			else if(i>9876543210L || count == 1000000){
				System.out.println("Limit " + "Num: " + i);
				break;
			}
		}
		System.out.println("Num: " + i);
		System.out.println("Time: " + ((System.currentTimeMillis()-start)/1000));
	}
	public static boolean matchesNum(long num){
		int[] digits = {0,1,2,3,4,5,6,7,8,9};	
		boolean matches = true;
		for(Integer i: digits){
			String snum = Long.toString(num);
			if(snum.length() == 9) snum = "0" + snum;
			if(snum.contains(Integer.toString(i))) matches = true;
			else return false;
		}
		return matches;
	}
}
