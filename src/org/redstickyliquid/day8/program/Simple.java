package org.redstickyliquid.day8.program;

import java.util.HashMap;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		new Words().display();
	}
}

class Tools {
	static Scanner sc = new Scanner(System.in);
	
	static String printPrompt(String... prompts) {

		for (String prompt : prompts) {
			System.out.print(prompt);
		}

		System.out.print(" >> ");

		String input = sc.nextLine();
		return input;
	}

	static void printStrings(String[] strings) {
		for (String string : strings) {
			System.out.printf("%s\n", string);
		}

	}
}

class Words {
	HashMap<String, String> words = new HashMap<String, String>();
	String[] functions = {"단어장을 열었습니다.", "\t보기", "\t등록", "\t삭제", "\t나가기" };

	void display() {
		Tools.printStrings(functions);
		String selected = Tools.printPrompt("문자열로 명령어를 입력하세요");
		switch (selected) {
		case "보기":
			this.view();
			break;
		case "등록":
			this.add();
			break;
		case "삭제":
			this.remove();
			break;
		case "나가기":
			System.out.println("종료 합니다.");
			break;
		default:
			System.out.println("명령어가 올바르지 않습니다.");
			this.display();
		}
	}

	void view() {
		System.out.println("\t등록된 단어들");
		for (HashMap.Entry<String, String> pair : words.entrySet()) {
			System.out.printf("\t%s : %s\n", pair.getKey(), pair.getValue());
		}
		this.display();

	}

	void add() {
		String word = Tools.printPrompt("등록할 단어를 입력하세요");
		String definition = Tools.printPrompt("등록할 단어의 의미를 입력하세요");
		words.put(word, definition);
		this.display();
	}

	void remove() {
		String word = Tools.printPrompt("삭제할 단어를 입력하세요");
		words.remove(word);
		System.out.println("단어를 지웠습니다.");
		this.display();
	}
}



