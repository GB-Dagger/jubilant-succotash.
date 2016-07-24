package main;

public class SquareDifference {
	public static void main(String[] args) {
		int sumsquares = 0;
		int squaresums = 0;
		for(int i = 0; i <= 100;i++){
			squaresums += i*i;
		}
		for(int i = 0; i<=100; i++){
			sumsquares += i;
			System.out.println(i);
		}
		sumsquares *= sumsquares;
		System.out.println(sumsquares - squaresums);
	}
}
