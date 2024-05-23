package org.redstickyliquid.day5.array;

import java.util.Scanner;

public class Arrays_ex_adv_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 개수: ");
		int numRow = sc.nextInt();
		System.out.print("열의 개수: ");
		int numColumn = sc.nextInt();
		char[][] arr = new char[numRow][numColumn];
		for (char[] row : arr) {
			for (char ch : row) {
				ch = (char) ((int) (Math.random() * 25) + 97);
				System.out.printf("%c ", ch);
			}
			System.out.println("");
		};
		sc.close();
	}

}
