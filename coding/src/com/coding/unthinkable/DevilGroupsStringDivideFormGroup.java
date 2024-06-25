package com.coding.unthinkable;

import java.util.Scanner;

public class DevilGroupsStringDivideFormGroup {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replace("$", " ");
		s = s.replace("@", " ");
		String[] str = s.split("\\s");
		int max = 0;
		for(String w : str) {
			max = Math.max(max, w.length());
		}
		System.out.println("maximum length after group : "+max+1);
	}
}
