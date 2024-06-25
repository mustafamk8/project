package com.coding.array;

import java.util.Arrays;

public class MInimumCoin {

	public static int minCoins(int[] coins, int amount) {
		int n = coins.length;
		Arrays.sort(coins);
		int count = 0;
		for(int i=n-1;i>=0;i--) {
			while(amount>=coins[i]) {
				amount -= coins[i];
				count++;
			}
		}
		
		if(amount==0)
			return count;
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		
		int totalCoins = minCoins(coins,amount);
		System.out.println("total minimum coins needed : "+totalCoins);
	}

	
	
}
