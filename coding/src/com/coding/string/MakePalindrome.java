package com.coding.string;

public class MakePalindrome {

	public static boolean isPalindrome(String str) {
		int left=0,right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static String makePalindrome(String str) {
		if(isPalindrome(str))
			return str;
		
			for(int i=1;i<str.length();i++) {
				String suffix = str.substring(i);
				if(isPalindrome(suffix)) {
					String add = new StringBuilder(str.substring(0,i)).reverse().toString();
					return add;
				}
			}		
		return "";
	}

	public static void main(String[] args) {
		String str = "abca";
		if (isPalindrome(str)) {
			System.out.println("string is already palindrome : " + str);
		} else {
			String s = makePalindrome(str);
			System.out.println("string to be add : " + s);
			System.out.println("resultant string : " + str+s);
		}
	}

}
