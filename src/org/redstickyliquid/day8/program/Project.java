package org.redstickyliquid.day8.program;

import java.util.Scanner;

public class Project {
	static Scanner scanner = new Scanner(System.in);
	static Menu home = new Menu(new Idle(), "홈", "추가하기", "종료하기");
	static Menu add = new Menu(new Add(), "추가하기", "단어와 뜻을 입력하세요.");

	static String[] words = new String[3];
	static Action[] actions = {};
	static Menu[] menus = { home, add };

	static void prompt(Menu menu) {
		menu.display();
		System.out.print(" >> ");
	}

	static void process(String input) {

		if (currentMenu == add) {

		} else {
			int i = 0;
			for (Menu menu : menus) {
				if (menu.label.equals(input)) {
					prompt(menu);
					break;
				} else {
					i++;
				}
			}
			if (i == menus.length) {

				System.out.println("입력하신 기능이 없습니다.");
				prompt(currentMenu);

			}
		}

	}

	public static void main(String[] args) {

		prompt(home);
	}

}

class Menu {
	String label;
	String[] lines;
	Action action;

	Menu(Action action, String label, String... lines) {
		this.action = action;
		this.label = label;
		this.lines = lines;
	}

	void run() {
		action.execute();
	}
}

abstract interface Action {
	void execute(Object obj);
}

class Idle implements Action {
	public void execute(String[] lines) {
		for (String line : lines) {
			System.out.printf("- %s\n", line);
		}
	}

	@Override
	public void execute(Object obj) {
		// TODO Auto-generated method stub
		
	};
}

class Add implements Action {

	public void execute(Scanner scanner, String[] words, String input) {
		int index = Utils.nextNull(words);
		if (index != -1) {
			words[index] = input;
		} else {
			System.out.println("추가할 공간이 없습니다.");
		}
	}

	@Override
	public void execute(Object obj) {		
	}

}

class Utils {
	static int nextNull(Object[] arr) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				index = i;
				break;
			}
		}
		return index;
	}

	static void compress(Object[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == null && arr[j] != null) {
					arr[i] = arr[j];
					arr[j] = null;
				}
			}
		}
	}
}
