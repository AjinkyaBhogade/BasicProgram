package com.infotech.program;

import java.util.Arrays;

public class ArraySumEqualGIvenNumber {

	//For example, 
	//if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 
	//20 is the given number, then you have to find all 
	//pairs of elements in this array whose sum must be 20. 
	//In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
	
	public static void main(String[] args) {
		int i[]={4, 5, 7, 11, 9, 13, 8, 12};
		int sumNumber=20;
		//checkArraySumEqualGIvenNumber(i,sumNumber);
		
		AlternativeCheckArraySumEqualGIvenNumber(i,sumNumber);
	}

	private static void AlternativeCheckArraySumEqualGIvenNumber(int[] input, int sumNumber) {
     int i=0;
     int j=input.length-1;
     Arrays.sort(input);
     while(i<j){
    	 if(input[i]+input[j]==sumNumber){
    		 System.out.println("number are "+input[i]+" and "+input[j]);
    		 i++;
    		 j--;
    	 }
    	 else if(input[i]+input[j]<sumNumber){
    		 i++;
    	 }
    	 else if(input[i]+input[j]>sumNumber){
    		 j--;
    	 }
    	 
     }
	}

	private static void checkArraySumEqualGIvenNumber(int[] input,int sumNumber) {
		
		System.out.println("pairs of number whose sum is "+sumNumber+ "are");
		
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				if(input[i]+input[j]==sumNumber){
					System.out.println("number are "+input[i]+" and "+input[j]);
				}
			}
		}
		
	}
}
