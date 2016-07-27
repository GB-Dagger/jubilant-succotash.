package main;

import java.util.HashSet;

public class NonAbundantSumsEfficient {
	public static void main(String[] args) {
		System.out.println(q23());
	}
	static int sum_Of_Divisors(int n){
	    int limit = n;
	    int sum = 0;
	    for(int i=1;i<limit;i++){
	        if(n%i==0){
	            if(i!=1){
	                if(i != n/i)  sum += (i + n/i);
	                else          sum += i;
	            }
	            else 
	                sum += i;
	            limit = n/i;
	        }
	    }       
	    return sum;
	}
	static boolean isAbundant(int n){
	    int sum = sum_Of_Divisors(n);
	    return sum>n;
	}
	static boolean sum_of_Two_Abundant(int n, HashSet<Integer> abundant){
	    for(Integer i:abundant){
	        if(abundant.contains(n-i)) return true;
	    }
	    return false;
	}
	static long q23(){
	    long sum = 0;
	    HashSet<Integer> abundant = new HashSet<Integer>();
	    for(int i=2;i<=28123;i++){
	        if(isAbundant(i))
	            abundant.add(i);
	    }
	    for(int i=1;i<=28123;i++)
	        if(!sum_of_Two_Abundant(i, abundant)) sum+=i;
	    return sum;
	}
}
