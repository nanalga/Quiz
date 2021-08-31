package quiz01;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		//1. 양의 정수를 입력 받아 짝수라면, "x는 짝수입니다.", 홀수라면 "x는 홀수입니다." 출력하시오
		//2. 0이라면 "0입니다."
		//3. 음수라면 "음수입니다."를 출력하시오
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		System.out.print(">");
		int num1 = scan.nextInt();
		
		
		if(num1 == 0) {
			System.out.println(num1 + "는 0입니다.");
		} else if(num1 < 0){
			System.out.println(num1 + "은 음수입니다.");
		} else if(num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수입니다.");
		} else if (num1 % 2 != 0) {
			System.out.println(num1 + "는 홀수입니다.");
		} else if(num1 == num1){
			System.out.println(num1 + "은 음수입니다.");
		}
		
		scan.close();
	}

}
