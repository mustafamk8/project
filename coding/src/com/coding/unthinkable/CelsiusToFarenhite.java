package com.coding.unthinkable;

import java.util.Scanner;

public class CelsiusToFarenhite {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c = sc.nextFloat();
		float f = (c*9/5)+32;
		System.out.println("farenhite : "+f);
	}
}
