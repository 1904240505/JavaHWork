package Week602_BankingApplication;

public class BankAccount {
	// ��������
	private String accountNum; // �ʺ�
	private double balance; // ���

	// ����
	public BankAccount() {
		super();
		this.accountNum = "";
		this.balance = 0;
	}

	public BankAccount(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	// get��set
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// toString
	public String toString() {
		String msg = "";
		msg += "�ʺţ�" + this.accountNum + "\n";
		msg += "���" + this.balance + "\n";
		return msg;
	}

}
