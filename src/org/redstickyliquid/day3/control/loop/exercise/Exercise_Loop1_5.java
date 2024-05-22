package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++)
			System.out.println(num + " * " + i + " = " + num * i);
		sc.close();
	}
}
