package com.practice;

import java.util.Scanner;

public class UserInputNumber {
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = sc.nextInt();
			System.out.println("Your age is " + age);
		} finally {
			if (null != sc)
				sc.close();
		}
	}
}
