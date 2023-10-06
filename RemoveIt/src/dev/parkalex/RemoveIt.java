package dev.parkalex;

import java.util.*;

public class RemoveIt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(RemoveIt.class.getResourceAsStream("words.txt");
		sc.nextLine();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			char[] chars = line.split(" ")[0].toCharArray();
			Iterator<Character> i = Arrays.asList(chars).iterator();
			char remove = line.split(" ")[1].toCharArray()[0];
			while (i.hasNext()) {
				if (i.next() == remove) {
					i.remove();
				}
			}
			System.out.println(i);
		}
	}
}
