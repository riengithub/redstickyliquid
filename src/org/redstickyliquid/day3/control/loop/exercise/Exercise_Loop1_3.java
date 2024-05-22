package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int input = sc.nextInt();
		int sign = input >= 0 ? 1 : -1;
		int sum = 0;
		for (int i = 1; sign == 1 ? i <= input : i >= input; i += sign) sum += i;
		System.out.print(sum);
		sc.close();
	}
}
