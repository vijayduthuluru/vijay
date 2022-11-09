package org.java;

import java.util.HashMap;
import java.util.Scanner;

public class Demo_class1 {

	public static void main(String args[]) {

		String s = "vengatram";
		HashMap<Character, Integer> emp = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (emp.containsKey(c)) {
				int x = emp.get(c);
				emp.put(c, x + 1);
			} else {
				emp.put(c, 1);
			}
		}
	}
}
