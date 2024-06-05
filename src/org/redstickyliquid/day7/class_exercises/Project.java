package org.redstickyliquid.day7.class_exercises;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Project {

	static String[] teachers = new String[3];

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

	static void register(Home home) {
		int index = nextNull(teachers);
		if (index != -1) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("등록할 선생님의 이름을 입력하세요.\n >> ");
				String name = sc.next();
				teachers[index] = name;
				System.out.printf("%s 선생님이 등록 됐습니다. \n", name);
				home.display();
			} catch (Exception e) {
				System.out.println("올바르게 입력하세요.");
				register(home);
			}
		} else {
			System.out.println("새로 등록할 공간이 없습니다.");
			home.display();
		}
	}

	static void listTeachers(Home home) {
		int index = nextNull(teachers);
		if (index == 0) {
			System.out.println("등록된 선생님이 없습니다.");
			home.display();
		} else {
			if (index == -1)
				index = teachers.length;
			for (int i = 0; i < index; i++) {
				System.out.printf("- %s 선생님\n", teachers[i]);
			}

			home.display();
		}
	}

	static void retire(Home home) {
		int index = nextNull(teachers);
		if (index == 0) {
			System.out.println("등록된 선생님이 없습니다.");
			home.display();
		} else {
			if (index == -1)
				index = teachers.length;
			for (int i = 0; i < index; i++) {
				System.out.printf("%d. %s 선생님\n", i + 1, teachers[i]);
			}

			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("은퇴시킬 선생님의 번호를 입력하세요.\n >> ");
				int num = sc.nextInt();
				System.out.printf("%s 선생님이 은퇴하셨습니다. \n", teachers[num - 1]);
				teachers[num - 1] = null;
				compress(teachers);
				home.display();
			} catch (Exception e) {
				System.out.println("올바르게 입력하세요.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Home home = new Home(sc);
		home.display();

	}
}

class Home {
	String[] options = { "1. 선생님 등록하기", "2. 선생님 보기", "3. 선생님 은퇴시키기", "4. 종료" };
	Scanner sc;
	
	Home (Scanner sc) {
		this.sc = sc;
	}
	void display() {
		for (String option : options) {
			System.out.println(option);
		}
		try {
			System.out.print(" >> ");
			int select = sc.nextInt();
			run(select);
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("올바르게 입력하세요.");
			this.display();
		}		
	}

	void run(int select) {
		if (select == 1) {
			Project.register(this);
		} else if (select == 2) {
			Project.listTeachers(this);
		} else if (select == 3) {
			Project.retire(this);
		} else {
			System.out.print("종료 됐습니다.");
		}
	}
}