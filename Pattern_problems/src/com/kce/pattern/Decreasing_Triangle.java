package com.kce.pattern;

import java.util.Scanner;

public class Decreasing_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter a number");
		 int n= sc.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i+1;j++) {
				 System.out.print("*");
			 }
			 System.out.println(" ");
		 }
	}

}
