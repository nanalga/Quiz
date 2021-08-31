package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 정수를 3개 순서대로 입력받습니다.
		 * 가장 큰 값, 중간 값, 가장 작은 값을 구해서 max, mid, min변수에 저장하고 출력 
		 */
			
		int max = 0, mid = 0, min = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력합니다.");
		System.out.print(">");
		int num1 = scan.nextInt();
		
		System.out.print(">");
		int num2 = scan.nextInt();
		
		System.out.print(">");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {//num1 가장 큰경우
			max = num1;
			if(num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else if(num2 > num1 && num2 >num3 ) {//num2가 가장 큰 경우
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
		} else if(num3 > num1 && num3 > num2) {//num3 가장 큰 경우
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
		} else {
			System.out.println("같은값");
		}
		System.out.println("max : " + max + ", mid : " + mid + " min : " + min);	
		scan.close();
	}
}
