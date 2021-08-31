package quiz01;

public class MethodQuiz02 {
	public static void main(String[] args) {
		/*
		 * 1. java 함수는 매개변수로 숫자를 받습니다
		 * 2. 매개변수 숫자길이만큼 패턴 "자바자바자바자바..."를 리턴 하는 함수를 완성하세요
		 *    1이면 자
		 *    2이면 자바
		 *    3이면 자바자
		 *    4이면 자바자바
		 *    
		 * 1. 자연수 n을 입력 받아 n의 약수를 모두 더한 값을 리턴 하는 함수를 완성하세요.   
		 */
		
		String str = java(5);
		System.out.println("문제1 : " + str);
		
		int result01 = calSum(5);
		System.out.println("문제 2: " + result01);
		
		System.out.println("문제3-입력받은 수의 소수 개수 : "+ primeNum(3));
		
		System.out.println("7~9의 사이의 수의 합 : " + sumNum(7, 9));
		System.out.println("9~7의 사이의 수의 합 : " + sumNum(9, 7));
		System.out.println("5~5의 사이의 수의 합 : " + sumNum(5, 5));
		

		System.out.println("입력받은 자리수의 합 : " + sumNum2(1234));
		
	}
	static String java(int num) {
		char c1 = '자', c2 ='바';
		String str = "";
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				str += c2;
			}else {
				str += c1;
			}
		}
		return str;
	}

	static int calSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) 
				sum += i;
		}
		return sum;
	}
	
	static int primeNum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}	
			}
			if(count == 2) {
				sum++;
			}
		}
		
		return sum;
	}

	/*
	 * sumNum은 매개변수 2개를 지정합니다.
	 * 두개변수 사이에 속한 모든 정수의 합을 구하는 sumNum을 완성하세요
	 * 두 매개변수의 크기를 정해지지 않았습니다.
	 */
	static int sumNum(int num1, int num2) {
		int sum = 0;
		int max = 0, min =0;
		
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				sum += i;
			}
		}else if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				sum += i;
			}
		}else {
			for(int i = num1; i <= num1; i++) {
				sum += i;
			}
		}
		return sum;
		
		/*
		 * int max = a > b ? a : b;
		 * int min = b > a ? a : b;
		 * int sum = 0;
		 * 
		 * for(int i = min; i <= max; i++){
		 * 		sum += i;
		 * }
		 * 
		 */
		
	}
	
	
	/*
	 * 자연수 자리수의 합구하기
	 * 자연수 n이 매개변수로 주어지면 n자리수의 합을 구해서 return하는 메서드
	 * 조건
	 * n은 1억 이하의 자연수
	 * n의 자료형을 바꾸면 안됩니다.
	 * ex)10230543 => 18
	 */
	static int sumNum2(int n) {
		int sum = 0;
			for(int i = 10000000; i >= 1; i /= 10) {
				if(n / i != 0) {	//몫이 있는 경우
					sum += (n / i);	//몫을 구해서 누적
					n %= i;
				}
			}
			return sum;
	}
	
}
