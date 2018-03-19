package com.infotech.program;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		sc.close();
		checkPrimeNumber(number);
	}

	private static void checkPrimeNumber(int number) {
		boolean isPrime=true;
		int temp;
		for(int i=2;i<=number/2;i++){
			temp=number%i;
			if(temp==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(number+" it is prime number");
		}else{
			System.out.println(number+" it is not prime number");
		}
		
	}

}
