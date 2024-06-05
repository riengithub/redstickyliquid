package org.redstickyliquid.day7.classbasics;

import java.util.Scanner;

public class Suit {
	public static void example(String... strs) {
		for (String str : strs) {
			System.out.print(str);
		}
	}

	public static void main(String[] args) {
//		Suit suit = new Suit();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("문자열을 입력하시오: ");
			Suit.example(sc.next(), sc.next(), sc.next(), sc.next());
		} catch (Exception e) {
			System.out.print(e);
		}

	}
}
