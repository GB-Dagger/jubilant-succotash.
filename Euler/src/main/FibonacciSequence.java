package main;

import java.math.BigInteger;

public class FibonacciSequence {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Fibonacci sequence of 1000: " + fibonacci(1000));
		System.out.println("Time: " + (System.currentTimeMillis()-start));
	}
	public static long fibonacci(int index){
		BigInteger last = new BigInteger("13");
		BigInteger current = new BigInteger("21");
		long count;
		for(count = 8;1000 > current.toString().length();count++){
			BigInteger temp = new BigInteger(last.add(current).toString());
			last = current;
			current = temp;
			//System.out.println(current);
		}
		return count;
	}
	public static void next(long i,long last){
		i = i + last;
		//return i;
	}
}
