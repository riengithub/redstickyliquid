package org.redstickyliquid.day5.array;

import java.util.Scanner;

public class Arrays_ex_adv_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각 행렬의 크기: ");
		int size = sc.nextInt();
		int start = size - 1;
		int iteration = 1;
		int[][] snail = new int[size][size];
		for (int i = 0; i <= size * 2 - 1; i++) {
//			System.out.println("start i: " + i);
			if (i / 4 == start - i / 4) {
				snail[i / 4][start / 2] = iteration++;
				break;
			} else {
				for (int j = 0 + (i / 4); j < start - (i / 4); j++) {
//					System.out.print("\tstart j: " + j);
					if (i % 4 == 0) {
						snail[i / 4][start - j] = iteration++;
					}
					if (i % 4 == 1) {
						snail[j][i / 4] = iteration++;
					}
					if (i % 4 == 2) {
						snail[start - i / 4][j] = iteration++;
					}
					if (i % 4 == 3) {
						snail[start - j][start - i / 4] = iteration++;
					}
//					System.out.println("\tend j: " + j);
				}
			}
//			System.out.println("end i: " + i);
//			System.out.println();
		}
		for (int[] a : snail) {
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
