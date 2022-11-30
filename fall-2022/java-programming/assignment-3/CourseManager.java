package assignment3;

/*
 * This class is to declare and define all the operations to perform calculations on courses
 */
public class CourseManager {
	private Course defaultCourse1;
	private Course defaultCourse2;
	private Course defaultCourse3;
	private Course defaultCourse4;
	private Course defaultCourse5;
	private Course defaultCourse6;
	private Course defaultCourse7;
	private Course defaultCourse8;
	private Course defaultCourse9;
	private Course defaultCourse10;

	public CourseManager() {
		defaultCourse1 = new Course("IT-101", "Java Programming", "Tuesday", "8:00AM - 10:40AM", "RN-601", 101);
		defaultCourse2 = new Course("IT-102", "JavaScript Programming", "Tuesday", "11:00AM - 1:40PM", "RN-602", 102);
		defaultCourse3 = new Course("IT-103", "Web Development", "Wednesday", "8:00AM - 10:40AM", "RN-603", 103);
		defaultCourse4 = new Course("IT-104", "Oracle Administrator", "Monday", "8:00AM - 10:40AM", "RN-604", 104);
		defaultCourse5 = new Course("IT-105", "Oracle PL/SQL", "Monday", "8:00AM - 10:40AM", "RN-605", 105);
		defaultCourse6 = new Course("IT-106", "Human Resource Management", "Monday", "11:00AM - 1:40PM", "RN-606", 106);
		defaultCourse7 = new Course("IT-107", "IT Projct Management", "Thursday", "8:00AM - 10:40AM", "RN-607", 107);
		defaultCourse8 = new Course("IT-108", "Android Development", "Thursday", "11:00AM - 1:40PM", "RN-608", 108);
		defaultCourse9 = new Course("IT-110", "Machine Learning", "Friday", "8:00AM - 10:40AM", "RN-610", 109);
		defaultCourse10 = new Course("IT-111", "Machine Learning", "Friday", "11:00AM - 1:40PM", "RN-610", 109);
	}

	/*
	 * This method will validate if the Course code entered by user if one of the default values
	 */
	public boolean validateCourse(String courseCode) {
		CourseManager cm = new CourseManager();
		if (courseCode.equalsIgnoreCase(cm.defaultCourse1.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse2.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse3.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse4.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse5.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse6.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse7.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse8.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse9.getCourseCode())) {
			return true;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse10.getCourseCode())) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * This method will return course details on the basis of course code
	 */
	public Course getCourse(String courseCode) {
		CourseManager cm = new CourseManager();
		if (courseCode.equalsIgnoreCase(cm.defaultCourse1.getCourseCode())) {
			return defaultCourse1;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse2.getCourseCode())) {
			return defaultCourse2;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse3.getCourseCode())) {
			return defaultCourse3;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse4.getCourseCode())) {
			return defaultCourse4;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse5.getCourseCode())) {
			return defaultCourse5;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse6.getCourseCode())) {
			return defaultCourse6;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse7.getCourseCode())) {
			return defaultCourse7;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse8.getCourseCode())) {
			return defaultCourse8;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse9.getCourseCode())) {
			return defaultCourse9;
		} else if (courseCode.equalsIgnoreCase(cm.defaultCourse10.getCourseCode())) {
			return defaultCourse10;
		} else {
			return new Course();
		}
	}

	/*
	 * This method will check if already course with same CRN is added to teacher schedule
	 */
	public boolean checkCourseEqual(Teacher t, String tempCourseCode) {
		Course tempCourse = getCourse(tempCourseCode);
		if (t.getCourse1().getCourseCode() != "" && t.getCourse1().equals(tempCourse))
			return true;
		else if ((t.getCourse2().getCourseCode() != "" && t.getCourse2().equals(tempCourse)))
			return true;
		else if ((t.getCourse3().getCourseCode() != "" && t.getCourse3().equals(tempCourse)))
			return true;
		else if ((t.getCourse4().getCourseCode() != "" && t.getCourse4().equals(tempCourse)))
			return true;
		else
			return false;
	}
}
