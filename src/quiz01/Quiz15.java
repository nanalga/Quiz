package quiz01;

import java.util.Arrays;

public class Quiz15 {
	
	public static void main(String[] args) {
		/*
		int x = 50;
		int y = 100;
		
		int temp = y;
		y = x;
		x = temp;
		
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		*/
		
		//절대 중복되지 않는 값을 3개 추출해서 새로운 배열을 만드는 과정.
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//1. 랜덤수를 생성하고 랜덤 index번째 값과 위치를 변경.
		for(int i = 0; i < arr.length; i++) {

			int ran = (int)(Math.random() * arr.length);	//0~8 랜덤값 생성
			
			int temp = arr[i];	//기존 배열 arr[i]값을 temp에 전달
			arr[i] = arr[ran];	//랜덤 배열 arr[ran]값을 기존배열arr[i] 전달 
			arr[ran] = temp;	//다시 temp에 있던 값을 arr[ran] 전달
		}
		
		//2. 0~2번째 까지의 값을 길이가 3인 배열에 담아주면 됩니다.
		int[] newArr = new int[3];	//새로운 크기3인 배열 생성 
		for(int i = 0; i < newArr.length; i++) {	//배열의 크기만큼 반복문 조건 설정
			newArr[i] = arr[i];	//섞인 배열 값을 새로운 배열에 전달
		}
		System.out.println(Arrays.toString(newArr));	//배열 값 확인
	}

}
