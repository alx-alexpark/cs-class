package dev.parkalex;

public class Student {
	private String name;
	private double finalGrade;
	private int absenses;
	
	public Student(String n, double f, int a) {
		name = n;
		finalGrade = f;
		absenses = a;
	}
	
	public double getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}
	public int getAbsenses() {
		return absenses;
	}
	public void setAbsenses(int absenses) {
		this.absenses = absenses;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return String.format("%s - Final Grade: %f - Absenses: %d", name, finalGrade, absenses);
	}
	
	
}
