package main;

public class LPF {
	public static void main(String[] args) {
		long num = 600851475143L;
		long num2 = 600851475143L;

		//long num = 13195;
		long prime = 1;
		for(long i=1;i<num2;i++){
			//System.out.println("i="+i);
			if(num%i==0 && isPrime(i)){
				num /= i;
				
				System.out.println(i);
				if(i > prime){
					prime = i;
					System.out.println(prime);
					i = 1;
				}
			}
		}
		System.out.println("Final" + prime);
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
