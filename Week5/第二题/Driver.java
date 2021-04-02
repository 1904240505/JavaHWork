package Week502;

import java.util.Scanner;

public class Driver {
	public static ClassList cl = null;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choose = menu();
		while(choose!=3) {
			switch(choose) {
			case 1:
				String a;
				if(cl != null) {
					System.out.print("课程已经创建，是否重新创建(y/n):");
					a = scan.next();
					if(a.equals("n"))  // 比较字符串用。equals()函数
						break;
				}
				createList();
				break;
			case 2:
				if(cl == null) {
					System.out.println("请先执行1,再执行此功能！\n");
					break;
				}
				printall();
				break;
			default :System.out.println("输入无效，请重新输入！");
			}
			
			choose = menu();
		}
		System.out.println("成功退出系统，欢迎下次使用！");
		
	}
	
	public static int menu() {
		int choose = 0;
		System.out.println("====WTU课程管理系统====");
		System.out.println("1.Create List");
		System.out.println("2.Print List");
		System.out.println("3.Exit");
		System.out.print("please choose(1-2):");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
		
	}
	
	public static void createList() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入学年：");
		int year = scan.nextInt();
		System.out.print("请输入学期(1-2):");
		int semester = scan.nextInt();
		
		System.out.print("请输入课程代码：");
		String subjectID = scan.next();
		System.out.print("请输入课程名称：");
		String subjectName = scan.next();
		
		System.out.print("请输入学生1学号：");
		String studentID1 = scan.next();
		System.out.print("请输入学生1姓名：");
		String studentName1 = scan.next();
		System.out.print("请输入学生2学号：");
		String studentID2 = scan.next();
		System.out.print("请输入学生2姓名：");
		String studentName2 = scan.next();
		
		Subject sub = new Subject(subjectID,subjectName);
		Student stu1 = new Student(studentID1,studentName1);
		Student stu2 = new Student(studentID2,studentName2);
		
		cl =new ClassList(year,semester,sub,stu1,stu2);
	}
	
	public static void printall() {
		System.out.println(cl.toString());
	}
	
}
