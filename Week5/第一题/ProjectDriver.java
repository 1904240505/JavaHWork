package Week501;

import java.util.Scanner;

public class ProjectDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 员工1
		System.out.println("请输入员工1的id:");
		String emp1ID = scan.next();
		System.out.println("请输入员工1的姓名:");
		String emp1Name = scan.next();
		System.out.println("请输入员工1的部门:");
		String emp1department = scan.next();
		System.out.println("请输入员工1的工资:");
		double emp1Salary = scan.nextDouble();

		// 员工2
		System.out.println("请输入员工2的id:");
		String emp2ID = scan.next();
		System.out.println("请输入员工2的姓名:");
		String emp2Name = scan.next();
		System.out.println("请输入员工2的部门:");
		String emp2department = scan.next();
		System.out.println("请输入员工2的工资:");
		double emp2Salary = scan.nextDouble();
		
		//project
		System.out.println("请输入项目的名称:");
		String projectName = scan.next();
		System.out.println("请输入项目预算:");
		double projectSalary = scan.nextDouble();
		
		Employee emp1 = new Employee(emp1ID,emp1Name,emp1department,emp1Salary);
		Employee emp2 = new Employee(emp2ID,emp2Name,emp2department,emp2Salary);
		Project project = new Project(projectName,projectSalary,emp1,emp2);
		
		//更改预算
		project.updateBudget();
		
		System.out.println("更新后的预算为:" +project.getBudget());
		
		//输出项目信息
		System.out.println(project.toString());
		
	}
}
