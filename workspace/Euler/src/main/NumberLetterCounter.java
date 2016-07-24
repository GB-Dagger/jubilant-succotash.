package main;

public class NumberLetterCounter {
	public static void main(String[] args) {
		String[] ones = {"one","two","three","four","five","six","seven","eight","nine"};
		String[] teens = {"ten","eleven","twelve", "thirteen", "fourteen","fifteen", "sixteen","seventeen","eighteen","nineteen"};
		String[] tens = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String hundreds = "hundred";
		int sum = 0;
		int start = 0;
		for(int i = 1;i<=1000;i++){
			start = sum;
			System.out.print(i + " ");
			if(Integer.toString(i).length() == 1){
				sum += ones[i-1].length();
				System.out.println(ones[i-1]);
			}
			else if(Integer.toString(i).length() == 2){
				if(String.valueOf(i).startsWith("1")){
					sum += teens[i-10].length();
					System.out.println(teens[i-10]);
				}
				else{
					
					sum += tens[Integer.valueOf((String.valueOf(i).substring(0, 1)))-2].length();	
					System.out.println(tens[Integer.valueOf((String.valueOf(i).substring(0, 1)))-2] + " ");
					if(!String.valueOf(i).substring(1, 2).equals("0")){ 
						System.out.println(ones[Integer.valueOf(String.valueOf(i).substring(1, 2))-1]);
						sum += ones[Integer.valueOf(String.valueOf(i).substring(1, 2))-1].length();
					}
				}			
			}
			else if(Integer.toString(i).length() == 3){
				sum += ones[Integer.valueOf(String.valueOf(i).substring(0, 1))-1].length();	
				sum += hundreds.length();
				System.out.print(ones[Integer.valueOf(String.valueOf(i).substring(0, 1))-1] + " " + hundreds);
				//tens
				if(!String.valueOf(i).substring(1, 3).equals("00")){
					sum += "and".length();
					System.out.print(" and ");
					if(String.valueOf(i).substring(1, 2).equals("0")){
						sum += ones[Integer.valueOf(String.valueOf(i).substring(2, 3))-1].length();
						System.out.println(ones[Integer.valueOf(String.valueOf(i).substring(2, 3))-1]);
					}
					else if(String.valueOf(i).substring(1, 2).equals("1")){
						sum += teens[Integer.valueOf(String.valueOf(i).substring(2, 3))].length();	
						System.out.println(teens[Integer.valueOf(String.valueOf(i).substring(2, 3))]);
					}
					else{
						sum += tens[Integer.valueOf((String.valueOf(i).substring(1, 2)))-2].length();	
						
						if(!String.valueOf(i).substring(2, 3).equals("0")){
							sum += ones[Integer.valueOf(String.valueOf(i).substring(2, 3))-1].length();
							System.out.print(tens[Integer.valueOf((String.valueOf(i).substring(1, 2)))-2]);
							System.out.println(" " + ones[Integer.valueOf(String.valueOf(i).substring(2, 3))-1]);
						}
						else{
							System.out.println(tens[Integer.valueOf((String.valueOf(i).substring(1, 2)))-2]);
						}
						
						
					}
				}
				
			}
			System.out.println("Diff" + (sum-start));
		}	
		System.out.println(sum + "onethousand".length());
	}
}
