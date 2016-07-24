package main;

public class TriangleNumbers {
	public static void main(String[] args) {
		long trinum = 0;
		for(long i=0;NumberOfDivisors((int) trinum)<500;i++){
			//System.out.println("i: " + i);
			//System.out.println("Integer:" + i + "Trinum:" + trinum + " NOD: " + divisorNum(trinum));
			trinum += i;
			//System.out.println("\n"+trinum);
			
		}
		System.out.println("Final: "+trinum);
		System.out.println(divisorNum(76576500));
	}
	public static long divisorNum(long num){
		long count = 0;
		for(long i=2;i<=num/2;i++){
			if(num%i==0){
				count++;
				//System.out.print(i+" ");
			}
		}
		return count;	
	}
	public static int NumberOfDivisors(int number) {
	    int nod = 0;
	    int sqrt = (int) Math.sqrt(number);
	 
	    for(int i = 1; i<= sqrt; i++){
	        if(number % i == 0){
	            nod += 2;
	        }
	    }
	    //Correction if the number is a perfect square
	    if (sqrt * sqrt == number) {
	        nod--;
	    }
	 
	    return nod;
	}

}
