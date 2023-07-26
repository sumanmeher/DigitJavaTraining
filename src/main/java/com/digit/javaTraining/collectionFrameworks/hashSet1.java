package com.digit.javaTraining.collectionFrameworks;

import java.util.HashSet;

public class hashSet1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(175);
		hs.add(175); // does not allow duplicates
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		HashSet hs1=new HashSet();
		hs1.add(100);
		hs1.add(50);
		hs1.add(150);
		hs1.add(25);
		hs1.add(75);
		hs1.add(750);
		hs1.add(175);
		
//		
		System.out.println(hs1);
		System.out.println(hs.equals(hs1));
//		
		hs1.remove(75);
		System.out.println(hs1);
//		System.out.println(hs1.hashCode());
//		System.out.println(hs.hashCode());
		
		System.out.println(hs1.isEmpty());
		System.out.println(hs1.clone());
		System.out.println(hs1);
		
		
	}

}
