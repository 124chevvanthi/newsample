package org.test;

import java.util.ArrayList;
import java.util.List;
//Iterate the list using for each loop
public class Task5 {
	public static void main(String[] args) {
		List<Integer> b = new ArrayList<>();
		b.add(123);
		b.add(124);
		b.add(125);
		b.add(126);
		b.add(127);
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
			}
		for ( Integer x  : b) {
			System.out.println(x);
		}
			
			}
				
	}
	
		
	


