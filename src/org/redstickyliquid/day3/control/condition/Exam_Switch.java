package org.redstickyliquid.day3.control.condition;

import java.util.Scanner;

public class Exam_Switch {
	
	public static void print (String str) {
		System.out.print(str);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		print("1과 3 사이의 정수를 입력하시오: ");
		int input = sc.nextInt();
		String color;
		switch (input) {
				case 1 : {color = "Red";break;}
				case 2 : {color = "Yellow";break;}
				case 3 : {color = "Green";break;}
				default : {color = "invalid";}
		}
		
		print(color);

		sc.close();
			
	}

}
