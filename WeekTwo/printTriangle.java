package WeekTwo;

import java.util.Scanner;

public class printTriangle {
	public static void main(String[] a) {
		// 数据定义
		int n;// 打印三角形的行数

		// 输入提示
		System.out.print("请输入要打印的行数:n=");

		// 数据输入
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		// 处理
		for (int i = 1; i <= n; i++) {// 打印第i行8
			for (int j = 1; j <= n - i; j++) {// 打印空格
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// 打印*
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
