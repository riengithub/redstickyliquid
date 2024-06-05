package org.redstickyliquid.day8.MVC;

public class Word {
	String name;
	String meaning;
	Word(String name, String meaning) {
		this.name = name;
		this.meaning = meaning;
	}
	
	public String toString() {
		return name + " : " + meaning;
		
	}
}
