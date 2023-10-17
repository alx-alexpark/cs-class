package dev.parkalex;

import java.util.*;

public class MergeGradesExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(MergeGradesExercise.class.getResourceAsStream("grades.txt"));
		sc.nextLine();
		Map<String, Integer> grades = new TreeMap<String, Integer>();
		while (sc.hasNextLine()) {
			String[] fragments = sc.nextLine().split(" ");
			int value = Integer.parseInt(fragments[1]);
			if (grades.containsKey(fragments[0])) {
				grades.put(fragments[0], grades.get(fragments[0]) + value);
			} else {
				grades.put(fragments[0], value);
			}
		}
		for (String key : grades.keySet()) {
			System.out.println(key + " " + grades.get(key));
		}
 	}
}
