package Week502;

public class Student {
	//��Ա
	private String studentID;
	private String studetName;
	
	//��������
	public Student(String studentID,String studetName) {
		this.studentID = studentID;
		this.studetName = studetName;
	}
	
	//get and set 
	public String getStudentID() {
		return this.studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudetName() {
		return studetName;
	}

	public void setStudetName(String studetName) {
		this.studetName = studetName;
	}
	
	//��ӡ��Ϣ
	public String toString() {
		String output = "";
		output += this.studentID;
		output += "\t" + this.studetName +"\n";
		return output;
	}

}
