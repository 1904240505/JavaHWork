package Week502;

public class Subject {
	//��Ա
	private String subjectID;
	private String subjectName;
	
	//����
	public Subject(String subjectID,String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
	
	//get & set
	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//��ӡ��Ϣ
	public String toString() {
		String output ="";
		output += "�γ̴��룺" + this.subjectID+"\t";
		output += "�γ����ƣ�" +this.subjectName+"\n";
		
		return output;
	}
}
