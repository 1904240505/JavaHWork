package Week502;

public class Student {
	//成员
	private String studentID;
	private String studetName;
	
	//输入姓名
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
	
	//打印信息
	public String toString() {
		String output = "";
		output += this.studentID;
		output += "\t" + this.studetName +"\n";
		return output;
	}

}
