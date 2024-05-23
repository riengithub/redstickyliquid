package org.redstickyliquid.day5.array;

public class Exam_deepCopy {

	public static void main(String[] args) {
		int[] arr = {0, 1, 4, 9};
		int[] copy = new int[4];
		for(int i = 0; i < arr.length; i++) copy[i] = arr[i];
		copy[0] = 2;
		for(int i : copy) System.out.println(i);
		for(int i : arr) System.out.println(i);
//		System.arraycopy(arr, 0, copy, 0, 4);
		
		
	}

}
