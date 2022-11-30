package assignment3;

import java.util.Scanner;

/*
 * This class is to manage all operations associated with Teacher entity class
 */
public class TeacherManager {
	CourseManager cm = new CourseManager();

	public Teacher createTeacher() {
		Teacher teacher = new Teacher();
		Scanner sc = new Scanner(System.in);
		String tempCourseCode;

		// Taking teacher details as input
		System.out.print("Enter Name of the Teacher: ");
		teacher.setName(sc.nextLine());
		System.out.print("Enter Id of the Teacher: ");
		teacher.setId(sc.nextLine());

		// Taking Input First Course Details
		while ((teacher.getCourse1().getCourseCode() == null) || (teacher.getCourse1().getCourseCode().isEmpty())
				|| (teacher.getCourse1().getCourseCode().isBlank())) {
			System.out.print("Enter First Course Code To Schedule: ");
			tempCourseCode = sc.nextLine();
			if (cm.validateCourse(tempCourseCode)) {
				teacher.setCourse1(cm.getCourse(tempCourseCode));
			} else {
				System.out.println(AppConstants.ERROR_INVALID_COURSE_CODE);
			}
		}

		// Taking input second Course Details
		while ((teacher.getCourse2().getCourseCode() == null) || (teacher.getCourse2().getCourseCode().isEmpty())
				|| (teacher.getCourse2().getCourseCode().isBlank())) {
			System.out.print("Enter Second Course Code To Schedule: ");
			tempCourseCode = sc.nextLine();
			if (cm.validateCourse(tempCourseCode)) {
				// Checking if any course with same CRN has been already scheduled
				if (!cm.checkCourseEqual(teacher, tempCourseCode)) {
					teacher.setCourse2(cm.getCourse(tempCourseCode));
				} else {
					System.out.println(AppConstants.ERROR_SAME_COURSE_CRN_SCHEDULED);
				}
			} else {
				System.out.println(AppConstants.ERROR_INVALID_COURSE_CODE);
			}
		}

		// Taking input third course details
		while ((teacher.getCourse3().getCourseCode() == null) || (teacher.getCourse3().getCourseCode().isEmpty())
				|| (teacher.getCourse3().getCourseCode().isBlank())) {
			System.out.print("Enter Third Course Code To Schedule: ");
			tempCourseCode = sc.nextLine();
			if (cm.validateCourse(tempCourseCode)) {
				if (!cm.checkCourseEqual(teacher, tempCourseCode)) {
					teacher.setCourse3(cm.getCourse(tempCourseCode));
				} else {
					System.out.println(AppConstants.ERROR_SAME_COURSE_CRN_SCHEDULED);
				}
			} else {
				System.out.println(AppConstants.ERROR_INVALID_COURSE_CODE);
			}
		}

		// Taking input fourth course details
		while ((teacher.getCourse4().getCourseCode() == null) || (teacher.getCourse4().getCourseCode().isEmpty())
				|| (teacher.getCourse4().getCourseCode().isBlank())) {
			System.out.print("Enter Fourth Course Code To Schedule: ");
			tempCourseCode = sc.nextLine();
			if (cm.validateCourse(tempCourseCode)) {
				if (!cm.checkCourseEqual(teacher, tempCourseCode)) {
					teacher.setCourse4(cm.getCourse(tempCourseCode));
				} else {
					System.out.println(AppConstants.ERROR_SAME_COURSE_CRN_SCHEDULED);
				}
			} else {
				System.out.println(AppConstants.ERROR_INVALID_COURSE_CODE);
			}
		}

		// taking input fifth course details
		while ((teacher.getCourse5().getCourseCode() == null) || (teacher.getCourse5().getCourseCode().isEmpty())
				|| (teacher.getCourse5().getCourseCode().isBlank())) {
			System.out.print("Enter Fifth Course Code To Schedule: ");
			tempCourseCode = sc.nextLine();
			if (cm.validateCourse(tempCourseCode)) {
				if (!cm.checkCourseEqual(teacher, tempCourseCode)) {
					teacher.setCourse5(cm.getCourse(tempCourseCode));
				} else {
					System.out.println(AppConstants.ERROR_SAME_COURSE_CRN_SCHEDULED);
				}
			} else {
				System.out.println(AppConstants.ERROR_INVALID_COURSE_CODE);
			}
		}

		return teacher;
	}

	/*
	 * This method will display the teacher schedule 	
	 */
	public void displayTeacherSchedule(Teacher teacher) {
		System.out.println("-".repeat(25) + "TIME TABLE" + "-".repeat(25));
		System.out.println("Teacher Name: " + teacher.getName());
		System.out.println("Teacher Id: " + teacher.getId());
		System.out.println(teacher.getCourse1().toString());
		System.out.println(teacher.getCourse2().toString());
		System.out.println(teacher.getCourse3().toString());
		System.out.println(teacher.getCourse4().toString());
		System.out.println(teacher.getCourse5().toString());
	}

}
