package org.redstickyliquid.day10.abstractinterface;

public class CalculatorStudy {

	public static void main(String[] args) {
	
		TexasInstrument calculator = new TexasInstrument();

		System.out.println(calculator.add(1,2,3));
		System.out.println(calculator.subtract(1,2,3));
		System.out.println(calculator.average(1,2,3));
	}
}

abstract class Calculator {

	abstract double add(double... ns);

	abstract double subtract(double... ns);

	abstract double average(double... ns);

}

class TexasInstrument extends Calculator {

	double add(double... ns) {
		double sum = 0;
		for (double n : ns) {
			sum += n;
		}
		return sum;
	}

	double subtract(double... ns) {
		double sum = 0;
		for (Number n : ns) {
			sum -= n.doubleValue();
		}
		return sum;
	}

	double average(double... ns) {
		double sum = add(ns);
		double avg = sum / ns.length;
		return avg;
	}
}
