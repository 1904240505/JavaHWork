package Week801;

import java.util.Scanner;

public class yunsuan02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入运算函数，格式如下：\n例如：add(53.1,31.2) \n输出为：add(53.1,31.2)=84.3\n请输入：");
		String express = scan.nextLine();
		
		int pos1 = express.indexOf("(");
		int pos3 = express.indexOf(")");
		double result = 0;
		String caozuo = express.substring(0, pos1); 
		if(caozuo.equals("doubleMe")){
			String num = express.substring(pos1+1, pos3);
			result = Double.parseDouble(num) * 2;
		}
		else{
			int pos2 = express.indexOf(",");
			String num1 = express.substring(pos1+1,pos2);
			String num2 = express.substring(pos2+1,pos3);
			double number1 = Double.parseDouble(num1);
			double number2 = Double.parseDouble(num2);
			
			switch(caozuo){
			case "add":result = number1 + number2;break;
			case "sub":result = number1 - number2;break;
			case "max":result = number1>number2?number1:number2;break;
			case "min":result = number1<number2?number1:number2;break;
			}
		}
		
		
		System.out.println(express +"="+ String.valueOf(result));		
	
	}
}
