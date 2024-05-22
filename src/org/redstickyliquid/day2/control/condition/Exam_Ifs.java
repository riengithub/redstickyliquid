package org.redstickyliquid.day2.control.condition;

import java.util.Scanner;

public class Exam_Ifs {
	
	public static void enterNumber (Scanner sc) {
			try {
					System.out.print("Enter an integer: ");
					
					int num = sc.nextInt();
					boolean isZero = num == 0;
					
					if (isZero) {
							System.out.print("The number you entered is 0.");
					} else {
							if (num > 0) {
								if (num % 2 == 0) {
									System.out.print("It is a positve, even number.");
								}
								else {
									System.out.print("It is a positive, odd number.");
								}
							}
							else  {
								if (num % 2 == 0) {
									System.out.print("It is a negative, even number.");
								}
								else {
									System.out.print("It is a negative, odd number.");
								}
							}
						}
			} catch (Exception e) {
				System.out.print("Please enter an integer.");
				enterNumber(sc);
			}
			finally {
				sc.close();
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		enterNumber(sc);
	}
}
