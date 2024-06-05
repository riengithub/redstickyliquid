package org.redstickyliquid.day7.class_exercises;

public class Classes {

}

class Milk {
	private double height = 0.6;
	private double weight = 0.4;

	void feed(Teacher teacher) {
		teacher.update(weight, height);
		System.out.printf("%s 선생님이 우유를 마셨습니다.\n", teacher.getName());
	}
}

class Meat {
	private double height = 0.2;
	private double weight = 0.8;

	void feed(Teacher teacher) {
		teacher.update(weight, height);
		System.out.printf("%s 선생님이 고기를 먹었습니다.\n", teacher.getName());
	}
}

class Exercise {
	private double height = -0.05;
	private double weight = -0.45;

	void apply(Teacher teacher) {

		System.out.printf("%s 선생님이 열심히 운동을 했습니다.\n", teacher.getName());
		teacher.update(weight, height);
	}
}

class Teacher {

	private String name;
	private double weight;
	private double height;
	private double power;
	private double charm;
	private int confidence;

	public Teacher(String name) {
		this.name = name;
		this.weight = 65;
		this.height = 175;
	}

	void setName(String name) {
		this.name = name;
		System.out.printf("%s 선생님이 등록됐습니다.\n");
	}
//
	void update(double weight, double height) {
		this.addHeight(height);
		this.addWeight(weight);
		this.updatePower();
		this.updateCharm();
	}
//
	void addWeight(double weight) {
		this.weight += weight;
		System.out.printf("선생님의 몸무게가 %.1lfKG만큼 %s.\n", weight, weight < 0 ? "감소했습니다" : "증가했습니다");
	}

	void addHeight(double height) {
		this.height += height;
		System.out.printf("선생님의 신장이 %.1lfCM만큼 %s.\n", height, height < 0 ? "감소했습니다" : "증가했습니다");
	}

	void updatePower() {
		double previous = this.power;
		this.power = this.height * this.weight * 0.05;
		double change = this.power - previous;
		System.out.printf("선생님의 전투력이 %.1lf만큼 %s %.1lf으로 바뀌었습니다.\n", change, change < 0 ? "감소해서" : "상승해서", this.power);
	}

	void updateCharm() {
		double previous = this.charm;
		this.charm = this.height / this.weight * 0.05;
		double change = this.charm - previous;
		System.out.printf("선생님의 매력이 %.1lf만큼 %s %.1lf으로 바뀌었습니다.\n", change, change < 0 ? "감소해서" : "상승해서", this.charm);
	}
	void changeConfidence(int confidence) {
		double previous = this.confidence;
		this.confidence += confidence;
		double change = this.confidence - previous;
		System.out.printf("선생님의 자신감이 %.1lf만큼 %s %.1lf으로 바뀌었습니다.\n", change, change < 0 ? "감소해서" : "상승해서",
				this.confidence);
	}
	String getName() {
		return this.name;
	}

	double getWeight() {
		return this.weight;
	}

	double getHeight() {
		return this.height;
	}

	double getPower() {
		return this.power;
	}

	double getCharm() {
		return this.charm;
	}

	double getConfidence() {
		return this.confidence;
	}
}