package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2_1 {
	
	// 1부터 사용자에게 입력 받은 수까지 중에서
	// 1) 2와 3의 배수를 모두 출력하고
	// 2) 2와 3의 공배수의 개수를 출력하세요.

	public static void println(Object obj) {
		System.out.println(obj);
	}
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		print("정수를 입력하세요: ");
		int input = sc.nextInt();
		sc.close();
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) println("2의 배수 " + i);
			if (i % 3 == 0) println("3의 배수 " + i);
		}
		
		println("2와 3의 공배수의 개수 " + input / 6);
		
	}
}
