package com.infotech.program;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		isArmStrong(153);
		isArmStrong(158);
	}

	private static void isArmStrong(int i) {
		int sum=0;
		int num;
		int temp=i;
		
		while(i>0){
			num=i%10;
			i=i/10;
			sum=sum+(num*num*num);
		}
		if(sum==temp){
			System.out.println(temp+ "it is armstrong number");
		}else{
			System.out.println(temp+ "it is not armstrong number");			
		}
	}

}
