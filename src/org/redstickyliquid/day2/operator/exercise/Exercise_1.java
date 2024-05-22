package org.redstickyliquid.day2.operator.exercise;

import java.util.Scanner;

public class Exercise_1 {
	
	public static void inequality (int a, int b) {
		if (a == 50 && b == 30) {
				boolean[] results = new boolean[4];
				results[0] = a != b && a < b;
				results[1] = a < b || a == b;
				results[2] = a > b && a != b;
				results[3] = a > b || a == b;
				
				for (int i = 0; i < results.length ; i++) {
					System.out.println("Probem 1 - Result " + (i + 1) + " : " + results[i]);
				}
		}
		else if (a == 70 && b == 55) { 
				boolean[] results = new boolean[4];
				results[0] = a == b || a++ < 100;
				results[1] = a < b && --b < 55;
				results[2] = a != b && b-- < a++;
				results[3] = a++ != b || b++ >= 85; 
			
				for (int i = 0; i < results.length ; i++) {
					System.out.println("Probem 2 - Result " + (i + 1) + " : " + results[i]);
				}
				System.out.println("Problem 2 - Numbers : " + "a = " + a + ", b = " + b);
			}
		else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
	};
	
	
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("50과 30 또는 70과 55를 띄어쓰기 또는 새 줄로 구분하여 입력하시오: ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
				
		inequality(a, b);
		
		scanner.close();
	}
}
