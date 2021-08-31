package quiz01;

import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		//1. 정수 2개를 입력 받는다.
		//2. 두수를 비교해서 "x가 큰수입니다"를 출력, 같은  수라면 "같은 수입니다" 출력
		
		Scanner scan = new Scanner(System.in);
				
		int[] arrInt = new int[2];
		
		System.out.println("정수 2개를 입력하세요.");
		System.out.print(">");
		arrInt[0]=scan.nextInt();
		System.out.print(">");
		arrInt[1]=scan.nextInt();
		
		if(arrInt[0] == arrInt[1]) {
			System.out.println("같은 수 입니다.");
		} else if(arrInt[0] < arrInt[1]) {
			System.out.println(arrInt[1]+"이 큰 수 입니다.");
		} else if(arrInt[0] > arrInt[1]) {
			System.out.println(arrInt[0]+"이 큰 수 입니다.");
		}
		
		scan.close();
	}

}
