package week8;

import java.util.Scanner;

public class MainClass {
	private static String choice = "Y";

	public static void main(String[] args) {
		Test test = new Test();
		Scanner sc = new Scanner(System.in);
		do {
			test = MainClass.createTest();
			MainClass.PrintTest(test);
			System.out.print("Do you wish to Continue(Y/N): ");
			choice = sc.next();
		} while ("Y".equalsIgnoreCase(choice));
		System.out.println("-".repeat(50));
		System.out.println("Submitted by: Simranjot Kaur");
	}

	public static Test createTest() {
		Test test = new Test();
		Scanner sc = new Scanner(System.in);
		while (test.getMaxScore() <= Test.MIN_SCORE) {
			System.out.print("Enter Maximum Score: ");
			test.setMaxScore(sc.nextDouble());
			sc.nextLine();
			if (test.getMaxScore() <= Test.MIN_SCORE) {
				System.out.println("Invalid Maximum Score. Kindly Re-enter the value.");
			}
		}
		while ((test.getScoreObtained() < Test.MIN_SCORE) || (test.getScoreObtained() > test.getMaxScore())) {
			System.out.print("Enter Score Obtained: ");
			test.setScoreObtained(sc.nextDouble());
			sc.nextLine();
			if ((test.getScoreObtained() < Test.MIN_SCORE) || (test.getScoreObtained() > test.getMaxScore())) {
				System.out.println("Invalid Score Entered. Kindly Re-enter the value.");
			}
		}
		return test;
	}

	public static void PrintTest(Test test) {
		double percentage = test.getPercentage(test.getScoreObtained());
		String grade = test.getLetterGrade(percentage);
		System.out.println("-".repeat(50));
		System.out.println(test.toString());
		System.out.printf("Percentage: %.2f\n",  percentage);
		System.out.println("Letter Grade: " + grade);
	}

}
