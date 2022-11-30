package week3;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// declaring variables
		final int MAX_SCORE_ASSIGN = 20;
		final int MAX_SCORE_LAB = 10;
		final int MAX_SCORE_EXAM = 100;
		float assign1_score = 0;
		float assign2_score = 0;
		float lab1_score = 0;
		float lab2_score = 0;
		float lab3_score = 0;
		float midterm_exam_score = 0;
		float final_exam_score = 0;
		double total_perc_assign;
		double total_perc_lab = 0;
		double total_perc_exam = 0;
		double overall_perc = 0;
		String name_of_student = "";

		try (Scanner kbd = new Scanner(System.in)) {
			// taking Input
			System.out.print("Enter the name of Student : ");
			name_of_student = kbd.nextLine();

			System.out.print("Enter score in Assignment 1 : ");
			assign1_score = kbd.nextInt();

			System.out.print("Enter score in Assignment 2 : ");
			assign2_score = kbd.nextInt();

			System.out.print("Enter score in Lab 1 : ");
			lab1_score = kbd.nextInt();

			System.out.print("Enter score in Lab 2 : ");
			lab2_score = kbd.nextInt();

			System.out.print("Enter score in Lab 3 : ");
			lab3_score = kbd.nextInt();

			System.out.print("Enter score in Mid-Term Exam : ");
			midterm_exam_score = kbd.nextInt();

			System.out.print("Enter score in Final Exam : ");
			final_exam_score = kbd.nextInt();

		}

		// computing assignment percentage
		total_perc_assign = ((assign1_score + assign2_score) / (2 * MAX_SCORE_ASSIGN)) * 100;

		// computing lab percentage
		total_perc_lab = ((lab1_score + lab2_score + lab3_score) / (3 * MAX_SCORE_LAB)) * 100;

		// computing exam percentage
		total_perc_exam = ((midterm_exam_score + final_exam_score) / (2 * MAX_SCORE_EXAM)) * 100;

		// computing overall percentage
		overall_perc = (total_perc_assign + total_perc_exam + total_perc_lab) / 3;

		// displaying Output
		System.out.println("------------------ OUTPUT ---------------------");
		System.out.println("Name of Student: " + name_of_student);
		System.out.println("Course: Java Programming 1");
		System.out.printf("Percentage in Assignments: %.2f%%\n", total_perc_assign);
		System.out.printf("Percentage in Labs: %.2f%%\n", total_perc_lab);
		System.out.printf("Percentage in Exams: %.2f%%\n", total_perc_exam);
		System.out.printf("Overall Percentage: %.2f%%\n", overall_perc);
		System.out.println("------------------------------------------------");
		System.out.println("Developed and Created by: Simranjot Kaur");

	}

}
