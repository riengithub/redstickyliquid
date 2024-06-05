package org.redstickyliquid.day11.oop.objectex.exercise;

public class Point {
	int x, y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return p.x == this.x && p.y == this.y;
	}
}
