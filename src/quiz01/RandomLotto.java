package quiz01;

import java.util.Arrays;

public class RandomLotto {
	public static void main(String[] args) {
		/*
		 * 무작위로 생성된 로또번호를 이용하여 당첨되기 까지 금액을 알아보는 프로그램 입니다.
		 * 
		 * 1. 입력 - x
		 * 2. 출력-길이가 6인 배열
		 * lotto함수는 1~45까지의 중복되지 않는 랜덤수를 배열에 넣어 반환하는 메서드 입니다.
		 * 이 메서드는 실행 결과는 당첨번호가 됩니다.
		 * ================================================================
		 * 1. 입력-당첨배열
		 * 2. 출력-long(당첨되기까지의 금액)
		 * ran함수는 당첨배열을 받아서 당첨되기까지 랜덤한 금액을 계산하는 메서드입니다.
		 * 배열 비교 sort사용
		 * ---당첨의 조건---
		 * 당첨번호 - [10,9,8,7,6,5]
		 * ex) [5,6,8,7,9,10] 당첨
		 * ex) [10,9,8,7,6,45] 당첨x
		 */
		int[] realNum = lotto();
		int[] myNum = lotto();
		
		long result = ran(realNum, myNum);
		System.out.println(Arrays.toString(realNum));
		System.out.println(Arrays.toString(myNum));
		
		
	}
	
	static int[] lotto() {	//로또 번호 생성 메서드
		int[] lottoArr = new int[6];
		int index = 0;
		
		start:while(true) {
			int ranLotto = (int)(Math.random() * 45)+1;	//1~45번호 랜덤생성
			
			for(int i = 0; i < lottoArr.length; i++) {	//Lotto중복 번호 검사
				if(lottoArr[i] == ranLotto) continue start;	//중복 될 경우 continue
			}
			lottoArr[index] = ranLotto;	//ranLotto값을 배열에 전달
			index++;
			
			if(index == 6) break;	//인덱스 6만큼 입력이 되면 종료(탈출)
		}

		return lottoArr;
	}
	
	static long ran(int[] realLotto, int[] myLotto) {
		int count = 0;
		
		for(int i = 0; i < realLotto.length; i++) {
			if(realLotto[i] == myLotto[i]) {
				count++;
			}
		}
		
		return 0;
		
	}

}
