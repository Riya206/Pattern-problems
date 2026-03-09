package com.kce.pattern;

import java.util.Scanner;

public class Number_Increasing_Reverse_Pyramid_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j <=n-i+1;j++) {
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
			}
	}


