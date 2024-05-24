package org.redstickyliquid.day6.exercises;

import java.util.Scanner;

public class Exercise_2 {
	
	// 5번
	// 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
	// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.

	public static void println(Object obj) {
		System.out.println(obj);
	}

	public static void print(Object obj) {
		System.out.print(obj);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		print("2보다 크거나 작은 소수를 입력하시오: ");
		int input = sc.nextInt();
		if (input < 3) print ("잘못 입력하셨습니다."); else
		for (int i = 2; i <= input; i++) {
			if(input % i == 0) {
				if(input > i) {
					print("소수가 아닙니다.");
					break;
					}
				print("소수입니다.");
				break;
			};
		}
		sc.close();
	}
}
