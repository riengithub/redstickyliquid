package org.redstickyliquid.day6.array.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int i;
		int j;
		int l = 5;
		int[] arr = new int[l];

		Scanner sc = new Scanner(System.in);
		for (i = 0; i < l; i++) {
			System.out.printf("%d번째 정수 입력: ", i + 1);
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < l; i++) {
			for (j = 0; j < l - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int e : arr)
			System.out.print(e);
		System.out.printf("\n정렬 후 첫번째 수와 마지막 수의 합: %d", arr[0] + arr[l - 1]);
		sc.close();
	}

}
