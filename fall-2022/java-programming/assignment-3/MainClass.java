package assignment3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		TeacherManager teacherMgr = new TeacherManager();
		Teacher teacher = new Teacher();
		Scanner sc = new Scanner(System.in);
		teacher = teacherMgr.createTeacher();
		System.out.println("-".repeat(60));
		System.out.print("Do you wish to display teacher schedule(Y/N): ");
		if (AppConstants.CHOICE_YES.equals(sc.nextLine())) {
			teacherMgr.displayTeacherSchedule(teacher);
		} else {
			System.out.println("Terminating.");
		}
		System.out.println("-".repeat(60));
		System.out.println("Developed By: " + AppConstants.DEVELOPER_NAME);
	}
}
