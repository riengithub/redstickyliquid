package org.redstickyliquid.day2.operator;

import java.util.Scanner;

public class Ternary {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수를 입력하시오: ");
	int num = sc.nextInt();
	String result = num % 2 == 0 ? "짝수" : "홀수";
	System.out.print("입력한 정수는 " + result + "입니다");
	sc.close();
	}
}
