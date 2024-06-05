package org.redstickyliquid.day8.MVC;

public class Words {
	private Word[] words;
	Words(Word[] words){
		this.words = words;
	}
	
	public Word[] getWords () {
		return words;
	}
	
	public void setWords (Word[] words) {
		this.words = words;
	}
	
}
