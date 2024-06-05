package org.redstickyliquid.day5.exception;

import java.util.Scanner;
//NumberFormatException //NullPointerException
public class ExerciseExemption_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("문자열을 입력하세요: ");
		}
		catch (NumberFormatException e) {}

	}

}
