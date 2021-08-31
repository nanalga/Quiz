package quiz01;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		//1. 정수를 입력 받아 0을 입력을 받으면, while문이 종료되고, 그동안 입력 받았던 정수의 합 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 > ");
		int num = scan.nextInt();
		
		int sum = 0;
		
		while(num != 0) {
			sum += num;
			
			System.out.print("정수 입력 > ");
			num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("입력받은 수의 합 : " + sum );
			}	
		}
		//System.out.println("입력받은 수의 합 : " + sum );
		scan.close();
	}

}
