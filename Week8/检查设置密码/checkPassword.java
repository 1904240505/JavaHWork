package Week801;

import java.util.Scanner;

public class checkPassword {
	public static void main(String[] args) {
		System.out.println("���������룬����Ҫ�����£�");
		System.out.println("1.���볤��Ϊ6��10֮��");
		System.out.println("2.���벻�ܰ����ո�");
		System.out.println("3.�����б����������һ����д��Сд��ĸ");
		System.out.println("4.�����б����������");
		
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		
		int len = password.length();
		if(len <6 || len>10 ){
			System.out.println(password + "������Ч�����볤�ȱ�����6��10֮��");
			return ;
		}
		
		boolean hasspace = false;
		boolean hasdigital = false;
		boolean hasupper = false;
		boolean haslower = false;
		
		for(int i=0; i<len; i++ ){
			char c = password.charAt(i);
			if(c == ' '){
				hasspace = true;
			}
			if(c>='0' && c<='9'){
				hasdigital = true;
			}
			if(c>='a' && c<='z'){
				haslower = true;
			}
			if(c>='A' && c<= 'Z'){
				hasupper = true;
			}
		}
		
		
		if(!hasspace && hasdigital && haslower && hasupper) {
			System.out.println(password + "�������óɹ���");
			return;
		}
		
		String errorInfo = "";
		System.out.println(password + "�������ô���ԭ�����£�");
		if(hasspace){
			errorInfo += "�����д��ڿո�\n";
		}
		if(!hasdigital){
			errorInfo += "�����������֣�\n";
		}
		if(!haslower){
			errorInfo += "��������Сд��ĸ\n";
		}
		if(!hasupper){
			errorInfo += "�������޴�д��ĸ\n";
		}
		
		System.out.println(errorInfo);
	}
}
