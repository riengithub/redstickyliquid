package org.redstickyliquid.day2.printbasic;

public class PrintSamples {

	public static void main(String[] args) {
		System.out.printf("정수 출력: %d\n", 11);
		System.out.printf("실수 출력: %f\n", 11.0);
		System.out.printf("글자 출력: %c\n", 'C');
		System.out.printf("문자열 출력: %s\n", "String");
		System.out.println();
		System.out.printf("문자열 %s과 정수 %d와 실수 %.1f와 글자 %c 동시 출력", "'이 문자열'", 1, 1.1, 'C');
	}
}
