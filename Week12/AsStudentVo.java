package Week12;

public class AsStudentVo {
	private String Id;
	private String Name;
	private String Gender;
	private float AvgScore;

	public AsStudentVo() {
		super();
	}

	public AsStudentVo(String id, String name, String gender, float avgScore) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		AvgScore = avgScore;
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

	public float getAvgScore() {
		return AvgScore;
	}

	public void setAvgScore(float avgScore) {
		AvgScore = avgScore;
	}

	@Override
	public String toString() {
		String msg = "";
		msg += this.Id + "," + this.Name + "," + this.Gender + "," + this.AvgScore;
		return msg;
	}

}
