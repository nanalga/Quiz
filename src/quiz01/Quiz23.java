package quiz01;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 이용하여 금액을 입력 받으세요(1번 받는다)
		 * 2. 음료수를 선택하면 금액에서 차감하세요 (반복문)
		 * 3. 금액이 부족하다면 "금액이 부족합니다"를 출력하세요
		 * 4. 4를 입력 받으면 반복문을 종료 하세요 
		 * 조건문은 switch문 이용
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입해 주세요 > ");
		int money = scan.nextInt();
		System.out.println("남은 금액 : " + money);
		
		int backMoney = money;
		
		int soda = 400, mil = 500, coke = 600;
		
		ex:while(true) {
			System.out.println("[1]데미소다 : 400, [2]밀키스 : 500원, [3]코카콜라 : 600원, [4] 잔돈받기");
			System.out.print("음료수 선택 > ");
			int choice = scan.nextInt();
			
			//boolean flag = false;
			
			if(choice == 4) {
				System.out.println("남은 금액 " + backMoney + "를 반환합니다.");
				break;
			}
			
			switch (choice) {
			case 1:
				if(backMoney < soda) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요.");
				} else {
					System.out.println("데미소다를 받았습니다.");
					backMoney -= soda;
				}
				break;
			case 2:
				if(backMoney < soda) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요.");
				} else {
					System.out.println("밀키스를 받았습니다.");
					backMoney -= mil;
				}
				break;
			case 3:
				if(backMoney < coke) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요.");
				} else {
					System.out.println("코카콜라를 받았습니다.");
					backMoney -= coke;
				}
				break;
			
//			case 4:
//				System.out.println("남은 금액 " + backMoney + "를 반환합니다.");
//				flag = true;
//				break ex;
				
			default:
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("메뉴를 정확히 입력하세요.");
				break;
			}
			System.out.println("남은 금액 : " + backMoney);
			
		}
		
		scan.close();
	
	}

}
