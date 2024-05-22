package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_6 {

	// 6번
	// 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
	// “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.

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
				for (int i = 2; i <= input; i++) {
					if (input % i == 0) {
						if (input > i) {
							print("소수가 아닙니다.");
							break;
						}
						print("소수입니다.");
						break;
					}
				}
			};
			
		} while (input < 2);

		sc.close();
	}
}
