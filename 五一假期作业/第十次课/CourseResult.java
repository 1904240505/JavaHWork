package Vo;

public class CourseResult {
	private String Course;// 课程
	private double Avg;// 平均分

	public CourseResult() {
		super();
	}

	public CourseResult(String course, double avg) {
		super();
		Course = course;
		Avg = avg;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public double getAvg() {
		return Avg;
	}

	public void setAvg(double avg) {
		Avg = avg;
	}

	@Override
	public String toString() {
		String msg = "";
		msg += this.Course + "\t" + this.Avg;
		return msg;
	}
}
