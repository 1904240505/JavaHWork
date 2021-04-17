package Week702_选课系统;

public class Enrollment {
	// 数据定义
	private Subject sub[]; // 课程(先只设定一个课程)
//	private int subCount;  //课程数量
	private Student stu[];
	private int stuCount; // 当前人数

	// get & set
	public Subject[] getSub() {
		return sub;
	}

	public void setSub(Subject sub[]) {
		this.sub = sub;
	}

	public Student[] getStu() {
		return stu;
	}

	public void setStu(Student[] stu) {
		this.stu = stu;
	}

	public int getStuCount() {
		return stuCount;
	}

	public void setStuCount(int stuCount) {
		this.stuCount = stuCount;
	}

	// 构造
	public Enrollment(Subject subject) {
		this.sub = new Subject[1];
		this.sub[0] = subject;
//		this.sub[0].setcId(id);  //sub[0]是空的？？？？
//		this.sub[0].setcName(name);
//		this.sub[0].setcNumber(num); // 课程所能容纳人数

		this.stu = new Student[subject.getcNumber()]; // 学生最大数量
		this.stuCount = 0; // 计数,当前为0人
	}

	// 选课
	public void chooseClass(Student student) {
		stu[stuCount] = student;
		
//		stu[stuCount].setId(student.getId());
//		stu[stuCount].setName(student.getName());
		stuCount++;
	}

	// 退选
	public boolean chooseExit(String id) {
		if (stuCount <= 0) {
			return false;
		}
		int i;
		boolean ok = false;
		for (i = 0; i < stuCount; i++) { // 寻找是否有这个学生
			if (stu[i].getId().equals(id)) {
				ok = true;
				break;
			}
		}
		if (ok) {
			stu[i] = null;
			for (int j = i; j < stuCount - 1; j++) {
				stu[j] = stu[j + 1];
			}
			stuCount--;
			return true;
		} else {
			return false;
		}
	}

	//打印课程
	public void print() {
		String msg = "";
		msg += "课程id:" + sub[0].getcId() + ", 课程名称:" + sub[0].getcName() + ", 最大人数:" + sub[0].getcNumber();
		System.out.println(msg);
	}
	// 打印所有信息
	public String toString() {
		String msg = "";
		msg += sub[0].toString() + "\n";
		msg += "选课人数" + this.stuCount + "\n";
		msg += "学号" + "\t" + "姓名\n";
		for (int i = 0; i < this.stuCount; i++) {
			msg += stu[i].toString() + "\n";
		}
		return msg;
	}

}
