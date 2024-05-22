package org.redstickyliquid.day3.control.loop.exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) sum += i;
			i++;
		}
		System.out.print("1과 100사이 홀수의 합: " + sum);
	}
}
