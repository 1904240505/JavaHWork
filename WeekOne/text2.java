package boxAndContainerNumber;

import java.util.Scanner;

public class text2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���ݶ���
		int boxNumber;
		int containerNumber;
		int totalBiscuits;

		int BOX = 24;
		int CONTAINER = 75;

		int surplusBiscuits;
		int surplusBox;

		// ����������ʾ
		System.out.print("���������������");

		totalBiscuits = scan.nextInt();

		// ���ݴ���
		boxNumber = totalBiscuits / BOX;
		surplusBiscuits = totalBiscuits % BOX;

		containerNumber = boxNumber / CONTAINER;
		surplusBox = boxNumber % CONTAINER;

		// ������

		System.out.println("���ӵ������ǣ�" + boxNumber);
		System.out.println("�����������Ϊ��" + surplusBiscuits);
		System.out.println("�����������ǣ�" + containerNumber);
		System.out.println("������ӵ�����Ϊ��" + surplusBox);
	}

}
