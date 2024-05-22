package org.redstickyliquid.day3.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop1_6 {
	
	public static void print (Object obj) {
		System.out.print(obj);
	}
	
	public static void println (Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean isStarted = false;
		
		do {
			if (isStarted) 
				print("9 이하의 숫자만 입력해 주세요. ");
			else isStarted = true;
			print("정수를 입력하세요: ");
		} while((num = sc.nextInt()) > 9);
		
		for (int i = num; i < 10; i ++) for (int j = 1; j < 10; j++) println(i + " * " + j + " = " + i * j);
		
		sc.close();
	}
}
