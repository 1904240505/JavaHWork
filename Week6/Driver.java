package Week601_����;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ����
		System.out.println("�����뾭��������");
		String aName = scan.next();
		System.out.println("�����뾭��ID�ţ�");
		String aId = scan.next();
		System.out.println("�����뾭��ְ��");
		String aDepartment = scan.next();
		System.out.println("�����뾭���ʣ�");
		double aBaseSalary = scan.nextDouble();
		System.out.println("�����뾭����");
		double aBonus = scan.nextDouble();

		// ������Ա
		System.out.println("������Ա��������");
		String sName = scan.next();
		System.out.println("������Ա��ID�ţ�");
		String sId = scan.next();
		System.out.println("������Ա��ְ��");
		String sDepartment = scan.next();
		System.out.println("������Ա�����ʣ�");
		double sBaseSalary = scan.nextDouble();
		System.out.println("������Ա���꽱��");
		double sBonus = scan.nextDouble();

		Administrator a1 = new Administrator(aName, aId, aDepartment, aBaseSalary, aBonus);
		SalePerson s1 = new SalePerson(sName, sId, sDepartment, sBaseSalary, sBonus);

		System.out.println(a1.toString());
		System.out.println(s1.toString());

		a1.updateSalary();
		System.out.println(a1.getBaseSalary());
		s1.updateSalary();
		System.out.println(s1.getBaseSalary());
	}
}
