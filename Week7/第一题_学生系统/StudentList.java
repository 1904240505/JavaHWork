package Week701_学生系统;

public class StudentList {
	private Student[] list;
	private int count;

	public StudentList(int max_size) {
		this.list = new Student[max_size];
		this.count = 0;
	}

	// 加入元素
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

	// 删除指定的元素
	public boolean remove(int index) {
		if (index >= count || index < 0) {  // 下标越界
			return false;
		}
		this.list[index] = null;
		for (int i = index; i < count - 1; i++) {
			list[i] = list[i + 1];
		}
		count--;
		return true;
	}

	// 查找某个字段的位置
	public int indexOf(String id) {
		for (int i = 0; i < count; i++) {
			if (list[i].getId().equals(id))
				return i;
		}
		return -1;
	}

	// 返回指定位置的元素
	public Student get(int index) {
		return list[index];
	}

	// 返回集合中当前元素的个数
	public int size() {
		return count;
	}

	// 遍历集合
	public String toString() {
		String msg = "";
		for (int i = 0; i < count; i++) {
			msg += list[i].toString() + "\n";
		}
		return msg;
	}
}
