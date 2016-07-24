package main;

public class SmallestMultiple {
	public static void main(String[] args) {
		int num = 1;
		int max = 20;
		while(true){
			
			boolean works = true;
			for(int i = 2;i<max;i++){
				if(num%i!=0){

					works = false;
					break;
					
				}
			}
			if(!works){
				num++;
			}
			else{
				System.out.println(num);
				break;
			}
		}
	}
}
