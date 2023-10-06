package dev.parkalex;

import java.util.*;

public class StudentList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(StudentList.class.getResourceAsStream("students.txt"));
		Set<String> classes = new TreeSet<String>();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.split(" ").length == 2) {
				classes.add(line.split(" ")[0]);
			}
		}
		System.out.println(classes);
	}

}
