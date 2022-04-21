package com.evs.programing;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

//		scanner();
//		tableParticular();
//		tableAll();
//		lincence();
//		calculaterIfElse();
//		calculaterSwitchCase();
		lipYear();

	}

	public static void scanner() {
		Scanner sca = new Scanner(System.in);

		System.out.println("enter your name-");
		String name = sca.next();

		System.out.println("enter your age-");
		int age = sca.nextInt();

		System.out.println("enter your gender");
		char gender = sca.next().charAt(0);

		System.out.println("enter your phone no.-");
		long num = sca.nextLong();

		System.out.println("--------------------");
		System.out.println("name:-" + name);
		System.out.println("age:-" + age);
		System.out.println("gender:-" + gender);
		System.out.println("number:-" + num);

		// sca.nextLine();

	}

	public static void tableParticular() {
		Scanner sca = new Scanner(System.in);

		System.out.println("enter your num:-");
		int num = sca.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(num * i);
		}
	}

	public static void tableAll() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("enter number:-");
			Scanner sca = new Scanner(System.in);
			int num = sca.nextInt();

			for (int j = 1; j <= 10; j++) {
				System.out.print(j * num + " ");
			}
			System.out.println();
		}
	}

	public static void lincence() {

		Scanner sca = new Scanner(System.in);
		System.out.println("enter your age");
		int a = sca.nextInt();
		if (a <= 17) {
			System.out.println(a + " sort age");
		}
		if (a >= 18 && a <= 60) {
			System.out.println(a + " parfect age ");
		}
		if (a > 60) {
			System.out.println(a + " over age");
		}
	}

	public static void calculaterSwitchCase() {
		Scanner sca = new Scanner(System.in);
		System.out.println("enyter your first num");
		int num1 = sca.nextInt();

		System.out.println("enyter your second num");
		int num2 = sca.nextInt();

		System.out.println("enter:-( + ,- ,*, /)");
		String abcd = sca.next();

		switch (abcd) {
		case "+":
			int add = num1 + num2;
			System.out.println(add);
			break;
		case "-":
			int subtract = num1 - num2;
			System.out.println(subtract);
			break;

		case "*":
			int malti = num1 * num2;
			System.out.println(malti);
			break;

		case "/":
			int divison = num1 / num2;
			System.out.println(divison);
			break;
		default:
			System.out.println("sorry");
		}

	}

	public static void calculaterIfElse() {

		Scanner sca = new Scanner(System.in);
		System.out.println("enyter your first num");
		int num1 = sca.nextInt();

		System.out.println("enyter your second num");
		int num2 = sca.nextInt();

		System.out.println("enter:-( add ,subtract ,malti, divison)");
		String abcd = sca.next();

		int addValue = num1 + num2;
		if (abcd.equals("add")) {
			System.out.println(addValue);
		}

		int subtractValue = num1 - num2;
		if (abcd.equals("subtract")) {
			System.out.println(subtractValue);
		}

		int maltiValue = num1 * num2;
		if (abcd.equals("malti")) {
			System.out.println(maltiValue);
		}
		int divisonValue = num1 / num2;

		if (abcd.equals("divison")) {
			System.out.println(divisonValue);
		}

	}

	public static void lipYear() {
		
		Scanner sca=new Scanner(System.in);
		System.out.println("enter year");
		int a=sca.nextInt();
		if (a%4==0) {
			System.out.println(a+"this is leap year");
		}else {
			System.out.println(a+"this is not leap year");
		}

	}

}
