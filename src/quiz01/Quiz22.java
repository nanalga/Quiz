package quiz01;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		/*
		 * 두수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램
		 * 2가지 정수 1~100사이의 난수를 발생시켜 지속적으로 문제를 출제한 후 정답이면
		 * 정답 카운트를 +1씩, 틀리면 오답 카운트를 +1씩 올려주는 프로그램 만드시오
		 * 0을 입력시 프로그램 종료  
		 * 추가 +, -연산식도 추가
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int count1 = 0;	//맞힌 문제 카운트
		int count2 = 0;	//틀린 문제 카운트
		
		String[] arr = {"+", "-"};
		
		while(true) {
			int ranNum1 = (int)(Math.random() * 100)+1;	//1~100까지 랜덤 수 생성
			int ranNum2 = (int)(Math.random() * 100)+1;
			int ranNum3 = (int)(Math.random() * arr.length);
			
			System.out.println("-----------------------------");
			System.out.println(ranNum1 + arr[ranNum3] + ranNum2 + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print("> ");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				 System.out.println("프로그램 종료합니다.");
				 System.out.println("------------------------");
				 System.out.println("정답 횟수 : " + count1 + "회");
				 System.out.println("틀린 횟수 : " + count2 + "회");
					
				 break;
			}
			
			if(answer == (ranNum1+ranNum2) || answer == (ranNum1-ranNum2)) {
				System.out.println("정답입니다.");
				count1++;
			}else if(answer != (ranNum1+ranNum2) || answer != (ranNum1+ranNum2)) {
				System.out.println("틀렸습니다.");
				//System.out.println("-----------------------------");
				count2++;
			}
			
		}
		scan.close();

	}

}
