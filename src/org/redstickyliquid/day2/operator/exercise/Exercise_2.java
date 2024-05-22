package org.redstickyliquid.day2.operator.exercise;

import java.util.Scanner;

public class Exercise_2 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 정수나 입력하시오: ");
		
		int num = sc.nextInt();
		boolean result = num >= 1 && num <= 100;
		
		System.out.println("입력하신 정수가 1과 100 사이인지의 여부: " + result);
		
		System.out.print("아무 영문 글자나 입력하시오: ");
		
		char word = sc.next().charAt(0);
		boolean upperOrLower = word >= 65 && word <= 90;
		
		sc.close();
		
		System.out.println("입력하신 글자가 대문자인지의 여부: " + upperOrLower);
		
	}
}
