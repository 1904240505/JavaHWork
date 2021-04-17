package Week702_选课系统;

public class Subject {
	// 数据定义
	private String cId;
	private String cName;
	private int cNumber;

	// 构造
	public Subject(String cId, String cName, int cNumber) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cNumber = cNumber;
	}

	// get & set
	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcNumber() {
		return cNumber;
	}

	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "课程id:" + this.cId + ", 课程名称:" + this.cName + ", 最大人数:" + this.cNumber;
		return msg;
	}

}
