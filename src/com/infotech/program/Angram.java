package com.infotech.program;

import java.util.Arrays;

public class Angram {

	private static void isAngram(String s1,String s2){
		
		String s1Copy=s1.replaceAll("\\s","");
		String s2Copy=s2.replaceAll("\\s","");
		boolean status=false;
		
		if(s1Copy.length() != s2Copy.length()){
			status=false;
		}else{
			char []s1Array=s1Copy.toLowerCase().toCharArray();
			char []s2Array=s2Copy.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status=Arrays.equals(s1Array, s2Array);
		}
		if(status){
			System.out.println("Strings are angram");
		}else{
			System.out.println("Strings are not angram");
		}
	}
	
	public static void main(String[] args) {

		isAngram("Mother In Law","Hitler Woman");
	}

}
