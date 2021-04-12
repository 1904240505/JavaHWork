package Week601_例题;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 经理
		System.out.println("请输入经理姓名：");
		String aName = scan.next();
		System.out.println("请输入经理ID号：");
		String aId = scan.next();
		System.out.println("请输入经理职务：");
		String aDepartment = scan.next();
		System.out.println("请输入经理工资：");
		double aBaseSalary = scan.nextDouble();
		System.out.println("请输入经理奖金：");
		double aBonus = scan.nextDouble();

		// 销售人员
		System.out.println("请输入员工姓名：");
		String sName = scan.next();
		System.out.println("请输入员工ID号：");
		String sId = scan.next();
		System.out.println("请输入员工职务：");
		String sDepartment = scan.next();
		System.out.println("请输入员工工资：");
		double sBaseSalary = scan.nextDouble();
		System.out.println("请输入员工年奖金：");
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
