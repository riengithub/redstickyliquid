package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

//1번
//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//단, 입력한 수는 1보다 크거나 같아야 합니다.
//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.



public class Exercise_Loop1_1 {
	
	public static void print (Object obj) {
		System.out.print(obj);
	}
	
	public static void println (Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		boolean isStarted = false;
		do {
			if (isStarted) {
				print("1 이상의 숫자를 입력해 주세요. ");
			} else {
				isStarted = true;
			}
			print("정수를 입력하세요: ");
			input = sc.nextInt();
			if (input > 0)
				for (int i = 1; i <= input; i++)
					println(i);
		} while (input < 1);
		sc.close();
	}
}
