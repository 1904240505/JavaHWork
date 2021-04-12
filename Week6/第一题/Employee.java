package Week601_����;

public class Employee {
	// ���ݶ���
	private String name;
	private String id;
	private String department;
	private double baseSalary;

	// ����
	public Employee() {
		name = "***";
		id = "0000";
		department = "��";
		baseSalary = 0.0;
	}

	public Employee(String name, String id, String department, double baseSalary) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	// get��set
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
		msg += "������" + this.name;
		msg += "\nID��" + this.id;
		msg += "\nְλ��" + this.department;
		msg += "\n�������ʣ�" + this.baseSalary;
		System.out.println(msg);
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "������" + this.name;
		msg += "\nID��" + this.id;
		msg += "\nְλ��" + this.department;
		msg += "\n�������ʣ�" + this.baseSalary;
		return msg;
	}

	// update
	public void updateSalary() {
		this.setBaseSalary(this.getBaseSalary() * 1.0725);
	}
}
