package org.redstickyliquid.day5.array;

public class Arrays_ex7 {

	public static void main(String[] args) {
		int l = 5;
		int[][] arr = new int[l][l];
		int num = 1;
		for (int i = 0; i < l; i++) {
			for (int j = l - 1; j >= 0; j--) {
				arr[(i % 2 == 0) ? j : l - 1 - j][i] = num++;
			}
		}
		for (int i = 0; i < l; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\n", arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4]);

		}
	}
}
