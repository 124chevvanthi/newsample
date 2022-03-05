package org.test;

import java.util.ArrayList;
import java.util.List;
//Iterate the list using for fo loop
public class Tasklist13 {
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
}
}
