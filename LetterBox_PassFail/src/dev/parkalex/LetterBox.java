package dev.parkalex;

import java.util.Scanner;

public class LetterBox {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(LetterBox.class.getResourceAsStream("letterbox.txt"));
		sc.nextLine();
		while (sc.hasNextLine()){
			String[] fragments = sc.nextLine().split(" ");

			if (fragments.length < 2) {
				continue;
			}
			
			int num = Integer.parseInt(fragments[1]);
			
		    for (int z=0;z<num;z++) {
		    	String line = "";
		    	for (int y=0;y<num;y++) {
			    	line += fragments[0];
			    }
		    	System.out.println(line);
		    }
		    System.out.println();
		    
		}
	}
}
