package main;

import java.util.ArrayList;

public class NonAbundantSums {

	public static void main(String[] args) {
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		ArrayList<Integer> sumNums = new ArrayList<Integer>();
		long sum = 0;
		int limit = 28123;
		long start = System.currentTimeMillis();
		for(int i=0;i<limit;i++){      
			if(isAbundant(i)) abundantNums.add(i);
		}
		//old way
		/*for(int i=0;i<abundantNums.size();i++){
			for(int i2=i;i2<abundantNums.size();i2++){
				int temp = abundantNums.get(i) + abundantNums.get(i2);
				if(temp < limit) sumNums.add(temp);
			}
		}
		System.out.println("Sumnums:" + sumNums.size()	);			

		for(int i=0;i<limit;i++){	
			if(!sumNums.contains(i)) sum +=i;
		}
		System.out.println("Sumnums:" + sumNums.size()	);			
		*/
		//new way
		for(int i=1;i<=28123;i++)
	        if(!sum_of_Two_Abundant(i, abundantNums)) sum+=i;
		//print results
		System.out.println("SUM: " + sum);
		System.out.println((System.currentTimeMillis()-start)/1000);
	}
	static boolean sum_of_Two_Abundant(int n, ArrayList<Integer> abundant){
	    for(Integer i:abundant){
	        if(abundant.contains(n-i)) return true;
	    }
	    return false;
	}
		public static boolean isAbundant(int num){
		int sum = 0;
		for(int i=1;i< num;i++){
			if(num % i == 0) sum += i;
		}
		return sum > num;
	}

}
