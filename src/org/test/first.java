package org.test;

import java.util.ArrayList;
import java.util.List;
//get the last five values in list
public class first {
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
		for(int i=5; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}
