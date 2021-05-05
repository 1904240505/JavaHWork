package ��11�ο�;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * ����ʽ����add(*,*)��sub(*,*)��max(*,*)��min(*,*)��doubleMe(*)
 * ��������С��
 * ��������ʽ��doubleMe()���ܷŵ���ǰ��
 * �����������������
*/

public class �ڶ��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
//		String data = "add(5,doubleMe(1))";	
		System.out.print(data + "=");
		int item;
		Pattern p;
		Matcher m;
		boolean ok;
		String base;// �ӱ��ʽ
		while (true) {
			ok = ifmore(data);// �жϱ��ʽ�Ƿ�Ϊ����
			if (ok) {
				p = Pattern.compile("([a-zA-Z0-9\\(|,]+)(,)([a-zA-Z]+)(\\(([0-9]+|[0-9]+,[0-9]+)(\\))+)");// ģʽ
				m = p.matcher(data);// ƥ��
			} else {
				p = Pattern.compile("([a-zA-Z\\(]+)(.*)(\\))");
				m = p.matcher(data);
			}

			if (m.find()) {
				if (ok) {
					base = m.group(3) + "(" + m.group(5) + ")";
					item = calculate(base);// �ӱ��ʽ���
					data = data.replace(base, String.valueOf(item));// �滻����±��ʽ

				} else {
					base = m.group();
					item = calculate(base);// �ӱ��ʽ���
					break;
				}
			}
		}

		System.out.println(item);
	}

	// �жϱ��ʽ�Ƿ�Ϊ���أ��Ǿͷ���true,���򷵻�false
	public static boolean ifmore(String s) {
		boolean ok = true;

		String array[] = s.split("\\(");
		if (array.length == 2)
			ok = false;

		return ok;
	}

	// ���������ʽ���룬����������
	public static int calculate(String s) {
		int result = 0;
		int pos1, pos2, pos3;
		pos1 = s.indexOf("(");
		String sign = s.substring(0, pos1);

		pos2 = s.indexOf(",");
		pos3 = s.indexOf(")");

		if (pos2 < 0) {// ֻ��һ�����֣�doubleMe
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
