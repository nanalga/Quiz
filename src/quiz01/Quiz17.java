package quiz01;

public class Quiz17 {
	
	public static void main(String[] args) {
		//8칸 스페이스 - \t
		/*
		for(int i = 1; i <= 9; i+= 3) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " x " + j + " = "+ i * j + "\t");
				System.out.print((i+1) + " x " + j + " = " + (i+1)*j + "\t");
				System.out.print((i+2) + " x " + j + " = " + (i+2)*j + "\t");
				System.out.println();
			}
			System.out.println();		
		}
		*/
		
		//나의 코드
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(j + " x " + i + " = "+ j * i + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 4; j <= 6; j++) {
				System.out.print(j + " x " + i + " = "+ j * i + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 7; j <= 9; j++) {
				System.out.print(j + " x " + i + " = "+ j * i + "\t");
			}
			System.out.println();
		}

		
	}

}
