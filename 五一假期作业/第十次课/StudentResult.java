package Vo;

public class StudentResult {
	private String Id;// 学号
	private String Name;// 姓名
	private String Gender;// 性别
	private double Avg;// 平均成绩

	public StudentResult() {
		super();
	}

	public StudentResult(String id, String name, String gender, double avg) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Avg = avg;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
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
		msg += this.Id + "\t" + this.Name + "\t" + this.Gender + "\t" + this.Avg;
		return msg;
	}
}
