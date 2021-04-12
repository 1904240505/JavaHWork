package Week601_例题;

public class SalePerson extends Employee {
	// 扩展
	private double yearlySalary;

	// 构造
	public SalePerson(String name, String id, String department, double baseSalary, double yearlySalary) {
		super(name, id, department, baseSalary);
		this.yearlySalary = yearlySalary;
	}

	// get与set
	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	// update
	public void updateSalary() {
		super.updateSalary();
		super.setBaseSalary(super.getBaseSalary() + this.yearlySalary * 0.1);
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "SalePerson:\n";
		msg += "年奖金：" + this.yearlySalary;
		msg += "\n" + super.toString();
		return msg;
	}
}
