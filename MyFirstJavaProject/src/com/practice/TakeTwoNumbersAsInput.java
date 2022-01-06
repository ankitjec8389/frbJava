package com.practice;

import java.util.Scanner;

public class TakeTwoNumbersAsInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first Number");
		int first = sc.nextInt();
		System.out.println("Enter second number");
		int second = sc.nextInt();
		
		
		int sum = first+second;
		System.out.println("Sum of your numbers is ="+sum);
		
		int sub = first-second;
		System.out.println("Subtraction of your numbers is ="+sub);
		
		int mul = first*second;
		System.out.println("Multiplication of your numbers is = "+mul);
		
		int div = first/second;
		System.out.println("Division of your number is ="+div);
	}
}
