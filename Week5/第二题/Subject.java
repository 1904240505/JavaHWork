package Week502;

public class Subject {
	//成员
	private String subjectID;
	private String subjectName;
	
	//输入
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
	
	//打印信息
	public String toString() {
		String output ="";
		output += "课程代码：" + this.subjectID+"\t";
		output += "课程名称：" +this.subjectName+"\n";
		
		return output;
	}
}
