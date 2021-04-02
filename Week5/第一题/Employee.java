package Week501;

public class Employee {
	private String empID;
	private String empName;
	private String department;
	private double baseSalary;

	public Employee(String empID, String empName, String department, double baseSalary) {

		this.empID = empID;
		this.empName = empName;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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

	public String toString() {
		String amg = "";
		amg += "Ա��id��" + this.empID;
		amg += "\tԱ��������" + this.empName;
		amg += "\tԱ�����ţ�" + this.department;
		amg += "\tԱ�����ʣ�" + this.baseSalary;
		return amg;
	}
}
