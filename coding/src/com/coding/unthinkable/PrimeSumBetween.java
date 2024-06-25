package com.coding.unthinkable;

import java.util.Scanner;

public class PrimeSumBetween {

	public static boolean isPrime(int n) {
		
		if(n<=1)
			return false;
		if(n<=3)
			return true;
		int count =0;
		for(int i =2;i<=n/2;i++) {
			if(n%i==0)
				count++;
			if(count>0)
				return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum =0;
		for(int i=n1;i<=n2;i++){
			if(isPrime(i))
				sum += i;
		}
		System.out.println("sum of prime numbers is : "+sum);
	}
	
}
