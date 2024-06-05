package org.redstickyliquid.day7.classbasics;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.name = "달덩이";
		c.radius = 5;
		System.out.println(c.getArea());

		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 너비와 높이를 입력하세요: ");
		Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
		r.getArea();
		
	}

}
