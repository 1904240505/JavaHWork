package WeekTwo;

import java.util.Scanner;

public class printTriangle {
	public static void main(String[] a) {
		// ���ݶ���
		int n;// ��ӡ�����ε�����

		// ������ʾ
		System.out.print("������Ҫ��ӡ������:n=");

		// ��������
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		// ����
		for (int i = 1; i <= n; i++) {// ��ӡ��i��8
			for (int j = 1; j <= n - i; j++) {// ��ӡ�ո�
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// ��ӡ*
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
