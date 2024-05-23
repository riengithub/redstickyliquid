package org.redstickyliquid.day5.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseExemption_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean isClosed = false;
		while (isClosed == false) {
			sum = 0;
			for (int i = 0; i < 3; i++) {
				try {
					System.out.printf("정수%d: ", i + 1);
					sum += sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해 주세요.");
					i--;
					sc.next();
					continue;
				}

			}

			System.out.println("합: " + sum);
			isClosed = true;
			sc.close();
		}

	}

}
