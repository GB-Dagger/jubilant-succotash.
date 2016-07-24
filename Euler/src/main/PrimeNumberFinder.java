package main;

public class PrimeNumberFinder {

	public static void main(String[] args) {
		int count = 0;
		for(int i=2;true;i++){
			if(isPrime(i)){
				count++;
				System.out.println(i);
				if(count == 10001){
					System.out.println(i);
					break;
				}
			}
		}

	}
	static boolean isPrime(long n) {
		if(n == 2) return true;
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
