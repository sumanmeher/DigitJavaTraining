package com.digit.javaTraining.collectionFrameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map1 {

	public static void main(String[] args) {
		//HashMap<String, Integer> hm = new HashMap<>();
		//LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
		TreeMap<String, Integer> hm = new TreeMap<>();
		
		hm.put("a", 10);
		hm.put("b", 20);
		hm.put("d", 40);
		hm.put("c", 30);
		
		System.out.println(hm);
	}

}
