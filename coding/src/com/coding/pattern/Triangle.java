package com.coding.pattern;

import java.util.Scanner;

public class Triangle {

/*  *
	**
	***
	****  
	1
	1 2
	1 2 3
	1 2 3 4
	
	1
	2 2
	3 3 3
	4 4 4 4
	*/
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			for(int j =0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("another approach");
		String row = "";
		for (int i = 1; i <= n; i++) {
            row += "*";  
            System.out.println(row);
        }
		
		System.out.println("another approach");
		StringBuilder row1 = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            row1.append("* ");  // Append one asterisk in each iteration
            System.out.println(row1);
        }
        
        System.out.println("Number Triangle");
        
        for(int i = 0;i<n;i++) {
			for(int j =0;j<i+1;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
        
        System.out.println(" anotherNumber Triangle");
        
        for(int i = 0;i<n;i++) {
			for(int j =0;j<i+1;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		
	}
	
}
