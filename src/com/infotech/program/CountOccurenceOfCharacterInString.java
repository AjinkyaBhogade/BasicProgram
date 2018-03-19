package com.infotech.program;

import java.util.HashMap;
import java.util.HashSet;

public class CountOccurenceOfCharacterInString {
	
	public static void main(String[] args) {
	
		checkOccurenceInString("my name is ajinkya bhogade");
	}

	private static void checkOccurenceInString(String s) {
		String s1=s.replaceAll("\\s", "");
      HashMap<Character, Integer> charCount=new HashMap<>();
      HashSet<Character> characterset=new HashSet<>();
      
      char []c=s1.toCharArray();
      
      for(Character ch:c){
    		  characterset.add(ch);
        	  if(charCount.containsKey(ch)){
        		  charCount.put(ch, charCount.get(ch)+1);
        	  }else{
        		  charCount.put(ch, 1);
        	  }
    	 
      }
     
      for(Character ch:characterset){
    	  System.out.println(ch+""+charCount.get(ch));
      }
         
	}
	

}
