package Week702_ѡ��ϵͳ;

public class Enrollment {
	// ���ݶ���
	private Subject sub[]; // �γ�(��ֻ�趨һ���γ�)
//	private int subCount;  //�γ�����
	private Student stu[];
	private int stuCount; // ��ǰ����

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

	// ����
	public Enrollment(Subject subject) {
		this.sub = new Subject[1];
		this.sub[0] = subject;
//		this.sub[0].setcId(id);  //sub[0]�ǿյģ�������
//		this.sub[0].setcName(name);
//		this.sub[0].setcNumber(num); // �γ�������������

		this.stu = new Student[subject.getcNumber()]; // ѧ���������
		this.stuCount = 0; // ����,��ǰΪ0��
	}

	// ѡ��
	public void chooseClass(Student student) {
		stu[stuCount] = student;
		
//		stu[stuCount].setId(student.getId());
//		stu[stuCount].setName(student.getName());
		stuCount++;
	}

	// ��ѡ
	public boolean chooseExit(String id) {
		if (stuCount <= 0) {
			return false;
		}
		int i;
		boolean ok = false;
		for (i = 0; i < stuCount; i++) { // Ѱ���Ƿ������ѧ��
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

	//��ӡ�γ�
	public void print() {
		String msg = "";
		msg += "�γ�id:" + sub[0].getcId() + ", �γ�����:" + sub[0].getcName() + ", �������:" + sub[0].getcNumber();
		System.out.println(msg);
	}
	// ��ӡ������Ϣ
	public String toString() {
		String msg = "";
		msg += sub[0].toString() + "\n";
		msg += "ѡ������" + this.stuCount + "\n";
		msg += "ѧ��" + "\t" + "����\n";
		for (int i = 0; i < this.stuCount; i++) {
			msg += stu[i].toString() + "\n";
		}
		return msg;
	}

}
