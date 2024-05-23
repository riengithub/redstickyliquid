package org.redstickyliquid.day4.control.loop.exercise;

import java.util.Scanner;

public class printStars22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 양의 정수나 입력하세요: ");
		int n = sc.nextInt();
		int l = 2 * (2 * n - 1);
		int x = l - 1;
		int y = l + 1;

		String[][] stars = new String[y][x];

		for(int i = 0, j = x - 1, direction = 0, margin = 0, turn = 1;
				turn <= l;
						direction = direction > 3 ? 0 : direction,
						j += direction == 0 ? -1 : direction == 2 ? 1 : 0,
						i += direction == 1 ? 1 : direction == 3 ? -1 : 0,
						margin = turn >= 4 ? (turn/4)*2 : 0) {
			
			if (direction == 0 && (j > 0 + margin)
					|| direction == 1 && (i < y - 1 - margin)
					|| direction == 2 && (j < x - 1 - margin)
					|| direction == 3 && (i > 0 + margin)
					) {
				
						stars[i][j] = "*";
//						System.out.println("coordinates: "+j+", "+i+ " "+stars[i][j]+" - Margin and direction :" +margin + ", " +  direction);
					} else {
						stars[i][j] = "*";
//						System.out.println("coordinates: "+j+", "+i+ " "+stars[i][j]+" - Margin and direction :" +margin + ", " +  direction);
//						System.out.println("turning");
						direction++; turn++;
					};
//					for (int a = 0; a < y; a++) {
//						for (int b = 0; b < x; b++) {
//								if (stars[a][b] == null) System.out.print(" "); else System.out.print(stars[a][b]);
//							}
//						System.out.println("");
//					}
		}
		
		sc.close();

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
					if (stars[i][j] == null) System.out.print(" "); else System.out.print(stars[i][j]);
				}
			System.out.println("");
		}
		
	}
}
