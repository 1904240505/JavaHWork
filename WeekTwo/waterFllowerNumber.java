package WeekTwo;

import java.util.Scanner;

public class waterFllowerNumber {
	public static void main(String[] a) {// �������nΪˮ�ɻ�����3<=n<=7��
		Scanner scan = new Scanner(System.in);
		// ���ݶ���
		int n;// nλ��,���磺4��1000~9999
		int sum = 0;

		// ��������
		System.out.print("������λ����n=");
		n = scan.nextInt();

		// ���ݴ���
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			int j = i;
			while (j > 0) {
				sum += Math.pow(j % 10, n);
				j = j / 10;
			} // while
			if (sum == i) {
				System.out.println(i);// ���
			}
			sum = 0;
		} // for

		System.out.print("�ѽ���������");
	}
}
