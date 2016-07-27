package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmicableNumbers {

	public static void main(String[] args) {		
		List nums = new ArrayList<>();
		for(int i=1;i<10000;i++){
			if(!nums.contains(i)){
				if((getDivisorSum(getDivisorSum(i)) == i) && (i != getDivisorSum(i))){
					//System.out.println("added:" + i);
					nums.add(i);
					nums.add(getDivisorSum(i));
				}
			}
		}
		System.out.println("Size: " + nums.size() + " Sum: " + addList(nums));
	}
	public static int getDivisorSum(int num){
		int sum = 0;
		for(int i=1;i< num;i++){
			if(num % i == 0) sum += i;
		}
		return sum;		
	}
	public static int addList(List l){
		int sum = 0;
		//System.out.println(l.size());
		for(int i = 0;i<l.size();i++){
			sum += (int)l.get(i);
			//System.out.println((l.get(i)));
		}
		return sum;
	}
}
