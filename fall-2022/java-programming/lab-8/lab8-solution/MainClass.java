package lab8;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Student[] studentList = new Student[10];
		int choice;
		StudentManager sm = new StudentManager();
		// Taking input from use to store list of all 10 students
		for (int i = 0; i < 10; i++) {
			Student s = new Student();
			s = sm.createStudent();
			studentList[i] = s;
		}

		// Displaying menu to perform operation on the basis of User Choice
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("-".repeat(25) + " Menu " + "-".repeat(25));
				System.out.println("1. Display Students List ");
				System.out.println("2. Display Average, Lowest, Highest Score in Assignment 1: ");
				System.out.println("3. Display Average, Lowest, Highest Score in Assignment 2:  ");
				System.out.println("4. Display Average, Lowest, Highest Score in Mid Term: ");
				System.out.println("5. Display Average, Lowest, Highest Score in Final Term: ");
				System.out.println("0. Exit ");
				System.out.print("Enter your choice to perform Operation: ");
				choice = sc.nextInt();
				System.out.println("-".repeat(50));
				if (choice == 1) {
					sm.printStudentList(studentList);
				} else if (choice > 1 && choice <= 5) {
					sm.printAvgHighLowMarks(studentList, choice);
				} else if (choice == 0) {
					System.out.println("Terminating.");
					System.out.println("Devloped By: Simranjot Kaur");
				} else {
					System.out.println(AppConstants.ERROR_INVALID_VALUE);
				}
			} while (choice != 0);
		}
	}
}
