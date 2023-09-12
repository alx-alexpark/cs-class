package dev.parkalex;

import java.util.*;

public class CellPhone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(CellPhone.class.getResourceAsStream("cellphone.txt"));
		sc.nextLine();
		int totalMinutes = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String start = line.split(" ")[0];
			String end = line.split(" ")[1];
			int hStart = Integer.parseInt(start.split(":")[0]);
			int mStart = Integer.parseInt(start.split(":")[1]);
			int hEnd = Integer.parseInt(end.split(":")[0]);
			int mEnd = Integer.parseInt(end.split(":")[1]);
			totalMinutes += (hEnd * 60 + mEnd) - (hStart * 60 + mStart);
		}
		System.out.println(totalMinutes);
	}
}
