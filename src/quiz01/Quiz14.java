package quiz01;

public class Quiz14 {
	public static void main(String[] args) {
		
		//1. 랜점수 2~9랜덤 정수를 만들고, for으로 구구단 출력
		int ranNum = (int)(Math.random() * 8) + 2;
		
		for(int i = 1; i <= 9; i++) {
			//System.out.println(ranNum + " X " + i + " = " + i * ranNum);
			System.out.printf("%d X %d = %d \n", ranNum, i, ranNum * i);
		}
		
		System.out.println("----------------------------------");
		
		//2. 50~100까지 두 수 사이의 합.
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50~100까지 합 : " + sum);
		
		System.out.println("----------------------------------");
				
		//3. A~Z까지 문자를 가로로 출력 (A=65 Z=90)
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------------");
				
		//4. 200까지 정수중의 if문을 사용하지 않고 짝수만 출력.
		for(int i = 0; i <= 200; i += 2) {			
			System.out.print(i + " ");
		}

		
	}

}
