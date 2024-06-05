package org.redstickyliquid.day8.MVC;

public class View {
	
	String[] functions = {"1. 선생님 만들기", "2. 선생님 보기", "3. 선생님 지우기", "4. 종료"};
	
	public void print(Word[] words) {
		for (Word word : words) {
			if (word != null)System.out.println(word.toString());
		}
	};

	public Word[] insert(Word[] words) {
		Word[] cache = words;
		int index = Utils.nextNull(words);
		if (index != -1) {
			String name = Utils.prompt("등록할 단어의 이름을 입력하세요.");
			String meaning = Utils.prompt("등록할 단어의 뜻을 입력하세요.");
			cache[index] = new Word(name, meaning);
		} else {
			System.out.println("공간이 부족합니다.");
		}
		return cache;
	}
	
	public String init() {
		String input;
		for(String function : functions) {
			System.out.println(function);
		}
		System.out.print(">>");
		input = MVC.sc.nextLine();
		return input;
	}

}
