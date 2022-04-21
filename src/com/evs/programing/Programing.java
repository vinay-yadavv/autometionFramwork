package com.evs.programing;

import java.util.Scanner;

public class Programing {

	public static void main(String[] args) {
		Programing pro = new Programing();
//		pro.abcd();
//		pro.add();
//		pro.add1();
//		pro.fiboneci();     
//		pro.m1();
//		pro.num1234();       //    
//		pro.onePower1_2Power2();
//		pro.reverseAll();
//		pro.reverseName();
//		pro.reverseName1();
//		pro.reverseOne();
//		pro.sorting();
//      pro.AbCd();         ///         
//		pro.ascendingOrderReturn();
		System.out.println("vinay");
	}

	

	public int[] ascendingOrder() {

		int temp = 0;
		int[] sort = { 21, 78, 42, 8, 42, 65, 12, 53 };
		int[] k = new int[sort.length];

		for (int i = 0; i < sort.length; i++) {

			for (int j = 1 + i; j < sort.length; j++) {

				if (sort[i] < sort[j]) {
					temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;

				}
			}
			// System.out.print(sort[i]+" ");
			k[i] = sort[i];

		}
		return k;

	}

	public void ascendingOrderReturn() {

		int[] asd = ascendingOrder();

		for (int i = 0; i < asd.length; i++) {
			System.out.print(asd[i] + " ");
		}
	}

	public void sorting() {

		int temp = 0;
		int[] sort = { 10, 43, 12, 87, 32, 00, 11, 66, 76 };

		for (int i = 0; i <= sort.length - 1; i++) {

			for (int j = i + 1; j < sort.length; j++) {

				if (sort[i] > sort[j]) {
					temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}

			}
			System.out.print(sort[i] + ",");

		}
	}

	public void m1() {
		int a = 250;
		int b = 200;
		int c = a + b + 500;
		int d = c / 2;
		System.out.println(d);
	}

	public void abcd() {
		char a = 97;

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 4; j++) {

				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}

	public void num1234() {

		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {

				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		} // 1234
			// 5
			/// 6
			// 10 9 8 7
	}

	public void add1() {
		int a = 1;
		int k = 0;

		for (int i = 1; i <= 4; i++) {
			a = a * 10;
			int j = a - 1;
			k = k + j;
			System.out.print(j + " ");
		}
		System.out.println("= " + k);

	}

	public void add() {

		int sum = 0;
		int r = 9;
		for (int i = 1; i <= 3; i++) {
			sum = sum + r;
			System.out.println(r);
			r = r * 10 + 9;
		}
		System.out.println(sum);
	}

	public void onePower1_2Power2() {
		for (int i = 1; i <= 10; i++) {
			int l = 1;
			for (int j = 1; j <= i; j++) {
				l = i * l;

			}
			System.out.println(l);
		}
	}

	public void fiboneci() {
		// 0 ,1 ,1 ,2 ,3 ,5 ,8 ,13;

		int a = 0;
		int b = 1;

		for (int i = 0; i < 8; i++) {

			System.out.print(a + " ");

			int c = a + b;
			a = b;
			b = c;
		}

	}

	public void reverseName() {
		String name = "vinay";
		String[] lettn = name.split("");
		String rev = "";
		for (int i = 0; i < lettn.length; i++) {
			rev = lettn[i] + rev; // v , iv , niv

		}
		System.out.println(rev);

	}

	public void reverseName1() {
		String name = "vinay";

		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

	}

	public void reverseOne() {
		String name = "vinay kumar yadav";/// rev=kumar

		String[] asdf = name.split(" ");

		for (int i = 0; i < asdf.length; i++) {
			if (i % 2 == 1) {
				for (int j = asdf[i].length() - 1; j >= 0; j--) {
					System.out.print(asdf[i].charAt(j));
				}
				System.out.print(" ");

			} else {
				System.out.print(asdf[i] + " ");
			}

		}

	}

	public void reverseAll() {

		String name1 = "vinay kumar yadav";//// rev=all
		String[] str = name1.split("");

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);

		}

	}

	public void AbCd() {

		char a = 97;
		char b = 65;
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				if (a == 97) {
					System.out.print(a + " ");
				}
				if (b == 65) {
					System.out.print(b + " ");
				}

			}
			a++;
			System.out.println();
		}
	}

}
