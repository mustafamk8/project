package com.coding.array;

public class EquilibriumArray {
	
	public static int anotherApproach(int[] arr, int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i =0;i<n;i++) {
			sum+=arr[i];
		}
		int left= 0, right=sum;
		for(int i =0;i<n;i++) {
			right -=arr[i];
			if(left==right)
				return i;
			left+=arr[i];
		}
		
		
		return -1;
	}
	
	
	public static int euilibriumIndex(int[] arr, int n) {
		int leftSum;
		int rightSum;
		// int i,j;
		for (int i = 0; i < n; i++) {
			leftSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum += arr[j];
			}
			rightSum = 0;
			for (int j = i + 1; j < n; j++) {
				rightSum += arr[j];
			}
			if (leftSum == rightSum)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		int n = arr.length;
		int ans = euilibriumIndex(arr, n);
		int ans2 = anotherApproach(arr, n);
		System.out.println("equilibrium index 1 : " + ans);
		System.out.println("equilibrium index 2 : " + ans2);
	}

	
}
