package com.infotech.program;

public class BinaryStringToDecimal {
	
	public static void main(String[] args) {
		
		String binaryString="11101";
		Integer decimal=Integer.parseInt(binaryString, 2);
		System.out.println(decimal);
	}

}
