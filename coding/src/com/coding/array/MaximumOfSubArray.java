package com.coding.array;

import java.util.Scanner;

public class MaximumOfSubArray {
// https://prepinsta.com/unthinkable-solutions-coding-questions/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// size of subarray
		int x = sc.nextInt();
		// size of array
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			min = Integer.MAX_VALUE;
			for(int j =i;j<(i+x);j++) {
				min = Math.min(min, arr[j]);
			}
			max = Math.max(max, min);
		}
		
		System.out.println("maximum is : "+max);
	}
}
