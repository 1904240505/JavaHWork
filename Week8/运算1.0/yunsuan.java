package Week801;

import java.util.Scanner;

public class yunsuan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入运算式，格式如下 ：\na+b  或者  a/b");
		String ha = scan.nextLine();
		
		String array[] = ha.split("\\+|\\-|\\*|/");
//		String array[] = ha.split("[+\\-*/]");
		
		String num1 = array[0].trim();
		String num2 = array[1].trim();
		
		int pos = num1.length();
		boolean ok = true;
		while(ok){
			if(ha.charAt(pos) == ' ')
				pos++;
			if(ha.charAt(pos) != ' ')
				break;
		}
		
		
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		
		double result = 0;
		switch(ha.charAt(pos)){
		case '+':result = number1 + number2;break;
		case '-':result = number1 - number2;break;
		case '*':result = number1 * number2;break;
		case '/':result = number1 / number2;break;
		}
		System.out.println(ha + '=' + String.valueOf(result));
	}
}