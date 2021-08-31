package quiz01;

import java.util.Scanner;

public class Quiz09 {
	
	public static void main(String[] args) {
		//간단한 사칙연산이 되는 간략한 프로그램
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("정수1> ");
		int num1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]> ");
		String oper = scan.next();
		
		System.out.print("정수> ");
		int num2 = scan.nextInt();
		
		switch (oper) {
		case "+":
			System.out.println("두수의 덧셈은 : "+ ( num1 + num2));
			break;
		case "-":
			System.out.println("두수의 뺄셈은 : "+ ( num1 - num2));
			break;
		case "*":
			System.out.println("두수의 곱셈은 : "+ ( num1 * num2));
			break;
		case "/":
			System.out.println("두수의 나눗셈은 : "+ ( num1 / num2));
			break;

		default:
			System.out.println("연산을 잘못 입력하였습니다.\n다시 입력해주세요.");
			break;
		}
		
		
	}

}
