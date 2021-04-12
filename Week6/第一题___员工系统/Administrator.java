package Week601_����;

public class Administrator extends Employee {
	// ��չ
	private double bonus;

	// ����
	
	public Administrator(String name, String id, String department, double baseSalary, double bonus) {
		super(name, id, department, baseSalary);
		this.bonus = bonus;
	}

	// get��set
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
		msg += "����" + this.bonus;
		msg += "\n" + super.toString();
		return msg;
	}
}
