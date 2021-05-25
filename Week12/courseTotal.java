package Week12;

public class courseTotal {
	private String CouName;
	private float Sum;
	private int Count;

	public courseTotal() {
		super();
	}

	public courseTotal(String couName, float sum, int count) {
		super();
		CouName = couName;
		Sum = sum;
		Count = count;
	}

	public String getCouName() {
		return CouName;
	}

	public void setCouName(String couName) {
		CouName = couName;
	}

	public float getSum() {
		return Sum;
	}

	public void setSum(float sum) {
		Sum = sum;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

}
