package quiz01;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		
		//1. 1~100까지 랜덤한 수를 만들고 짝, 홀수를 판별
		int result01 = (int)(Math.random() * 100) + 1; //1~100
		String ran = result01 % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println("1. " + ran);
		
		System.out.println("----------------------------------------------");
					
		//2. -5~5까지 랜덤한 수를 만들고, 절대값으로만 출력하세요
		int result02 = 5 - (int)(Math.random() * 11);
		System.out.println("2. 절대값 : "+(result02 < 0 ? -result02 : result02));
		
		System.out.println("----------------------------------------------");
		
		//3. 
		// 1~150까지 랜덤한 수를 사과의 개수로 가정.
		// bucket은 변수는 사과를 담을 수 있는 양.
		// 필요한 bucket의 개수를 구하면 됩니다.
		//ex) 사과 148개? 15개, 사과 150개? 15개
		
		int bucket = 10;
		
		int apple = (int)(Math.random() * 100)+ 51;
		System.out.println("사과 개수 : "+ apple);
		
		System.out.println("필요 Bucket 개수 : "+ (apple % bucket == 0 ? apple / bucket : apple / bucket +1));
 
	}
}
