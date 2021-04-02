package Week502;

public class ClassList {
	//��Ա
	private int semester;
	private int year;
	private Subject subj;
	private Student s1;
	private Student s2;
	
	//����
	public ClassList(int year,
			int semester,
			Subject subj,
			Student s1,
			Student s2) {
		
		this.year = year;
		this.semester =semester;
		this.subj = subj;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	//get & set
	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Subject getSubj() {
		return subj;
	}

	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}
	
	//��ӡ��Ϣ
	public String toString() {
		String output ="";
		output +=this.year +"ѧ��";
		output +="��" + this.semester +"ѧ��\n";
		output +=this.subj.toString();
		output +="ѧ��\t����";
		output +="\n=======================\n";
		output +=this.s1.toString();
		output +=this.s2.toString();
		return output;
	}
}
