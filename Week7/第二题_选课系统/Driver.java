package Week702_选课系统;

import java.util.Scanner;

public class Driver {
	// 全局
	public static Scanner scan = new Scanner(System.in);
	public static Enrollment enrollment;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				if (enrollment != null) {
					System.out.print("课程已存在，是否重新创建(y/n):");
					String c = scan.next();
					if (c.equals("n")) {
						break;
					}
				}
				System.out.print("请依次输入课程id:");
				String subId = scan.next();
				System.out.print("请依次输入课程名称:");
				String subName = scan.next();
				System.out.print("请依次输入课程人数:");
				int subNum = scan.nextInt();
				Subject subject = new Subject(subId, subName, subNum);
				enrollment = new Enrollment(subject);
				System.out.println("创建课程成功，信息如下:");
//				System.out.println(enrollment.getSub().toString());
				enrollment.print();
				break;
			case 2:
				if (enrollment == null) {
					System.out.println("请先创建课程，再执行此功能！");
					break;
				}
				if (enrollment.getStuCount() >= enrollment.getStu().length) {
					System.out.println("以达到最大人数，不能再选！");
					break;
				}
				System.out.print("请输入选课学生的id:");
				String id = scan.next();
				System.out.print("请输入选课学生的姓名:");
				String name = scan.next();
				Student student = new Student(id, name);
				enrollment.chooseClass(student);
				System.out.println("恭喜你，选课成功！\n目前选课情况如下:");
				System.out.println(enrollment.toString());
				break;
			case 3:
				System.out.print("请输入推选学生的id:");
				String ID = scan.next();
				if (enrollment.chooseExit(ID)) {
					System.out.println("退选成功！新的选课信息如下:");
					System.out.println(enrollment.toString());
				} else {
					System.out.println("学号为" + ID + "的学生并没有选课！");
				}
				break;
			case 4:
				System.out.println(enrollment.toString());
				break;
			default:
				System.out.println("输入错误，请重新输入！");
			}
			choose = menu();
		}
		System.out.println("退出成功，欢迎下次使用！");
	}

	// 菜单
	public static int menu() {
		System.out.println("=====WTU选课系统=====");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");
		System.out.print("请选择(1~5):");
		int choose = scan.nextInt();
		return choose;
	}

}
