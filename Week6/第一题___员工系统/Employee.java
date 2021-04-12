package Week601_例题;

public class Employee {
	// 数据定义
	private String name;
	private String id;
	private String department;
	private double baseSalary;

	// 构造
	public Employee() {
		name = "***";
		id = "0000";
		department = "无";
		baseSalary = 0.0;
	}

	public Employee(String name, String id, String department, double baseSalary) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	// get与set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// display
	public void display() {
		String msg = "";
		msg += "姓名：" + this.name;
		msg += "\nID：" + this.id;
		msg += "\n职位：" + this.department;
		msg += "\n基本工资：" + this.baseSalary;
		System.out.println(msg);
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "姓名：" + this.name;
		msg += "\nID：" + this.id;
		msg += "\n职位：" + this.department;
		msg += "\n基本工资：" + this.baseSalary;
		return msg;
	}

	// update
	public void updateSalary() {
		this.setBaseSalary(this.getBaseSalary() * 1.0725);
	}
}
