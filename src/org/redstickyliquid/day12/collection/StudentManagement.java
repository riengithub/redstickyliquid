package org.redstickyliquid.day12.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {

		ViewStudents viewStudents = new ViewStudents();
		ManageStudent manageStudent = new ManageStudent();
		end: while (true)
			switch (viewStudents.init()) {
			case "1":
				manageStudent.add(viewStudents.register());
				break;
			case "2":
				viewStudents.searchByName(manageStudent);
				break;
			case "3":
				viewStudents.displayAll(manageStudent.getStudents());
				break;
			case "4":
				viewStudents.editStudent(manageStudent);
				break;
			case "5":
				viewStudents.removeStudent(manageStudent);
				break;
			case "0":
				break end;
			default:
				System.out.println("Invalid input.");
			}
	}

}

class Util {

	public static Scanner sc = new Scanner(System.in);

	public static String prompt(String... strings) {
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.print(">>");
		String response = sc.nextLine();
		return response;
	}

}

class ViewStudents {

	private String[] functions = { "1. Register a Student", "2. Search By Name", "3. View", "4. Edit", "5. Remove",
			"0. Exit" };

	public String init() {
		return Util.prompt(functions);
	}

	public Student register() {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		String name = Util.prompt("Enter the name of the student.");
		for (int count = 0; count < 2; count++) {
			int input = Integer.parseInt(Util.prompt("Enter Score on Test " + (count + 1) + "."));
			if (input > 100 || input < 0) {
				System.out.println("The score must be between 0 and 100.");
				count--;
			} else {
				scores.add(input);
			}
		}
		System.out.println(name + " has been registered.");
		return new Student(name, scores);
	}

	public void displayAll(ArrayList<Student> students) {
		for (Student student : students) {
			String status = student.getStatus();
			System.out.printf("\t%d. %s - %s\n", students.indexOf(student) + 1, student.getName(), status);
			ArrayList<Integer> scores = student.getScores();
			int count = 1;
			for (Integer score : scores) {
				System.out.printf("\t\tScore on Test %d: %d%s\n", count++, score,
						score < 40 || (score < 60 && status == "Retake") ? " - Retake" : "");
			}

		}
	}

	public void searchByName(ManageStudent manageStudent) {
		String name = Util.prompt("Enter a name to search.");
		displayAll(manageStudent.searchByName(name));
	}

	public void editStudent(ManageStudent manageStudent) {
		displayAll(manageStudent.getStudents());
		int index = Integer.parseInt(Util.prompt("Select a student to edit.")) - 1;
		Student student = register();
		manageStudent.editStudent(index, student);
	}

	public void removeStudent(ManageStudent manageStudent) {
		displayAll(manageStudent.getStudents());
		int index = Integer.parseInt(Util.prompt("Select a student to remove.")) - 1;
		manageStudent.removeStudent(index);
		System.out.println("Student removed.");
	}

}

class ManageStudent {

	private ArrayList<Student> students;

	ManageStudent() {
		students = new ArrayList<Student>();
	}

	public ArrayList<Student> searchByName(String name) {
		ArrayList<Student> results = new ArrayList<Student>();
		for (Student student : students) {
			if (name.equals(student.getName())) {
				results.add(student);
			}
		}
		return results;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void add(Student student) {
		students.add(student);
	}

	public void editStudent(int index, Student student) {
		students.set(index, student);
	}

	public void removeStudent(int index) {
		students.remove(index);
	}

}

class Student {

	private String name;
	private String status;
	private ArrayList<Integer> scores;

	Student() {
		this("NO NAME", new ArrayList<Integer>());
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	Student(String name, ArrayList<Integer> scores) {

		this.name = name;

		this.scores = scores;

		this.status = evaluate(scores);

	}

	private String evaluate(ArrayList<Integer> scores) {
		double average = 0;
		boolean flag = false;
		for (int score : scores) {
			average += score;
			if (score < 40)
				flag = true;
		}
		average /= scores.size();
		if (average >= 60 && flag == false) {
			return "Passed";
		} else if (average < 60 && flag == false) {
			return "Retake";
		} else {
			return "Failed";
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}

}
