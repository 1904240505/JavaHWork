package Week801;

import java.util.Scanner;

public class checkPassword {
	public static void main(String[] args) {
		System.out.println("请输入密码，密码要求如下：");
		System.out.println("1.密码长度为6～10之间");
		System.out.println("2.密码不能包含空格");
		System.out.println("3.密码中必须存在至少一个大写、小写字母");
		System.out.println("4.密码中必须包含数字");
		
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		
		int len = password.length();
		if(len <6 || len>10 ){
			System.out.println(password + "密码无效，密码长度必须在6～10之间");
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
			System.out.println(password + "密码设置成功！");
			return;
		}
		
		String errorInfo = "";
		System.out.println(password + "密码设置错误，原因如下：");
		if(hasspace){
			errorInfo += "密码中存在空格！\n";
		}
		if(!hasdigital){
			errorInfo += "密码中无数字！\n";
		}
		if(!haslower){
			errorInfo += "密码中无小写字母\n";
		}
		if(!hasupper){
			errorInfo += "密码中无大写字母\n";
		}
		
		System.out.println(errorInfo);
	}
}
