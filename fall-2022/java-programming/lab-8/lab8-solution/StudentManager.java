package lab8;

import java.util.Scanner;

public class StudentManager {
	/*
	 * This method is to create a Student
	 * 
	 * @return Student
	 */
	public Student createStudent() {
		Scanner sc = new Scanner(System.in);
			Student s = new Student();
			System.out.print("Enter Student Name: ");
			s.setStudentName(sc.nextLine());
			while ((s.getAssignment1Score() < AppConstants.MIN_MARKS_ASSIGNMENT_1_2)
					|| (s.getAssignment1Score() > AppConstants.MAX_MARKS_ASSIGNMENT_1_2)) {
				System.out.print("Enter Marks in Assignment 1: ");
				s.setAssignment1Score(sc.nextDouble());
				sc.nextLine();
				if ((s.getAssignment1Score() < AppConstants.MIN_MARKS_ASSIGNMENT_1_2)
						|| (s.getAssignment1Score() > AppConstants.MAX_MARKS_ASSIGNMENT_1_2)) {
					System.out.println(AppConstants.ERROR_INVALID_VALUE);
				}
			}

			while ((s.getAssignment2Score() < AppConstants.MIN_MARKS_ASSIGNMENT_1_2)
					|| (s.getAssignment2Score() > AppConstants.MAX_MARKS_ASSIGNMENT_1_2)) {
				System.out.print("Enter Marks in Assignment 2: ");
				s.setAssignment2Score(sc.nextDouble());
				sc.nextLine();
				if ((s.getAssignment2Score() < AppConstants.MIN_MARKS_ASSIGNMENT_1_2)
						|| (s.getAssignment2Score() > AppConstants.MAX_MARKS_ASSIGNMENT_1_2)) {
					System.out.println(AppConstants.ERROR_INVALID_VALUE);
				}
			}

			while ((s.getMidTermScore() < AppConstants.MIN_MARKS_MIDTERM_FINAL)
					|| (s.getMidTermScore() > AppConstants.MAX_MARKS_MIDTERM_FINAL)) {
				System.out.print("Enter Marks in Mid Term Exam: ");
				s.setMidTermScore(sc.nextDouble());
				sc.nextLine();
				if ((s.getMidTermScore() < AppConstants.MIN_MARKS_MIDTERM_FINAL)
						|| (s.getMidTermScore() > AppConstants.MAX_MARKS_MIDTERM_FINAL)) {
					System.out.println(AppConstants.ERROR_INVALID_VALUE);
				}
			}

			while ((s.getFinalExamScore() < AppConstants.MIN_MARKS_MIDTERM_FINAL)
					|| (s.getFinalExamScore() > AppConstants.MAX_MARKS_MIDTERM_FINAL)) {
				System.out.print("Enter Marks in Final Exam: ");
				s.setFinalExamScore(sc.nextDouble());
				sc.nextLine();
				if ((s.getFinalExamScore() < AppConstants.MIN_MARKS_MIDTERM_FINAL)
						|| (s.getFinalExamScore() > AppConstants.MAX_MARKS_MIDTERM_FINAL)) {
					System.out.println(AppConstants.ERROR_INVALID_VALUE);
				}
			}
			return s;	
	}

	/*
	 * This method is to print the list of Students
	 * 
	 * @param studentList
	 */
	public void printStudentList(Student[] studentList) {
		System.out.println("Student List:");
		System.out.println("-".repeat(55));
		for (int i = 0; i < 10; i++) {
			System.out.println("Student Name: " + studentList[i].getStudentName());
			System.out.println("Marks in Assignment 1: " + studentList[i].getAssignment1Score());
			System.out.println("Marks in Assignment 2: " + studentList[i].getAssignment2Score());
			System.out.println("Marks in Mid Term Exam: " + studentList[i].getMidTermScore());
			System.out.println("Marks in Final Exam: " + studentList[i].getFinalExamScore());
			System.out.println("-".repeat(55));
		}
	}

	/*
	 * This method is to calculate and print average marks, highest and lowest marks
	 * of each category
	 */
	public void printAvgHighLowMarks(Student[] studentList, int choice) {
		double averageScore;
		double highestScore;
		double lowestScore;
		double[] marksList = new double[10];
		switch (choice) {
		case 2: {
			for (int i = 0; i < 10; i++) {
				marksList[i] = studentList[i].getAssignment1Score();
			}
			averageScore = calcAverage(marksList);
			lowestScore = findLowest(marksList);
			highestScore = findHighest(marksList);
			System.out.println("Average Score in Assignment 1: " + averageScore);
			System.out.println("Highest Score in Assignment 1: " + highestScore);
			System.out.println("Lowest Score in Assignment 1: " + lowestScore);
			break;
		}
		case 3: {
			for (int i = 0; i < 10; i++) {
				marksList[i] = studentList[i].getAssignment2Score();
			}
			averageScore = calcAverage(marksList);
			lowestScore = findLowest(marksList);
			highestScore = findHighest(marksList);
			System.out.println("Average Score in Assignment 2: " + averageScore);
			System.out.println("Highest Score in Assignment 2: " + highestScore);
			System.out.println("Lowest Score in Assignment 2: " + lowestScore);
			break;
		}
		case 4: {
			for (int i = 0; i < 10; i++) {
				marksList[i] = studentList[i].getMidTermScore();
			}
			averageScore = calcAverage(marksList);
			lowestScore = findLowest(marksList);
			highestScore = findHighest(marksList);
			System.out.println("Average Score in Mid Term Score: " + averageScore);
			System.out.println("Highest Score in Mid Term Score: " + highestScore);
			System.out.println("Lowest Score in Mid Term Score: " + lowestScore);
			break;
		}
		case 5: {
			for (int i = 0; i < 10; i++) {
				marksList[i] = studentList[i].getFinalExamScore();
			}
			averageScore = calcAverage(marksList);
			lowestScore = findLowest(marksList);
			highestScore = findHighest(marksList);
			System.out.println("Average Score in Final Exam Score: " + averageScore);
			System.out.println("Highest Score in Final Exam Score: " + highestScore);
			System.out.println("Lowest Score in Final Exam Score: " + lowestScore);
			break;
		}
		}
	}

	/*
	 * This method is to calculate average score of all students
	 */
	private double calcAverage(double[] marksList) {
		double sum = 0.0;
		for (int i = 0; i < 10; i++) {
			sum += marksList[i];
		}
		return sum / 10;
	}

	/*
	 * This method is to calculate the highest score
	 */
	private double findLowest(double[] marksList) {
		double lowest = marksList[0];
		for (int i = 1; i < 10; i++) {
			if (marksList[i] < lowest) {
				lowest = marksList[i];
			}
		}
		return lowest;
	}

	/*
	 * This method is to calculate the lowest score
	 */
	private double findHighest(double[] marksList) {
		double highest = marksList[0];
		for (int i = 1; i < 10; i++) {
			if (marksList[i] > highest) {
				highest = marksList[i];
			}
		}
		return highest;
	}

}
