package org.redstickyliquid.day8.MVC;

public class Utils {
	static String prompt(String prompt) {
		System.out.println(prompt);
		System.out.print(" >> ");
		String input = MVC.sc.nextLine();
		return input;
	}
}
