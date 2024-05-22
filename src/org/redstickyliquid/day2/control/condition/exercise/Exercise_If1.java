package org.redstickyliquid.day2.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		// 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		// 60점 미만이면 불합격으로 출력한다.
		// 단, 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("점수와 학년을 띄어쓰기 또는 행으로 구분하여 정수로 차례대로 입력하시오: ");
		int score = sc.nextInt();
		int grade = sc.nextInt();
		
		String pass = score >= 70 && grade == 4 ? "합격" : score >= 60 ? "합격" : "불합격";
		System.out.print(pass + " 했습니다.");
		
		sc.close();
	}
}
