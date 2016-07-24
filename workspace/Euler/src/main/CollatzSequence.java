package main;

public class CollatzSequence {

	public static void main(String[] args) {
		long maxcount = 0;
		long startnum = 0;
		
		
		
		
		for(int seq=1;seq<1000000;seq++){
			long length = chainLength(seq);
			if(length>maxcount){
				maxcount=length;
				startnum = seq;
			}
		}
		System.out.println(startnum);
		System.out.println(maxcount);
	}
	public static long chainLength(int startNum){
		
		long num = startNum;
		int i = 0;
		do{
			i++;			
			if(num%2==0){
				num /=2;
			}
			else{
				num = 3*num + 1;
			}
			//System.out.println(num);
		}while(num!=1);
		return i+1;
	}
}
