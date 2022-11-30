package week8;

public class Test {
	public static final int MIN_SCORE = 0;
	private static final String GRADE_ABOVE_90 = "A";
	private static final String GRADE_80_90 = "B";
	private static final String GRADE_70_80 = "C";
	private static final String GRADE_60_70 = "D";
	private static final String GRADE_BELOW_60 = "F";
	private int id;
	public double maxScore;
	private static int count = 100;
	private double scoreObtained;

	public Test() {
		this(-1, -1);
	}

	public Test(double scoreObtained) {
		this(0, scoreObtained);
	}

	public Test(double maxScore, double scoreObtained) {
		this.maxScore = maxScore;
		this.scoreObtained = scoreObtained;
		this.setId(count++);
	}

	public double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(double maxScore) {
		if (maxScore > 0) {
			this.maxScore = maxScore;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScoreObtained() {
		return scoreObtained;
	}

	public void setScoreObtained(double scoreObtained) {
		if ((scoreObtained >= MIN_SCORE) && (scoreObtained <= this.getMaxScore())) {
			this.scoreObtained = scoreObtained;
		}
	}

	public double getPercentage(double scoreObtained) {
		return (scoreObtained / this.getMaxScore()) * 100;
	}

	public String getLetterGrade(double percentage) {
		if (percentage >= 90) {
			return GRADE_ABOVE_90;
		} else if ((percentage >= 80) && (percentage < 90)) {
			return GRADE_80_90;
		} else if ((percentage >= 70) && (percentage < 80)) {
			return GRADE_70_80;
		} else if ((percentage >= 60) && (percentage < 70)) {
			return GRADE_60_70;
		} else {
			return GRADE_BELOW_60;
		}
	}

	public String toString() {
		return "Student ID: " + this.id + "\nMaximum Marks: " + this.maxScore + "\nMarks Obtained: "
				+ this.scoreObtained;
	}

	public boolean equals(Test test) {
		if (this.getId() == test.getId()) {
			return true;
		}
		return false;
	}
}
