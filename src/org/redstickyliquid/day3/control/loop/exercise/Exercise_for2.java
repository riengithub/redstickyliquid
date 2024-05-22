package org.redstickyliquid.day3.control.loop.exercise;

public class Exercise_for2 {

	public static void main(String[] args) {
		
		
//		int sum = 1;
		for (int i = 1, sum = 1; i <= 10; i++, sum += i) {
			
			if (i < 10) System.out.print(i + " + ");
			else System.out.print("10 = " + sum);
			
		}
		
//		for (int i = 1; i < 10; i++) {
//			
//			System.out.print(i + " + ");
//		//aㅁ잣	
//		}
//		sum += 10;
//		System.out.print("10 = " + sum);
	}
}
