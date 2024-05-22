package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_2 {

	public static void println(Object obj) {
		System.out.println(obj);
	}

	public static void print(Object obj) {
		System.out.print(obj);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		print("정수를 입력하세요: ");
		int input = sc.nextInt();
		int i;
		int j;
		for (i = 1; i < input * 2; i++) {
			for (j = i <= input ? 0 : 2 * (i - input); j < i; j ++) {
				print("*");
			}
			println("");
		}
		sc.close();
	}
}
