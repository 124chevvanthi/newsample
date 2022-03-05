package org.test;

import java.util.ArrayList;
import java.util.List;
//Get the last index value in list
public class Tasklist {
	public static void main(String[] args) {
		List<Integer>a=new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		System.out.println(a);
		int last = a.get(a.size()-1);
		System.out.println(last);
		
		
	}

}
