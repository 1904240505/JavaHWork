package Week502;

import java.util.Scanner;

public class Driver {
	public static ClassList cl = null;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choose = menu();
		while(choose!=3) {
			switch(choose) {
			case 1:
				String a;
				if(cl != null) {
					System.out.print("�γ��Ѿ��������Ƿ����´���(y/n):");
					a = scan.next();
					if(a.equals("n"))  // �Ƚ��ַ����á�equals()����
						break;
				}
				createList();
				break;
			case 2:
				if(cl == null) {
					System.out.println("����ִ��1,��ִ�д˹��ܣ�\n");
					break;
				}
				printall();
				break;
			default :System.out.println("������Ч�����������룡");
			}
			
			choose = menu();
		}
		System.out.println("�ɹ��˳�ϵͳ����ӭ�´�ʹ�ã�");
		
	}
	
	public static int menu() {
		int choose = 0;
		System.out.println("====WTU�γ̹���ϵͳ====");
		System.out.println("1.Create List");
		System.out.println("2.Print List");
		System.out.println("3.Exit");
		System.out.print("please choose(1-2):");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
		
	}
	
	public static void createList() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ѧ�꣺");
		int year = scan.nextInt();
		System.out.print("������ѧ��(1-2):");
		int semester = scan.nextInt();
		
		System.out.print("������γ̴��룺");
		String subjectID = scan.next();
		System.out.print("������γ����ƣ�");
		String subjectName = scan.next();
		
		System.out.print("������ѧ��1ѧ�ţ�");
		String studentID1 = scan.next();
		System.out.print("������ѧ��1������");
		String studentName1 = scan.next();
		System.out.print("������ѧ��2ѧ�ţ�");
		String studentID2 = scan.next();
		System.out.print("������ѧ��2������");
		String studentName2 = scan.next();
		
		Subject sub = new Subject(subjectID,subjectName);
		Student stu1 = new Student(studentID1,studentName1);
		Student stu2 = new Student(studentID2,studentName2);
		
		cl =new ClassList(year,semester,sub,stu1,stu2);
	}
	
	public static void printall() {
		System.out.println(cl.toString());
	}
	
}
