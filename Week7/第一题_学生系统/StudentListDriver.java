package Week701_ѧ��ϵͳ;

import java.util.Scanner;

public class StudentListDriver {
	public static Scanner scan = new Scanner(System.in);
	public static StudentList stu;
	public static void main(String[] a){
		int choose = menu();
		while(choose != 7){
			switch(choose){
			case 1:
				Add();
				break;
			case 2:
				if(tip())
				Delete();
				break;
			case 3:
				if(tip())
				IndexOf();
				break;
			case 4:
				if(tip())
				GetIndex();
				break;
			case 5:
				if(tip())
				System.out.println("��ǰ������Ԫ�ظ���Ϊ:"+stu.size());
				break;
			case 6:
				if(tip())
				System.out.println(stu.toString());
				break;
			default:System.out.println("�������,����������!");
			}
			choose = menu();
		}
		System.out.println("�ɹ��˳�����ӭ�´�ʹ�ã�");
	}
	
	public static int menu(){
		System.out.println("=====ѧ������ϵͳ=====");
		System.out.println("1.����ѧ����Ϣ");
		System.out.println("2.ɾ��ѧ����Ϣ");
		System.out.println("3.����ָ���ֶ�λ��");
		System.out.println("4.����ָ��λ��Ԫ��");
		System.out.println("5.��ʾ��ǰ������Ԫ�صĸ���");
		System.out.println("6.��ӡ������Ϣ");
		System.out.println("7.�˳�");
		int choose;
		System.out.print("��ѡ��1��7��:");
		choose = scan.nextInt();
		return choose;
	}
	
	public static void Add(){
		String id,name;
		Student s;
		stu = new StudentList(10);
		System.out.println("������ѧ������������Ϊ10����");
		int item = scan.nextInt();
		for(int i=0; i<item; i++){
			System.out.println("�������"+(i+1)+"��ѧ����id:");
			id = scan.next();
			System.out.println("�������"+(i+1)+"��ѧ����name:");
			name = scan.next();
			s =new Student(id,name);
			if(!stu.add(s)){
				System.out.println("�������"+(i+1)+"��ѧ������Ϣ���ʧ�ܣ���ѡ��������ӻ����˳���1��2����");
				int a = scan.nextInt();
				if(a == 1){
					i--;
				}if(a == 2){
					break;
				}
			}
		}
	}
	
	public static void Delete(){
		System.out.println("������ɾ����Ա��λ�ã�");
		int index = scan.nextInt();
		if(stu.remove(index)){
			System.out.println("ɾ���ɹ���");
		}else{
			System.out.println("ɾ��ʧ�ܣ�");
		}
	}
		
	public static void IndexOf(){
		System.out.println("������������ѧ����id��");
		String id = scan.next();
		if(stu.indexOf(id)>=0){
			System.out.println("id��Ϊ"+id+"��ѧ������λ��Ϊ��"+stu.indexOf(id));
		}else{
			System.out.println("id��Ϊ"+id+"��ѧ�������ڣ�");
		}
	}
	
	public static void GetIndex(){
		Student s;
		System.out.println("��������Ҫ����ѧ����λ�ã�");
		int index = scan.nextInt();
		s = stu.get(index);
		System.out.println("��ѧ����ϢΪ��"+ s.toString());	
	}
	
	public static boolean tip(){
		if(stu == null){
			System.out.println("����ִ�в���1����ִ�д˹��ܣ�");
			return false;
		}
		return true;
	}
}
