package org.redstickyliquid.day4.control.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
