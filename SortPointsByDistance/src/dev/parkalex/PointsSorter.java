package dev.parkalex;

import java.util.Arrays;
import java.util.Scanner;

public class PointsSorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(PointsSorter.class.getResourceAsStream("points.txt"));
		int num = sc.nextInt();
		sc.nextLine();
		Point[] points = new Point[num];
		for(int i = 0;i<num;i++) {
			String[] line = sc.nextLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			points[i] = new Point(x, y);
		}
		
		System.out.println("Unsorted:");
		System.out.print("[");
		for (Point p : points) {
			System.out.print(p + ",");
		}
		System.out.println("]");
		Arrays.sort(points);
		System.out.println("Sorted:");
		System.out.print("[");
		for (Point p : points) {
			System.out.print(p + ",");
		}
		System.out.println("]");
		
		
		
	}
}
