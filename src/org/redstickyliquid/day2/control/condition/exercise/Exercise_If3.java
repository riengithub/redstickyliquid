package org.redstickyliquid.day2.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
		// 점수를 입력받아 등급을 알려주는 프로그램을 작성하세요.
		// 점수를 입력해주세요 : 92
		// 학점은 A입니다.
		// 단, 점수는 0 부터 100 사이의 수를 입력하도록 함.
		// 점수를 입력해주세요 : 102
		// 0 ~ 100 사이의 수를 입력해주세요
		// 커트라인 ( 90 ~ 100 : A, 89 B, 79 C, 69 D, 59 F)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요: ");
		
		double score = sc.nextDouble();
		String grade = score > 100 || score < 0? "error" : score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
		
		if (grade == "error") {
			System.out.print("0과 100 사이의 수를 입력해 주세요.");
		} else {
			System.out.printf("학점은 %s 입니다", grade);
		}
		sc.close();
	}
}
