package org.redstickyliquid.day5.exception;

import java.util.Scanner;

public class ExerciseExemption_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isClosed = false;
		System.out.print("배열의 길이를 정하시오: ");
		int l = sc.nextInt();
		Object[] arr = new Object[l];
		while (!isClosed) {
			System.out.printf("길이가 %d인 배열을 대상으로 반복문을 반복할 횟수를 쓰시오: ", l);
			int repeat = sc.nextInt();
			for (int i = 0; i < repeat; i++) {
				try {
					arr[i] = i;
					System.out.printf("arr[%d] = " + arr[i] + "\n", i);
				}

				catch (IndexOutOfBoundsException e) {
					System.out.printf("%d번째 반복에서 오류가 발생했소. %d 이하의 수를 입력하시오.\n", i + 1, l);

					break;
				}
			}
			if (repeat <= l) {
				System.out.print("Successful");
				sc.close();
				isClosed = true;
			}
		}

	}
}
