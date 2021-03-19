package WeekThree;

import java.util.Scanner;

public class FirstAndSecondNumber {
	// 输入两个整数，第一个整数小于第二个整数，循环下列功能
//	1.提示用户输入两个整数，第一个必须小于第二个
//	2.输出first和second之间的所有奇数
//	3.输出first和second之间的所有偶数的和
//	4.输出1~10之间的所有数字以及他们的平方
//	5.输出first和second之间的所有奇数的平方和
//	6.输出所有大写字母（用Ascll码表示）（不用做）

	public static int First, Second, flag = 0;

	public static void main(String[] args) {
		int choose;
		choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if (flag == 0) {
					System.out.println("请先输入两个整数，再执行此功能！");
					break;
				}
				outputOdd();
				break;
			case 3:
				if (flag == 0) {
					System.out.println("请先输入两个整数，再执行此功能！");
					break;
				}
				outputEvenSum();
				break;
			case 4:
				if (flag == 0) {
					System.out.println("请先输入两个整数，再执行此功能！");
					break;
				}
				outputSquares();
				break;
			case 5:
				if (flag == 0) {
					System.out.println("请先输入两个整数，再执行此功能！");
					break;
				}
				sumOfSquaresOfOdd();
				break;
			default:
				System.out.println("输入无效，请重新输入！");
			}// switch
			choose = menu();
		} // while;
		System.out.println("成功退出，欢迎下次使用！");
	}

	// 打印菜单
	public static int menu() {
		int choose;
		System.out.println("=========菜单=========");
		System.out.println("1.输入两个整数，第一个必须小于第二个");
		System.out.println("2.输出first和second之间的所有奇数");
		System.out.println("3.输出first和second之间的所有偶数的和");
		System.out.println("4.输出1~10之间的所有数字以及他们的平方");
		System.out.println("5.输出first和second之间的所有奇数的平方和");
		System.out.println("6.退出");
		System.out.println("请选择选项（1~6）：");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	// 输入两个整数
	public static void input() {
		flag = 1;
		Scanner scan = new Scanner(System.in);
		boolean ok = false;
		while (!ok) {
			System.out.println("请输入第一个整数：");
			First = scan.nextInt();
			System.out.println("请输入第二个整数：");
			Second = scan.nextInt();
			if (First < Second) {
				ok = true;
			} else {
				System.out.println("第一个整数不大于第二个整数，请重新输入！");
			}
		}

	}

	// 输出两个数之间的奇数
	public static void outputOdd() {
		System.out.println("奇数为：");
		for (int i = First; i <= Second; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 输出first和second之间的所有偶数的和
	public static void outputEvenSum() {
		int sum = 0;
		for (int i = First; i <= Second; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("偶数和为：" + sum);
	}

	// 输出1~10之间的所有数字以及他们的平方
	public static void outputSquares() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println("1~10的平方为：");
		for (int i = 1; i <= 10; i++) {
			System.out.println(Math.pow(i, 2) + " ");
		}
	}

	// 输出first和second之间的所有奇数的平方和
	public static void sumOfSquaresOfOdd() {
		int sum = 0;
		for (int i = First; i <= Second; i++) {
			if (i % 2 != 0) {
				sum += Math.pow(i, 2);
			}
		}
		System.out.println("奇数的平方和为：" + sum);
	}
}
