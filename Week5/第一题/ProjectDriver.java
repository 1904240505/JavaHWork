package Week501;

import java.util.Scanner;

public class ProjectDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Ա��1
		System.out.println("������Ա��1��id:");
		String emp1ID = scan.next();
		System.out.println("������Ա��1������:");
		String emp1Name = scan.next();
		System.out.println("������Ա��1�Ĳ���:");
		String emp1department = scan.next();
		System.out.println("������Ա��1�Ĺ���:");
		double emp1Salary = scan.nextDouble();

		// Ա��2
		System.out.println("������Ա��2��id:");
		String emp2ID = scan.next();
		System.out.println("������Ա��2������:");
		String emp2Name = scan.next();
		System.out.println("������Ա��2�Ĳ���:");
		String emp2department = scan.next();
		System.out.println("������Ա��2�Ĺ���:");
		double emp2Salary = scan.nextDouble();
		
		//project
		System.out.println("��������Ŀ������:");
		String projectName = scan.next();
		System.out.println("��������ĿԤ��:");
		double projectSalary = scan.nextDouble();
		
		Employee emp1 = new Employee(emp1ID,emp1Name,emp1department,emp1Salary);
		Employee emp2 = new Employee(emp2ID,emp2Name,emp2department,emp2Salary);
		Project project = new Project(projectName,projectSalary,emp1,emp2);
		
		//����Ԥ��
		project.updateBudget();
		
		System.out.println("���º��Ԥ��Ϊ:" +project.getBudget());
		
		//�����Ŀ��Ϣ
		System.out.println(project.toString());
		
	}
}
