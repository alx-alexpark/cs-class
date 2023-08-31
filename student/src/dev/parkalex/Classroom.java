package dev.parkalex;

public class Classroom {
	public static void main(String[] args) {
		Student[] students = new Student[6];
		students[0] = new Student("Steve Robinson", 96, 1);
		students[1] = new Student("Maria Debala", 84, 0);
		students[2] = new Student("Bill Shroeder", 72, 4);
		students[3] = new Student("David Belarus", 69, 2);
		students[4] = new Student("Andrew Monroe", 100, 3);
		students[5] = new Student("Jacob Villareal", 62, 4);

		System.out.println(numPassing(students));
		System.out.println(personWithHighestGrade(students));
		System.out.println(numStudentsWithTooManyAbsenses(students, 3));
		System.out.println(getFirstNameByLastName(students, "Debala"));
		bumpScoresUp(students);
		System.out.println(students[3].getFinalGrade());
		System.out.println(numHowManyCanExempt(students));
		deleteStudentsWithTooManyAbsenses(students, 2);
		for (Student s : students) {
			if (s == null) {
				System.out.println("NULL");
				continue;
			}
			System.out.println(s.toString());
		}
		System.out.println(getStudentByName(students, "David Belarus"));

	}

	public static int numPassing(Student[] students) {
		int counter = 0;
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.getFinalGrade() >= 70) {
				counter++;
			}
		}
		return counter;
	}

	public static String personWithHighestGrade(Student[] students) {
		Student highest = students[0];
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.getFinalGrade() > highest.getFinalGrade()) {
				highest = s;
			}
		}
		return highest.getName();
	}

	public static int numStudentsWithTooManyAbsenses(Student[] students, int limit) {
		int counter = 0;
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.getAbsenses() > limit) {
				counter++;
			}
		}
		return counter;
	}

	public static String getFirstNameByLastName(Student[] students, String lastName) {
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.getName().split(" ")[1].equals(lastName)) {
				return s.getName().split(" ")[0];
			}
		}
		return "No match";
	}

	public static void bumpScoresUp(Student[] students) {
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.getFinalGrade() == 69) {
				s.setFinalGrade(70);
			}
		}
	}

	public static int numHowManyCanExempt(Student[] students) {
		int counter = 0;
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.getFinalGrade() >= 86 && s.getAbsenses() < 3) {
				counter++;
				System.out.println(s.getName() + " can exempt the final exam.");
			}
		}
		return counter;
	}

	public static void deleteStudentsWithTooManyAbsenses(Student[] students, int limit) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null)
				continue;
			if (students[i].getAbsenses() > limit) {
				students[i] = null;
			}
		}
	}

	public static Student getStudentByName(Student[] students, String name) {
		for (Student s : students) {
			if (s == null)
				continue;
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}
}
