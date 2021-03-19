package WeekThree;

import java.util.Scanner;

public class StudentScoreSystem {

//	public static double score[] = null; // 先定义全局

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double score[] = null;
		String stop;
		
		int choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				score = new double[5];
				input(score);
				break;
			case 2:
				if (score == null) {
					System.out.println("请先输入成绩，再执行此功能！");
					break;
				}
				System.out.println("平均成绩是：" + getAge(score));
				//暂停一下
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			case 3:
				if (score == null) {
					System.out.println("请先输入成绩，再执行此功能！");
					break;
				}
				System.out.println("最高成绩是：" + getMax(score));
				//暂停一下
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			case 4:
				if (score == null) {
					System.out.println("请先输入成绩，再执行此功能！");
					break;
				}
				System.out.println("最低成绩是：" + getMin(score));
				//暂停一下
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			case 5:
				if (score == null) {
					System.out.println("请先输入成绩，再执行此功能！");
					break;
				}
				output(score);
				//暂停一下
				System.out.println("press ang key to continue...");
				stop = scan.nextLine();
				break;
			default:
				System.out.println("选择无效，请重新选择！");
			}// switch
			choose = menu();
		} // while
		System.out.println("程序退出，欢迎再次使用！");

	}

	// 完成菜单打印、返回选择的选项
	public static int menu() {
		int choose = 0;
		System.out.println("------学生成绩系统------");
		System.out.println("1.输入学生成绩(5个学生)");
		System.out.println("2.输出学生成绩平均值");
		System.out.println("3.输出最高成绩");
		System.out.println("4.输出最低成绩");
		System.out.println("5.按从小到大排序输出成绩");
		System.out.println("6.退出");
		System.out.println("请选择（1~6）");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	// 输入学生成绩
	public static void input(double score[]) {
		System.out.println("成绩范围：0~100！");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第" + (i + 1) + "名学生的成绩:");
			boolean ok = true;
			while (ok) {
				score[i] = scan.nextDouble();
				if (score[i] < 0 || score[i] > 100) {
					System.out.println("成绩无效，请重新输入第" + (i + 1) + "名学生的成绩！");
				} else {
					ok = false;
				}
			} // while
		} // for

	}

	// 返回平均值
	public static double getAge(double score[]) {
		double age = 0, sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		age = sum / score.length;

		return age;
	}

	// 返回最高值
	public static double getMax(double score[]) {
		double Max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (Max < score[i]) {
				Max = score[i];
			}
		}
		return Max;
	}

	// 返回最低值
	public static double getMin(double score[]) {
		double Min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (Min > score[i]) {
				Min = score[i];
			}
		}
		return Min;
	}

	// 按顺序输出成绩（从小到大）
	public static void output(double score[]) {
		double temp;
		//冒泡排序
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j] > score[j + 1]) {
					temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		//输出
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " ");
		}
	}

}
