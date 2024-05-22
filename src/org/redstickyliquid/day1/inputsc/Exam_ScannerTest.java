package org.redstickyliquid.day1.inputsc;

import java.util.Scanner;

public class Exam_ScannerTest {

	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
//		boolean booo = scanner.nextBoolean();
//		String str = scanner.next();
//		byte bite = scanner.nextByte();
//		short shirt = scanner.nextShort();
//		int integer = scanner.nextInt();
//		long longbow = scanner.nextLong();
//		float floating = scanner.nextFloat();
//		double irish = scanner.nextDouble();
		
		System.out.println("이름 도시 나이 체중 독신 여부를 빈칸을 분리하여 입력하세요.");
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean married = scanner.nextBoolean();
		System.out.println(name+city+age+weight+married);
		
		scanner.close();
		
	}
	
}
