package assignment3;

/*
 * This class is entity class to declare all data members and methods associated with Course
 */
public class Course {
	private String courseCode;
	private String courseName;
	private String courseDay;
	private String courseTime;
	private String courseRoomNum;
	private int courseCRN;

	Course() {
		this.courseCode = AppConstants.EMPTY_STRING;
		this.courseName = AppConstants.EMPTY_STRING;
		this.courseDay = AppConstants.EMPTY_STRING;
		this.courseTime = AppConstants.EMPTY_STRING;
		this.courseRoomNum = AppConstants.EMPTY_STRING;
		this.courseCRN = 0;
	}

	Course(String courseCode, String courseName, String courseDay, String courseTime, String courseRoomNum,
			int courseCRN) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseDay = courseDay;
		this.courseTime = courseTime;
		this.courseRoomNum = courseRoomNum;
		this.courseCRN = courseCRN;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDay() {
		return courseDay;
	}

	public void setCourseDay(String courseDay) {
		this.courseDay = courseDay;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public String getCourseRoomNum() {
		return courseRoomNum;
	}

	public void setCourseRoomNum(String courseRoomNum) {
		this.courseRoomNum = courseRoomNum;
	}

	public int getCourseCRN() {
		return courseCRN;
	}

	public void setCourseCRN(int courseCRN) {
		this.courseCRN = courseCRN;
	}

	public boolean equals(Course tempCourse) {
		if (this.getCourseCRN() == tempCourse.getCourseCRN()) {
			return true;
		} else
			return false;
	}

	public String toString() {
		return "-".repeat(60) + "\nCourse Code: " + this.courseCode + "\nCourse Name: " + this.courseName
				+ "\nCourse Room Number: " + this.courseRoomNum + "\nCourse CRN: " + this.courseCRN + "\nCourse Day: "
				+ this.courseDay + "\nCourse Time: " + this.courseTime;
	}
}
