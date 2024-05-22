package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int negative = 0;
		System.out.print("정수를 입력하시오: ");
		while ((negative = sc.nextInt()) != -1) {
//			negative = sc.nextInt();
			sum += negative;
			System.out.print("정수를 입력하시오: ");
		}
		
		System.out.print("입력된 수들의 합: " + sum);
		
		sc.close();
		
	}
}
