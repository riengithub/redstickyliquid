package org.redstickyliquid.day5.exception;

import java.util.Scanner;

public class ExerciseExemption_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, div = 0;
		while (b == 0) {
			try {
				System.out.print("정수 두개를 띄어쓰기 또는 행으로 구분하여 입력하시오: ");
				a = sc.nextInt();
				b = sc.nextInt();
				div = a / b;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}
			System.out.println("몫: " + div);
		}
		sc.close();
	}

}
