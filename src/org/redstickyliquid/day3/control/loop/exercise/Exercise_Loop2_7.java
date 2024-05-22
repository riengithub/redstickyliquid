package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_7 {

	// 7번
	// 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
	// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.

	public static void println(Object obj) {
		System.out.println(obj);
	}

	public static void print(Object obj) {
		System.out.print(obj);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;
		boolean isInit = false;
		do {
			if (isInit) {
				print("잘못 입력하셨습니다. ");
			} else {
				isInit = true;
			}

			print("2보다 크거나 작은 소수를 입력하시오: ");

			input = sc.nextInt();

			if (input > 1) {
				int quantity = 0;
				for (int i = 2; i <= input; i++)
					for (int j = 2; j <= i; j++) {
						if (i % j == 0) {
							if (i > j) {
								break;
							} else {
								println(i);
								quantity++;
							}
						}
					}
				println("소수의 개수: " + quantity);
			}

		} while (input < 2);

		sc.close();
	}
}
