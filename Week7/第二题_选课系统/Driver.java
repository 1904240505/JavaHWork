package Week702_ѡ��ϵͳ;

import java.util.Scanner;

public class Driver {
	// ȫ��
	public static Scanner scan = new Scanner(System.in);
	public static Enrollment enrollment;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				if (enrollment != null) {
					System.out.print("�γ��Ѵ��ڣ��Ƿ����´���(y/n):");
					String c = scan.next();
					if (c.equals("n")) {
						break;
					}
				}
				System.out.print("����������γ�id:");
				String subId = scan.next();
				System.out.print("����������γ�����:");
				String subName = scan.next();
				System.out.print("����������γ�����:");
				int subNum = scan.nextInt();
				Subject subject = new Subject(subId, subName, subNum);
				enrollment = new Enrollment(subject);
				System.out.println("�����γ̳ɹ�����Ϣ����:");
//				System.out.println(enrollment.getSub().toString());
				enrollment.print();
				break;
			case 2:
				if (enrollment == null) {
					System.out.println("���ȴ����γ̣���ִ�д˹��ܣ�");
					break;
				}
				if (enrollment.getStuCount() >= enrollment.getStu().length) {
					System.out.println("�Դﵽ���������������ѡ��");
					break;
				}
				System.out.print("������ѡ��ѧ����id:");
				String id = scan.next();
				System.out.print("������ѡ��ѧ��������:");
				String name = scan.next();
				Student student = new Student(id, name);
				enrollment.chooseClass(student);
				System.out.println("��ϲ�㣬ѡ�γɹ���\nĿǰѡ���������:");
				System.out.println(enrollment.toString());
				break;
			case 3:
				System.out.print("��������ѡѧ����id:");
				String ID = scan.next();
				if (enrollment.chooseExit(ID)) {
					System.out.println("��ѡ�ɹ����µ�ѡ����Ϣ����:");
					System.out.println(enrollment.toString());
				} else {
					System.out.println("ѧ��Ϊ" + ID + "��ѧ����û��ѡ�Σ�");
				}
				break;
			case 4:
				System.out.println(enrollment.toString());
				break;
			default:
				System.out.println("����������������룡");
			}
			choose = menu();
		}
		System.out.println("�˳��ɹ�����ӭ�´�ʹ�ã�");
	}

	// �˵�
	public static int menu() {
		System.out.println("=====WTUѡ��ϵͳ=====");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ����");
		System.out.println("5.�˳�");
		System.out.print("��ѡ��(1~5):");
		int choose = scan.nextInt();
		return choose;
	}

}
