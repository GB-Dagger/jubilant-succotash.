package main;

public class LPN {
	public static void main(String[] args) {
		int bignum = 0;
		for(int i = 100;i < 1000;i++){
			for(int i2 = 100;i2<1000;i2++){
				if(checkPalindrome(i*i2)){
					if(i*i2>bignum)bignum=i*i2;
				}
				System.out.println(i2);

			}
			System.out.println(i);

		}
		System.out.println(bignum);

	}
	public static boolean checkPalindrome(int num){
		int num2 = num;
	    int reversedNum = 0;

		while (num2 != 0) {
		    reversedNum = (reversedNum * 10) + (num2 % 10);
			//System.out.println(num2);
			//System.out.println(reversedNum);

		    num2 = num2 / 10;   
		}
		if(num == reversedNum)return true;
		else return false;
	}
}
