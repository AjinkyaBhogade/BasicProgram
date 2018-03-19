package com.infotech.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayList {
	
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<>();
		hm.put("MS","Dhoni");
		hm.put("Rohit","sharma");
		hm.put("virat", "kohali");
		hm.put("Ajinkya","Rahane");
		hm.put("shikhar", "Dhawan");
		hm.put("Ajinkya","Bhogade");
		
		Set<String> keySet=hm.keySet();
		
		ArrayList<String> keys=new ArrayList<>(keySet);
		System.out.println("Array List of keys");
		for(String key:keys){
			System.out.println(key);
		}
		
		Collection<String > mapValues=hm.values();
		ArrayList<String> listOfValues=new ArrayList<>(mapValues);
		for(String value:listOfValues){
			System.out.println(value);
		}
		
		  //Getting the Set of entries
		 Set<Entry<String, String>> entrySet = hm.entrySet();
		 ArrayList<Entry<String, String>> listOfentry=new ArrayList<>(entrySet);
		 
		 for(Entry<String, String> entry:listOfentry){
			 System.out.println(entry.getKey() +" "+entry.getValue());
		 }
	}

}
