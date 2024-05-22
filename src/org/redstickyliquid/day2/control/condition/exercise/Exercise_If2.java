package org.redstickyliquid.day2.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
		// 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하라
		// 주문 하시겠어요? 가격을 알려드립니다.
		// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		// 메뉴를 입력해 주세요 : 에스프레소
		// 2500원 입니다
		// 메뉴를 입력해 주세요 : 자바칩 프라프치노
		// 없는 메뉴입니다
		
		int espresso = 2500, capuccino = 4000, latte = 3500, americano = 3000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴: 에스프레소, 카푸치노, 카페라떼, 아메리카노");
		System.out.print("주문할 메뉴를 입력하시면 가격을 알려드립니다: ");
		
		String order = sc.next();
		int price = -1;
		
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
				case "아메리카노": {
					price = americano;
					break;
				}
				default : {
					System.out.print("없는 메뉴입니다.");
				}
		}
		if (price != -1) System.out.print(price + "원 입니다.");
		sc.close();
	}
}
