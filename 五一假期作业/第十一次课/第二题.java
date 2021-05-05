package 第11次课;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * 运算式包括add(*,*)、sub(*,*)、max(*,*)、min(*,*)、doubleMe(*)
 * 不能运算小数
 * 多重运算式中doubleMe()不能放到最前面
 * 其他情况可正常运行
*/

public class 第二题 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
//		String data = "add(5,doubleMe(1))";	
		System.out.print(data + "=");
		int item;
		Pattern p;
		Matcher m;
		boolean ok;
		String base;// 子表达式
		while (true) {
			ok = ifmore(data);// 判断表达式是否为多重
			if (ok) {
				p = Pattern.compile("([a-zA-Z0-9\\(|,]+)(,)([a-zA-Z]+)(\\(([0-9]+|[0-9]+,[0-9]+)(\\))+)");// 模式
				m = p.matcher(data);// 匹配
			} else {
				p = Pattern.compile("([a-zA-Z\\(]+)(.*)(\\))");
				m = p.matcher(data);
			}

			if (m.find()) {
				if (ok) {
					base = m.group(3) + "(" + m.group(5) + ")";
					item = calculate(base);// 子表达式结果
					data = data.replace(base, String.valueOf(item));// 替换后的新表达式

				} else {
					base = m.group();
					item = calculate(base);// 子表达式结果
					break;
				}
			}
		}

		System.out.println(item);
	}

	// 判断表达式是否为多重，是就返回true,否则返回false
	public static boolean ifmore(String s) {
		boolean ok = true;

		String array[] = s.split("\\(");
		if (array.length == 2)
			ok = false;

		return ok;
	}

	// 将基本表达式传入，返回运算结果
	public static int calculate(String s) {
		int result = 0;
		int pos1, pos2, pos3;
		pos1 = s.indexOf("(");
		String sign = s.substring(0, pos1);

		pos2 = s.indexOf(",");
		pos3 = s.indexOf(")");

		if (pos2 < 0) {// 只有一个数字，doubleMe
			result = Integer.parseInt(s.substring(pos1 + 1, pos3)) * 2;
		} else {
			int first = Integer.parseInt(s.substring(pos1 + 1, pos2));
			int second = Integer.parseInt(s.substring(pos2 + 1, pos3));
			switch (sign) {
			case "add":
				result = first + second;
				break;
			case "sub":
				result = first - second;
				break;
			case "max":
				if (first >= second) {
					result = first;
				} else {
					result = second;
				}
				break;
			case "min":
				if (first <= second) {
					result = first;
				} else {
					result = second;
				}
				break;
			}
		}

		return result;
	}

}
