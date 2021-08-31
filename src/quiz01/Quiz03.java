package quiz01;

import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		//키(double)와 나이(int)입력받으세요
		//키가 140이상, 나이가 8세 이상 "놀이기구 탑승가능", 아니라면, "놀이기구 탑승불가" 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키 : ");
		double cm = scan.nextDouble();
		System.out.print("나이 : ");	
		int age = scan.nextInt();
		System.out.println("=====================================");
		
		if(cm >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		} else {
			System.out.println("놀이기구 탑승이 불가합니다.");
		}
		
		scan.close();
	}

}
