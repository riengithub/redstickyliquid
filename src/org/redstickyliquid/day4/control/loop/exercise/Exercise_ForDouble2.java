package org.redstickyliquid.day4.control.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String[] args) {
		int day = 60 * 24;
		for(int minute = 0; minute < day; minute++) {
			System.out.printf("%d시 %d분\n", minute / 60, minute % 60);
		}
	}
}
