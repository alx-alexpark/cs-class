package dev.parkalex;

public class Student implements Comparable<Student> {
	private int grade;
	private String name;
	public Student(String name, int grade) {
		this.grade = grade;
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Student other) {
		return this.grade > other.getGrade() ? -1 : 1;
	}
	public String toString() {
		return name + " " + grade;
	}
}
