package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MaximumPath {

	
	private static void findMax(int[][] triangle, int depth) {
		int[] previous = null;
		for(int i = 1; i < depth; i++) {
			int[] last = triangle[depth - i];
			previous = calculateRowMaximal(triangle[(depth - i) - 1], last);
			printValues(previous);
		}
		System.out.println("result = " + previous[0]);
	}
	
	private static int[] calculateRowMaximal(int[] previous, int[] last) {
		for (int i = 0; i < previous.length; i++) {
			previous[i] = previous[i] + (Math.max(last[i], last[i + 1]));
		}
		return previous;
	}
	
	private static void printValues(int[] values) {
		System.out.println();
		for (int i : values) {
			System.out.print("\t" + i);
		}
	}
	
	private static int[][] getTriangle(String fileName, int depth) throws Exception {
		int[][] triangle = new int[depth][];
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		String s;
		int i = 0;
		while ((s = br.readLine()) != null) {
			triangle[i] = new int[i + 1];
			int j = 0;
			Scanner tokens = new Scanner(s);
			while (tokens.hasNext()) {
				int value = tokens.nextInt();
				triangle[i][j++] = value;
			}
			i++;
		}

		return triangle;
	}

	public static void main(String args[]) throws Throwable {
		String fileName = "smtrinum.txt";
		int depth = 15;
		int[][] triangle = getTriangle(fileName, depth);
		findMax(triangle, depth);
	}
}