package org.redstickyliquid.day6.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("배열의 크기: ");
		int l = sc.nextInt();
		if (l < 0) {
			System.out.print("배열의 크기는 양수로 입력해야 합니다!");
		} else {
			int[] source = new int[100], output = new int[l];
			int sum = 0;
			for(int i = 0; i < 100; i++) source[i] = i + 1;
			for(int i = 0; i < l; i++) {
				int idx = rand.nextInt(100);
				if (source[idx] > 0) {
					output[i] = source[idx];
					sum += source[idx];
					source[idx] = -1;
					
				} else {
					i--;
				}
			}
			for(int e : output) System.out.println(e);
			System.out.printf("sum = %d", sum);
		}
		sc.close();
	}
}
