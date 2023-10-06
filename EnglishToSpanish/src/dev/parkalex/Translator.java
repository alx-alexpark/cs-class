package dev.parkalex;

import java.util.*;


public class Translator {
	public static void main(String[] sus) {
		Scanner sc = new Scanner(Translator.class.getResourceAsStream("map.txt"));
		Map<String, String> dict = new HashMap<String, String>();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] fragments = line.split(" ");
			if (fragments.length == 2) {
				dict.put(fragments[0], fragments[1]);
			} else {
				for (String a : fragments) {
					System.out.print(dict.get(a) + " ");
				}
				System.out.println();
			}
		}
	}
	
}
