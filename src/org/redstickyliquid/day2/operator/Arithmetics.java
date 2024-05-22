package org.redstickyliquid.day2.operator;

import java.util.Scanner;

public class Arithmetics {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int seconds = 60;
		int minutes = 60;
		System.out.print("Enter seconds: ");
		int secondsIn = sc.nextInt();
		sc.close();
		int hoursOut = secondsIn /  (seconds * minutes) ;
		int minutesOut = secondsIn / seconds % minutes ;
		int secondsOut = secondsIn % seconds ;
		System.out.println(hoursOut + " hours, " + minutesOut + " minutes, " + secondsOut + " seconds.");
		}
}
