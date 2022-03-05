package org.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
//list to set
import java.util.List;
import java.util.Set;

public class Task6 {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		Set<Integer>s =new LinkedHashSet<>();
		s.addAll(a);
		System.out.println(s);
		
		
	
		
		
		
		
	}

}
