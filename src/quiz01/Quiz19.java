package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		/*
		 * 1. 정수를 입력 받으세요
		 * 2. 2중 for문을 이용하여 입력 받은 수 까지 소수들의 합을 구하세요
		 * 3. 힌트) 입력 받은 수까지 반복, 내부 for문에서 외부for문의 수까지 반복
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();

		int sum = 0;	//합을 누적할 변수
		
		for(int i = 1; i <= num; i++) {
			
			int count = 0; //약수의 개수를 판별(값을 판별하기 위해 초기화)
			
			//i값 판별
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {	//i의 약수는 개수가2개이므로 i는 소수이다.
				sum += i;
			}
		}
		System.out.println("1에서 "+num+"까지의 합 : "+sum);
		
		/*
		int sum = 0;
		
		int b = 0;
		for(int i = 2; i <= num; i++) {		
			for(int j = 2; j <= i; j++) {
				if(i%j==0) {
					b++;
				}
				else {
					
				}
			}
			if(b>1) {
				
			}
			else if(b==1){
				sum += i;
			}
			b=0;
		}
		System.out.println(num+" 소수합 : "+ sum);
		*/
	}

}
