package Week701_ѧ��ϵͳ;

public class StudentList {
	private Student[] list;
	private int count;

	public StudentList(int max_size) {
		this.list = new Student[max_size];
		this.count = 0;
	}

	// ����Ԫ��
	public boolean add(Student student) {
		if (student == null) {
			return false;
		}
		if (list.length <= count) {
			return false;
		}
		// list[count].setId(student.getId());
		// list[count].setName(student.getName());
		list[count] = student;
		count++;
		return true;
	}

	// ɾ��ָ����Ԫ��
	public boolean remove(int index) {
		if (index >= count || index < 0) {  // �±�Խ��
			return false;
		}
		this.list[index] = null;
		for (int i = index; i < count - 1; i++) {
			list[i] = list[i + 1];
		}
		count--;
		return true;
	}

	// ����ĳ���ֶε�λ��
	public int indexOf(String id) {
		for (int i = 0; i < count; i++) {
			if (list[i].getId().equals(id))
				return i;
		}
		return -1;
	}

	// ����ָ��λ�õ�Ԫ��
	public Student get(int index) {
		return list[index];
	}

	// ���ؼ����е�ǰԪ�صĸ���
	public int size() {
		return count;
	}

	// ��������
	public String toString() {
		String msg = "";
		for (int i = 0; i < count; i++) {
			msg += list[i].toString() + "\n";
		}
		return msg;
	}
}
