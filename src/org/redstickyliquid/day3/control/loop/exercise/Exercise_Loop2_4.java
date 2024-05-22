package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_4 {

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
		for (i = 1; i <= input; i++) {
			for (j = 1; j <= input; j++) {
				boolean isHorizontalMid = (j != 1 && j != input);
				boolean isVerticalMid = (i != 1 && i != input);
				boolean horizontalLeft = j == 1;
				boolean horizontalRight = j == input;
//				if (!isVerticalMid && horizontalLeft) print(" ");
				if (isVerticalMid && horizontalRight) print(" ");
				if (isVerticalMid && isHorizontalMid) 	print(" ");
				else print("*");
//				if (!isVerticalMid && horizontalRight) print(" ");
				if (isVerticalMid && horizontalLeft) print(" ");
			}
			println("");
		}
		sc.close();
	}
}
