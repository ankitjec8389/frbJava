package com.practice;

import java.util.Scanner;

public class ModuloOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int first = sc.nextInt();
		System.out.println("Enter Second Number");
		int second = sc.nextInt();
		
		int div = first/second;
		System.out.println("Division result of your numbers = "+div);
		
		int modulo = first%second;
		System.out.println("Modulo of your numbers = "+modulo);
		
	}

}
