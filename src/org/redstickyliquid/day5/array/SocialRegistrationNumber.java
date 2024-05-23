package org.redstickyliquid.day5.array;

import java.util.Scanner;

public class SocialRegistrationNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("주번입력ㄱㄱ");
		String socialRegNum = sc.next();
		char[] arr = new char[socialRegNum.length()];
		for(int i = 0; i < socialRegNum.length(); i++) arr[i] = socialRegNum.charAt(i);
		char[] copy = new char[arr.length];
		for(int i = 0; i < copy.length; i++) {
			if (i < 8) copy[i] = arr[i];
			else copy[i] = '*';
			System.out.print(copy[i]);
			}
		sc.close();
	}

}
