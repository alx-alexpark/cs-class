package dev.parkalex;

import java.util.*;

public class Swimming {
	public static void main(String[] args) {
		Scanner sc = new Scanner(Swimming.class.getResourceAsStream("swimming.txt"));
		Map<String, Set<String>> classes = new HashMap<String, Set<String>>();
		sc.nextLine();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String inst = line.split(" ")[0];
			String student = line.split(" ")[1];
			if (!classes.containsKey(inst)) {
				classes.put(inst, new TreeSet<String>());
			} 
			classes.get(inst).add(student);
		}
		for (String key: classes.keySet()) {
			System.out.println(key);
			for (String student : classes.get(key)) {
				System.out.println("\t" + student);
			}
			
			
		}
	}
}
