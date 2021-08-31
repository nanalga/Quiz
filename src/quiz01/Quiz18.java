package quiz01;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		/*
		 * 가로, 세로를 입력 받아서 직사각형을 출력합니다.
		 * 단, 윤곽만 출력하면 됩니다. 
		 * 
		 * 먼저, 사각형을 만들고, 첫행, 마지막행, 첫 열, 마지막 열에만 출력
		 * 나머지는 공백
		 */

		//선생님
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로 : ");
		int w = scan.nextInt();
		System.out.print("세로 : ");
		int h = scan.nextInt();
		
		for(int i = 1; i<= h; i++) {
			for(int j = 1; j <= w; j++) {
				
				if(i == 1 || i == h) {	// 첫행과 마지막 행
					System.out.print("*");
				} else {	//나머지 행
					if(j == 1 || j == w) {	//첫 열과 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로 : ");
		int w = scan.nextInt();
		System.out.print("세로 : ");
		int h = scan.nextInt();
		
		for(int i = 1; i <= w; i++) {	//첫줄
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 1; i <= w; i++) {
					
			for(int t = 1; t <= h; t++) {
				if(t == 1 || t == w+2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		
		for(int i = 1; i <= w; i++) {	//마지막줄
			System.out.print("*");
		}
		
		
		
	}

}
