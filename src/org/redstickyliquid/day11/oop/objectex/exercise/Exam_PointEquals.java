package org.redstickyliquid.day11.oop.objectex.exercise;

public class Exam_PointEquals {

	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		System.out.printf("%s", p1.equals(p2) ? "좌표가 같습니다" : "좌표가 다릅니다.");
	}
	
}

