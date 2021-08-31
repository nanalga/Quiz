package quiz01;

import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		//1. 1~100까지 정수중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
		/*
		int a = 1;
		while(a <= 100) {
			if(a % 3 == 0 || a % 4 == 0) {
				System.out.print(a + ", ");
			} 
			a++;
		}
		*/
		
		//2. 1~200까지 정수중 5의 배수의 합.
		/*
		int b = 1;
		int sum = 0;
		while(b <= 200) {
			if(b % 5 == 0) {
				System.out.print(b+" ");
				sum += b;
			}
			b++;
		}
		System.out.println();
		System.out.println("1~200의 정수 중 5의 배수 합 : "+sum);
		*/
		
		//3. 1~200까지 정수중 4의 배수이면서 8의 배수가 아닌 수의 개수
		/*
		int c = 1;
		int count = 0;
		while(c <= 200) {
			if(c % 4 == 0 && c % 8 != 0) {
				System.out.print(c + " ");
				count++;
			}
			c++;
		}
		System.out.println();
		System.out.println("1~200까지 정수중 4의 배수이면서 8의 배수가 아닌 수의 개수 : "+count);
		*/
		
		//4. 두 정수를 입력하면서 두 정수 사이의 합을 구하시오(같은 경우는 없다고 가정) ex)1, 5 -> 1+2+3+4+5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요.");
		
		System.out.print("정수1 > ");
		int num1 = scan.nextInt();
		
		System.out.print("정수2 > ");
		int num2 = scan.nextInt();
		
		/*삼항연산식으로도 사용가능
		 * max = num1 > num2 ? num1 : num2;
		 * min = num1 < num2 ? num1 : num2;
		*/
		
		
		int max = 0;	
		int min = 0;
		int sum = 0;
		
		if(num1 > num2) {	
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		while(min <= max) {
			sum += min;
			
			System.out.print(min + " ");
			min++;
		}
		System.out.println();
		System.out.println("두개의 정수 합 :" + sum);		
			
	}

}
