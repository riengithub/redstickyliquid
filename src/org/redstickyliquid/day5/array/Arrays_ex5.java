package org.redstickyliquid.day5.array;

public class Arrays_ex5 {

	public static void main(String[] args) {
		int l = 5;
		int[][] arr = new int[l][l];
		int sum = 1;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				arr[i][(i % 2 == 0) ? l - 1 - j : j ] = sum++;
			}
		}
		
		for (int[] r : arr) System.out.printf("%d\t%d\t%d\t%d\t%d\t\n", r[0], r[1], r[2], r[3], r[4]);

	}

}
