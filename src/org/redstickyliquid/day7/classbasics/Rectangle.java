package org.redstickyliquid.day7.classbasics;

public class Rectangle {
	public double width;
	public double height;

	public Rectangle() {
		new Rectangle(0,0);
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		double area = width * height;
		System.out.printf("사각형의 넓이는 %.1f 입니다.", area);
		return area;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
