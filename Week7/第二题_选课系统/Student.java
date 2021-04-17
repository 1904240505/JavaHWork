package Week702_选课系统;

public class Student {
	// 数据定义
	private String id;
	private String name;

	// 构造
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// get & set
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString
	public String toString() {
		String msg = "";
		msg += this.id + "\t" + this.name;
		return msg;
	}
}
