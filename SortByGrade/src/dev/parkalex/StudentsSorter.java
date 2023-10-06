package dev.parkalex;
import java.util.*;

public class StudentsSorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(StudentsSorter.class.getResourceAsStream("grades.txt"));
		int num = sc.nextInt();
		sc.nextLine();
		Student[] students = new Student[num];
		for(int i = 0;i<num;i++) {
			String[] parts = sc.nextLine().split(" ");
			students[i] = new Student(parts[0] + " " + parts[1], Integer.parseInt(parts[2]));
		}
		Arrays.sort(students);
		for (Student s: students) {
			System.out.println(s);
		}
	}
}
