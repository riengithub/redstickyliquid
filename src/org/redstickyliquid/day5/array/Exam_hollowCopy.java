package org.redstickyliquid.day5.array;

public class Exam_hollowCopy {
	public static void main(String[] args) {
		int[] arr = new int[4];
		for(int i=0; i<arr.length; i++) arr[i] = i*i;
		int[] copy = arr;
		copy[1] = 11;
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		for(int i : copy) System.out.println(i + " ");
		
	}
}
