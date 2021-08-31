package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {
	
	public static void main(String[] args) {
		//1. 
		int[] arr = {1000, 500, 100, 50, 10};	//동전
		int money = 17520;	//금액
		
		
		int i = 0;	//
		int m = 0;	//돈 저장할 변수
		
		while(i < arr.length) {	//arr배열 길이만큼 실행 조건
			
			m = money / arr[i];	// money(17520) / arr 배열 순서대로 나눠서 몫을 변수 m에 전달한다. ex) 17520 / 1000 = 17
			System.out.println(arr[i]+"원 : "+ m);	// 배열의 값과 나눈 몫을 출력
			money = money % arr[i];	// money % arr[0] 나머지 값을 money로 전달 한다.(다음 배열 값의 몫을 구하기 위해)
				
			i++;
		}
		
		System.out.println("-----------------------------------");
		//2. 양수를 입력받아, 입력 받은 수 크기를 배열에 생성하세요
		//2. 배열에 1~입력받은 수 까지 차례대로 값을 넣으세요
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요> ");
		int num = scan.nextInt();
		
		int[] arr2 = new int[num];	//입력받은 정수로 arr2배열의 길이로 설정해준다. 
		
		int j = 0;	//while 초기값 0 지정
		while(j < arr2.length) {	//0부터 arr2배열의 길이까지 조건 
			
			arr2[j] = j+1;	// arr2배열에 증감되는 j값을 +1 하여 넣어준다. (+1을 한것은 j의 초기값을 0으로 하였기 때문)
			//System.out.println(arr2[j]);
			
			j++;
		}
		System.out.println("배열 arr2는 : "+ Arrays.toString(arr2));	//Arrays.toString()은 배열 값을 보는 명령문이다.
	}

}
