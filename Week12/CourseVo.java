package Week12;

public class CourseVo {
	private String Id;
	private String CouName;
	private float Score;

	public CourseVo() {
		super();
	}

	public CourseVo(String id, String couName, float score) {
		super();
		Id = id;
		CouName = couName;
		Score = score;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCouName() {
		return CouName;
	}

	public void setCouName(String couName) {
		CouName = couName;
	}

	public float getScore() {
		return Score;
	}

	public void setScore(float score) {
		Score = score;
	}

	@Override
	public String toString() {
		String msg = "";
		msg += this.Id + "," + this.CouName + "," + this.Score;

		return msg;
	}

}
