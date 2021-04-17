package Week701_学生系统;

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
				System.out.println("当前集合中元素个数为:"+stu.size());
				break;
			case 6:
				if(tip())
				System.out.println(stu.toString());
				break;
			default:System.out.println("输入错误,请重新输入!");
			}
			choose = menu();
		}
		System.out.println("成功退出，欢迎下次使用！");
	}
	
	public static int menu(){
		System.out.println("=====学生管理系统=====");
		System.out.println("1.加入学生信息");
		System.out.println("2.删除学生信息");
		System.out.println("3.查找指定字段位置");
		System.out.println("4.返回指定位置元素");
		System.out.println("5.显示当前集合中元素的个数");
		System.out.println("6.打印集合信息");
		System.out.println("7.退出");
		int choose;
		System.out.print("请选择（1～7）:");
		choose = scan.nextInt();
		return choose;
	}
	
	public static void Add(){
		String id,name;
		Student s;
		stu = new StudentList(10);
		System.out.println("请输入学生数量（容量为10）：");
		int item = scan.nextInt();
		for(int i=0; i<item; i++){
			System.out.println("请输入第"+(i+1)+"名学生的id:");
			id = scan.next();
			System.out.println("请输入第"+(i+1)+"名学生的name:");
			name = scan.next();
			s =new Student(id,name);
			if(!stu.add(s)){
				System.out.println("请输入第"+(i+1)+"名学生的信息添加失败，请选择重新添加或者退出（1、2）：");
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
		System.out.println("请输入删除成员的位置：");
		int index = scan.nextInt();
		if(stu.remove(index)){
			System.out.println("删除成功！");
		}else{
			System.out.println("删除失败！");
		}
	}
		
	public static void IndexOf(){
		System.out.println("请输入所查找学生的id：");
		String id = scan.next();
		if(stu.indexOf(id)>=0){
			System.out.println("id号为"+id+"的学生所在位置为："+stu.indexOf(id));
		}else{
			System.out.println("id号为"+id+"的学生不存在！");
		}
	}
	
	public static void GetIndex(){
		Student s;
		System.out.println("请输入所要查找学生的位置：");
		int index = scan.nextInt();
		s = stu.get(index);
		System.out.println("该学生信息为："+ s.toString());	
	}
	
	public static boolean tip(){
		if(stu == null){
			System.out.println("请先执行操作1，在执行此功能！");
			return false;
		}
		return true;
	}
}
