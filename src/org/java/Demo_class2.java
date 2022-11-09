package org.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo_class2 {

	public static void main(String arg[]) {

		int sumeven = 0;
		int sumodd = 0;
		int n = 10;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {

				sumeven++;

			}

			else {
				sumodd = sumodd + i;
			}

		}
		System.out.println(sumeven);
		System.out.println(sumodd);

	}
}
