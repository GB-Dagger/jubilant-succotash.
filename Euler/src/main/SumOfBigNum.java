package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class SumOfBigNum {
	public static void main(String[] args) throws IOException {	
		File file = new File("bignum.txt");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		String line;
		BigInteger sum = new BigInteger("0");
		while ((line = reader.readLine()) != null) {			
			BigInteger bignum = new BigInteger(line);
			System.out.println(bignum);
			sum = sum.add(bignum);
			System.out.println(sum);
		}
		reader.close();
		
	}
}
