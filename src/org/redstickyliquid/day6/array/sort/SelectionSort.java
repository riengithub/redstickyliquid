package org.redstickyliquid.day6.array.sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {6,4,5,3,2,7,1,9,8};
		int l = arr.length;
		int i;
		int j;
		for(i = 0; i < l - 1; i++) {
			int min_index = i;
			for(j = i + 1; j < l; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			}
		}
		for(int n : arr) System.out.print(n);
		
	}

}
