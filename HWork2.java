package ClassTwo_HWork;

import java.util.Scanner;

public class HWork2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���ݶ���
		double length, width, area;// ���������
		int frameType; // ��������
		int ifColour; // �Ƿ���ɫ
		int numberOfCrown; // ��������

		double costOfFrame = 0;// �ܼ�Ǯ

		// ��������+������ʾ
		System.out.println("��������Ƭ�ĳ��ȺͿ��");
		System.out.print("����:");
		length = scan.nextDouble();
		System.out.print("���:");
		width = scan.nextDouble();

		System.out.println("��ѡ�񾵿�����ͣ�0:regular,1:fancy��");
		System.out.print("��ѡ��");
		frameType = scan.nextInt();

		System.out.println("�Ƿ�Կ����ɫ��0����1���ǣ�");
		System.out.print("��ѡ��");
		ifColour = scan.nextInt();

		System.out.print("������������ڵ�������");
		numberOfCrown = scan.nextInt();

		// ���ݴ���
		area = length * width;// ������

		costOfFrame += area * (0.02 + 0.07);// Ӳֽ��Ͳ�������

		if (frameType == 1) {
			costOfFrame += 1 * (length + width) * 2 * 0.25;// �ߵ����
		} else {
			costOfFrame += 1 * (length + width) * 2 * 0.15;// ��ͨ���
		}

		if (ifColour == 1) { // ��ɫ
			costOfFrame += 1 * (length + width) * 2 * 0.1;
		}

		costOfFrame += numberOfCrown * 0.35; // ����

		// �������
		System.out.println("����ķ���Ϊ��" + costOfFrame);
	}
}
