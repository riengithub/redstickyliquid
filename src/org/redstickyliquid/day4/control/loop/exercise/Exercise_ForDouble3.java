package org.redstickyliquid.day4.control.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j <= 4; j++) {
				System.out.printf("%d * %d = %d, ", j, i, j * i);
			}
			System.out.println("");
		}
	}
}
