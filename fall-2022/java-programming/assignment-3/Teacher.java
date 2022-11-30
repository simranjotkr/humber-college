package assignment3;

/*
 * This is entity class for teacher object
 */
public class Teacher {
	private String id;
	private String name;
	private Course course1;
	private Course course2;
	private Course course3;
	private Course course4;
	private Course course5;

	public Teacher() {
		this.id = "";
		this.name = "";
		this.course1 = new Course();
		this.course2 = new Course();
		this.course3 = new Course();
		this.course4 = new Course();
		this.course5 = new Course();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse1() {
		return course1;
	}

	public void setCourse1(Course course1) {
		this.course1 = course1;
	}

	public Course getCourse2() {
		return course2;
	}

	public void setCourse2(Course course2) {
		this.course2 = course2;
	}

	public Course getCourse3() {
		return course3;
	}

	public void setCourse3(Course course3) {
		this.course3 = course3;
	}

	public Course getCourse4() {
		return course4;
	}

	public void setCourse4(Course course4) {
		this.course4 = course4;
	}

	public Course getCourse5() {
		return course5;
	}

	public void setCourse5(Course course5) {
		this.course5 = course5;
	}

}
