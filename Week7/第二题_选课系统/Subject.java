package Week702_ѡ��ϵͳ;

public class Subject {
	// ���ݶ���
	private String cId;
	private String cName;
	private int cNumber;

	// ����
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
		msg += "�γ�id:" + this.cId + ", �γ�����:" + this.cName + ", �������:" + this.cNumber;
		return msg;
	}

}
