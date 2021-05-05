package 第11次课;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 第四题 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> value = new ArrayList<String>();

		String data = "<font face='Arial Serif' size='10px' color='red' />";

		Pattern p1 = Pattern.compile("<\s*font\s*([^>]*)\s*>");
		Matcher m1 = p1.matcher(data);

		if (m1.find()) {
			Pattern p2 = Pattern.compile("([a-z]+)\s*=\s*('(.*?)')", Pattern.CASE_INSENSITIVE);
			Matcher m2 = p2.matcher(m1.group(1));
			while (m2.find()) {
				name.add(m2.group(1));
				value.add(m2.group(3));
			}
		}

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i) + ":" + value.get(i));
		}

	}
}
