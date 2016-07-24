package main;

public class EvenFibonacci {

	public static void main(String[] args) {
		int nextnum = 2;
		int currentnum = 1;
		int max = 4000000;
		int sum = 0;
		do{
			//System.out.println(currentnum);
			if(currentnum%2 == 0){
				sum += currentnum;
			}
			int i = currentnum;
			currentnum = nextnum;
			nextnum += i;
		}while(currentnum < max);
		System.out.println(sum);
	}

}
