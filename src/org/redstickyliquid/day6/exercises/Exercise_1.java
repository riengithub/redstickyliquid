package org.redstickyliquid.day6.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {

	public static int indexOf(Object[] arr, Object obj) {
		int l = arr.length;
		int idx = -1;
		for (int i = 0; i < l; i++) {
			if (arr[i].equals(obj)) {
				idx = i;
				break;
			}

		}
		;
		return idx;
	}

//	정상 실행 결과 예시
//	----------- 컴퓨터에게 지는 경우 -------------
//	가위 바위 보 게임을 시작합니다.
//	가위 바위 보 중 한 개를 입력하세요 : 가위
//	당신은 가위를 냈습니다.
//	컴퓨터는 바위를 냈습니다.
//	당신이 졌습니다!
//
//	-----------컴퓨터에게 이기는 경우 --------------
//	가위 바위 보 게임을 시작합니다.
//	가위 바위 보 중 한 개를 입력하세요 : 보
//	당신은 보를 냈습니다.
//	컴퓨터는 바위를 냈습니다.
//	당신이 이겼습니다!
//
//	-------- 컴퓨터와 비기는 경우 ------------
//	가위 바위 보 게임을 시작합니다.
//	가위 바위 보 중 한 개를 입력하세요 : 가위
//	당신은 가위를 냈습니다.
//	컴퓨터는 가위를 냈습니다.
//	비겼습니다. 다시 시작합니다.
//
//	가위 바위 보 중 한 개를 입력하세요 :   <-- 출력하며 반복됨

	public static void main(String[] args) {
		
		Random roll = new Random();
		Scanner sc = new Scanner(System.in);
		String[] ops = { "바위", "보", "가위" };
		String[] results = { "비겼습니다. 다시 시작합니다.", "당신이 졌습니다!", "당신이 이겼습니다!" };
		String[] conditions = new String[3];
		int result = 0;
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		
		while (result == 0) {

			System.out.print("가위 바위 보 중 한개를 입력하세요 : ");
			
			int player = indexOf(ops, sc.next());
			String computer = ops[roll.nextInt(3)];
			
			System.out.printf("당신은 %s를 냈습니다.\n", ops[player]);
			System.out.printf("컴퓨터는 %s를 냈습니다.\n", computer);
			
			for (int i = 0; i < 3; i++) {
				conditions[i] = ops[(player + i) > 2 ? player + i - 3 : player + i];
			};
			player = 0;
			result = player + indexOf(conditions, computer);
			System.out.println(results[result]);
		}
		sc.close();
	}

}
