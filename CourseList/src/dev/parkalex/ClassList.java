package dev.parkalex;

import java.util.*;

public class ClassList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(ClassList.class.getResourceAsStream("classes.txt"));
		Set<String> classes = new HashSet<String>();
		while (sc.hasNextLine()) {
			classes.add(sc.nextLine().split(" ")[1]);
		}
		System.out.println(classes);
	}

}
