package org.redstickyliquid.day4.control.loop;

public class Exam_ForDouble {
	public static void main(String[] args) {
	for(int i = 2 ; i < 10 ; i ++) for(int j = 2 ; j < 10 ; j ++) System.out.printf("%d * %d = %d\n", i, j, i * j);
	int size = 3;
	int sum = 1;
	int[] matrix = new int[size];
	for(int i = 0 ; i < size ; i++) {
		for(int j = 0; j < size; j++) {
			matrix[j] = sum;
			System.out.print(matrix[j]);
		}
		System.out.println();
	}
	
	}
}
