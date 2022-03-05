package org.test;

import java.util.ArrayList;
import java.util.List;
//get the middle index value in list
public class object {
public static void main(String[] args) throws InterruptedException {
	List<Integer> a =new ArrayList<>();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);
	a.add(500);
	a.add(600);
	a.add(700);
	a.add(800);
	a.add(900);
	a.add(1000);
	System.out.println(a);
	for (int i = 0; i <a.size(); i+=2) {
		System.out.println(a.get(i));
		
	}	
}
}
