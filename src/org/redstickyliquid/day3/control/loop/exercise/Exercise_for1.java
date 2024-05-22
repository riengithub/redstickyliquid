package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_for1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오: ");
		int num = sc.nextInt();
		sc.close();
		if (num > 0 && num < 10) 
			for (int i = 1; i < 10; i ++) 
				System.out.printf("%d * %d = %d\n", num, i, num * i);
		else System.out.print("1과 9 사이의 양수를 입력해야 합니다.");
	}
}
