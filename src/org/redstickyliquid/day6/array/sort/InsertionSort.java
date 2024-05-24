package org.redstickyliquid.day6.array.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 1, 7, 5, 8, 6 };
		int l = arr.length;
		int i;
		int j;
		for (i = 1; i < l; i++) {
			int k = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > k; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = k;
		}
		for (int e : arr)
			System.out.print(e);
	}

}
