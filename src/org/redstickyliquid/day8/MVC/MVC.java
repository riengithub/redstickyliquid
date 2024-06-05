package org.redstickyliquid.day8.MVC;

import java.util.Scanner;

public class MVC {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		View view = new View();
		Words words = new Words(new Word[3]);
		end: while (true) {

			switch (view.init()) {
			case "1":
				view.print(words.getWords());
				break;
			case "2":
				view.insert(words.getWords());
				break;
			case "3":
				break end;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

}
