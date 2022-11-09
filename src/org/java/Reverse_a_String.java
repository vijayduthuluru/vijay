package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_a_String {

	public static void main(String[] args) {
		String s = "vijay";
		String rev ="";
		for (int i = 0; i <s.length(); i++) {
			
			char charAt = s.charAt(i);
			rev=charAt+rev;
			
			
			
			
		}
		
		System.out.println(rev);
}
}