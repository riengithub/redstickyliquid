package org.redstickyliquid.day3.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch1 {

	public static void print(String string, int toggle) {
		if (toggle == 1)
			System.out.println(string);
		else
			System.out.print(string);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String order;
		int price;

		int espresso = 2500, capuccino = 3500, latte = 4000, americano = 3000;

		print("에스프레소, 카푸치노, 카페라떼, 아메리카노가 있습니다.", 1);
		print("원하시는 메뉴를 입력하시면 가격을 알려드립니다: ", 0);
		order = sc.next();

		switch (order) {
		case "에스프레소": {
			price = espresso;
			break;
		}
		case "카푸치노": {
			price = capuccino;
			break;
		}
		case "카페라떼": {
			price = latte;
			break;
		}
		case "라떼": {
			price = latte;
			break;
		}
		case "아메리카노": {
			price = americano;
			break;
		}
		default: {
			price = -1;
		}
		}

		if (price != -1)
			print("원하시는 음료의 가격은 " + price + "원 입니다.", 0);
		else {
			print("없는 메뉴입니다.", 1);
		}

		sc.close();

	}
}
