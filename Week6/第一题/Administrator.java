package Week601_例题;

public class Administrator extends Employee {
	// 扩展
	private double bonus;

	// 构造
	
	public Administrator(String name, String id, String department, double baseSalary, double bonus) {
		super(name, id, department, baseSalary);
		this.bonus = bonus;
	}

	// get与set
	public double getBonus() {
		return this.bonus;
	}

	public void SetBonus() {
		this.bonus = bonus;
	}

	// update
	public void updateSalary() {
		super.updateSalary();
		super.setBaseSalary(super.getBaseSalary() + this.bonus);
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "Administrator:\n";
		msg += "奖金：" + this.bonus;
		msg += "\n" + super.toString();
		return msg;
	}
}
