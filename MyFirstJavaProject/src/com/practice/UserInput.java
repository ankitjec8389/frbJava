package com.practice;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter your name");
			String name = sc.next();
			System.out.println("Hello "+name);
		}
	}

}
