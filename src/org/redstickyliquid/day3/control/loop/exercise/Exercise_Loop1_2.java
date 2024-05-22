package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_2 {
	
	public static void print (Object obj) {
		System.out.print(obj);
	}
	
	public static void println (Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		boolean isStarted = false;
		do {
			if (isStarted) {
				print("1 이상의 숫자를 입력해 주세요. ");
			} else {
				isStarted = true;
			}
			print("정수를 입력하세요: ");
			input = sc.nextInt();
			if (input > 0)
				for (int i = input; i > 0; i--)
					println(i);
		} while (input < 1);
		sc.close();
	}
}
