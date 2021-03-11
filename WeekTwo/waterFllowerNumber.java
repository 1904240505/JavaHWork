package WeekTwo;

import java.util.Scanner;

public class waterFllowerNumber {
	public static void main(String[] a) {// 输出所有n为水仙花数（3<=n<=7）
		Scanner scan = new Scanner(System.in);
		// 数据定义
		int n;// n位数,例如：4，1000~9999
		int sum = 0;

		// 数据输入
		System.out.print("请输入位数：n=");
		n = scan.nextInt();

		// 数据处理
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			int j = i;
			while (j > 0) {
				sum += Math.pow(j % 10, n);
				j = j / 10;
			} // while
			if (sum == i) {
				System.out.println(i);// 输出
			}
			sum = 0;
		} // for

		System.out.print("已结束！！！");
	}
}
