package Vo;

public class CourseTotal {
	private String Course;
	private double Total;
	private int num;

	public CourseTotal() {
		super();
	}

	public CourseTotal(String course, double total, int num) {
		super();
		Course = course;
		Total = total;
		this.num = num;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
