package quiz01;

import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		//특정 수를 입력 받아, 구구단 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 수를 입력하세요 : ");
		int guguNum = scan.nextInt();
		
		System.out.println("랜덤 구구단 "+ guguNum + "단");
		System.out.println("========================");
		
		int num = 1;
		
		while(num < 10) {
			System.out.println(guguNum + " X " + num + " = " + (guguNum * num));
			
			num++;
		}
		
		
		
		
	}

}
