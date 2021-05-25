package Week12;

public class AsCourseVo {
	private String CouName;
	private float AvgScore;

	public AsCourseVo() {
		super();
	}

	public AsCourseVo(String couName, float avgScore) {
		super();
		CouName = couName;
		AvgScore = avgScore;
	}

	public String getCouName() {
		return CouName;
	}

	public void setCouName(String couName) {
		CouName = couName;
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
		msg += this.CouName + "," + this.AvgScore;

		return msg;
	}

}
