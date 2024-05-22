package org.redstickyliquid.day2.operator;

public class Unaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단항 연산자
		// a++, ++a -> a = a + 1;
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 문제1
		// a가 10, b는 20, c는 30입니다.
		// a++;
		// b = (--a) + b;
		// c = (a++) + (--b);
		// a, b, c의 값은 얼마일까요?
		// a = 11, b = 29, c = 39
		int a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a : "+ a +", b : " + b +", c : " + c);
		
		boolean flag = true;
		flag = !!!!flag;
		System.out.println(flag);
		
		//문제2
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		// x = 99+98+98+1=296 y = 32+31+32=95 z = 99+32=131
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
}
}

