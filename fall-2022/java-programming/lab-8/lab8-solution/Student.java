package lab8;

public class Student {
	private String studentName;
	private Double midTermScore;
	private Double finalExamScore;
	private Double assignment1Score;
	private Double assignment2Score;

	public Student() {
		this("Unknown", AppConstants.NEGATIVE_ONE, AppConstants.NEGATIVE_ONE, AppConstants.NEGATIVE_ONE,
				AppConstants.NEGATIVE_ONE);
	}

	public Student(String studentName, Double midTermScore, Double finalExamScore, Double assignment1Score,
			Double assignment2Score) {
		this.studentName = studentName;
		this.midTermScore = midTermScore;
		this.finalExamScore = finalExamScore;
		this.assignment1Score = assignment1Score;
		this.assignment2Score = assignment2Score;
	}

	public Double getMidTermScore() {
		return midTermScore;
	}

	public void setMidTermScore(Double midTermScore) {
		if ((midTermScore >= AppConstants.MIN_MARKS_MIDTERM_FINAL)
				&& (midTermScore <= AppConstants.MAX_MARKS_MIDTERM_FINAL)) {
			this.midTermScore = midTermScore;
		}
	}

	public Double getFinalExamScore() {
		return finalExamScore;
	}

	public void setFinalExamScore(Double finalExamScore) {
		if ((finalExamScore >= AppConstants.MIN_MARKS_MIDTERM_FINAL)
				&& (finalExamScore <= AppConstants.MAX_MARKS_MIDTERM_FINAL)) {
			this.finalExamScore = finalExamScore;
		}
	}

	public Double getAssignment1Score() {
		return assignment1Score;
	}

	public void setAssignment1Score(Double assignment1Score) {
		if ((assignment1Score >= AppConstants.MIN_MARKS_ASSIGNMENT_1_2)
				&& (assignment1Score <= AppConstants.MAX_MARKS_ASSIGNMENT_1_2)) {
			this.assignment1Score = assignment1Score;
		}
	}

	public Double getAssignment2Score() {
		return assignment2Score;
	}

	public void setAssignment2Score(Double assignment2Score) {
		if ((assignment2Score >= AppConstants.MIN_MARKS_ASSIGNMENT_1_2)
				&& (assignment2Score <= AppConstants.MAX_MARKS_ASSIGNMENT_1_2)) {
			this.assignment2Score = assignment2Score;
		}
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
