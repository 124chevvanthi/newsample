package org.test;

import java.util.ArrayList;
import java.util.List;
//get the first five index value in list
public class Task9 {
	public static void main(String[] args) {
		List<Integer>a=new ArrayList<>();
		a.add(124);
		a.add(123);
		a.add(125);
		a.add(126);
		a.add(127);
		a.add(126);
		a.add(128);
		a.add(776);
		a.add(643);
		a.add(647);
		System.out.println(a);
		for (int i = 0; i <a.size()-5; i++) {
			System.out.println(a.get(i));
			
		}
		
		
	}

}
