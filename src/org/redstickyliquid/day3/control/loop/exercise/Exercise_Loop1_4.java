package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_4 {
	
	public static void print (Object obj) {
		System.out.print(obj);
	}
	
	public static void println (Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean isStarted = false;
		do {
			if (isStarted)
				print("1 이상의 숫자를 입력해 주세요. ");
			else
				isStarted = true;
			print("a에 대입할 값을 정수로 입력하세요: ");
		} while ((a = sc.nextInt()) < 1);
		isStarted = false;
		do {
			if (isStarted)
				print("1 이상의 숫자를 입력해 주세요. ");
			else
				isStarted = true;
			print("b에 대입할 값을 정수로 입력하세요: ");
		} while ((b = sc.nextInt()) < 1);
		for (int lesser = a != b ? a > b ? b : a: a, greater = a != b ? a > b ? a : b: a; lesser <= greater; lesser ++) println(lesser);
		sc.close();
	}
}
