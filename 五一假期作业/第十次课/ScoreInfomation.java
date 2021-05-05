package Vo;

public class ScoreInfomation {
	private String Id;// Ñ§ºÅ
	private String Course;// ¿Î³Ì
	private double Grade;// ³É¼¨

	public ScoreInfomation() {
		super();
	}

	public ScoreInfomation(String id, String course, double grade) {
		super();
		Id = id;
		Course = course;
		Grade = grade;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	@Override
	public String toString() {
		return "ScoreInfomation [Id=" + Id + ", Course=" + Course + ", Grade=" + Grade + "]";
	}
}
