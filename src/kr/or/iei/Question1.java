package kr.or.iei;

import java.util.Scanner;

public class Question1 {

//	2. 구현 내용
//	 주제 : 5개의 정수를 입력후 입력한 값들이 오름차순 정렬로 표현 되도록 구현하시오 
//	 - 요구사항
//	     1) 패키지명, 클래스명, 메소드명을 모두 요구사항에 맞게 제작
//	     2) 입력은 반복문, Scanner 객체를 사용하여 5번 입력 받아야 함 (정수 5개 입력받는 배열 사용)
//	     3) 정렬 기법은 버블정렬을 이용하여 오름차순 정렬 되어야 함
//	     4) 정렬된 결과 출력은 반복문을 이용하여 출력 되어야 함
//	     5) 마지막에 첫번째 수와 마지막수를 합한 값을 출력할 수 있어야 함

	public static void main(String[] args) {
		int i;
		int j;
		int l = 5;
		int[] arr = new int[l];

		Scanner sc = new Scanner(System.in);
		for (i = 0; i < l; i++) {
			System.out.printf("%d번째 정수 입력: ", i + 1);
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < l; i++) {
			for (j = 0; j < l - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int e : arr) System.out.print(e);
		System.out.printf("\n정렬 후 첫번째 수와 마지막 수의 합: %d", arr[0]+arr[l-1]);
		sc.close();
	}
}
