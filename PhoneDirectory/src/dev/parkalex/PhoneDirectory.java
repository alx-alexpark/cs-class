package dev.parkalex;
import java.util.*;

public class PhoneDirectory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(PhoneDirectory.class.getResourceAsStream("dir.txt"));
		Scanner stdin = new Scanner(System.in);
		sc.nextLine();
		Map<String, String> pb = new TreeMap<String, String>();
		while (sc.hasNextLine()) {
			String[] fragments = sc.nextLine().split(" ");
			pb.put(fragments[0] + " " + fragments[1], fragments[2]);
		}
		System.out.println(
				"""
					1. Look up a phone number
					2. Add a member along with a phone number
					3. Change a phone number of a certain existing member
					4. Display all the members and their phone numbers
					5. Display the members from a certain area code and their phone numbers
					6. Remove a member from the phone directory
					7. Sort by last name
					8. Exit the program	
			    """
		);
		while (true) {
			System.out.print("\u001B[36mEnter command>\u001B[0m ");
			int choice = Integer.parseInt(stdin.nextLine());
			switch (choice) {
				case 1:
					System.out.print("1: Enter name> ");
					String name = stdin.nextLine();
					if (pb.get(name) == null) {
						System.out.println(name + " is not in the directory!");
						break;
					}
					System.out.println("The phone number of " + name + " is " + pb.get(name));
					break;
				case 2:
					System.out.print("2: Enter name and phone number seperated by a \":\"> ");
					String fragments[] = stdin.nextLine().split(":");
					if (pb.containsKey(fragments[0])) {
						System.out.println("Already exists");
						break;
					}
					pb.put(fragments[0], fragments[1]);
					System.out.println("Member added");
					break;
				case 3:
					System.out.print("3: Enter name and phone number seperated by a \":\"> ");
					String fragments2[] = stdin.nextLine().split(":");
					pb.put(fragments2[0], fragments2[1]);
					break;
				case 4:
					for (String key : pb.keySet()) {
						System.out.printf("%-30s %s\n", key, pb.get(key));
					}
					break;
				case 5:
					System.out.print("5: Enter area code> ");
					String code = stdin.nextLine();
					if (code.length() != 3) {
						System.out.println("Invalid area code");
						break;
					}
					for (String key : pb.keySet()) {
						if (pb.get(key).startsWith(code)) {
							System.out.printf("%-30s %s\n", key, pb.get(key));
						}
					}
					break;
				case 6:
					System.out.print("Enter name> ");
					String name6 = stdin.nextLine();
					pb.remove(name6);
					break;
				case 7:
					Map<String, String> sortedPb = new TreeMap<String, String>();
					for (String key : pb.keySet()) {
						sortedPb.put(key.split(" ")[1], pb.get(key));
					}
					for (String key : sortedPb.keySet()) {
						for (String key2 : pb.keySet()) {
							if (sortedPb.get(key) == pb.get(key2)) {
								System.out.printf("%-30s %s\n", key2, pb.get(key2));
							}
						}
					}
					break;
				case 8:
					System.exit(0);
			}
		}
	}

}
