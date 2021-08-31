package quiz01;

public class Quiz16 {
	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 *     *
		 *    *** 
		 *   *****
		 *  *******
		 * *********
		 *    
		 */
		int star = 5;
		for(int i = 1; i <= star; i++) {	
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//선생님
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//공백 찍고, * 찍고
		System.out.println("=============================");
		for(int i = 1; i<= star; i ++) {
			for(int j = 1; j <= star-i; j++) {	//공백출력
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (2*i)-1; j ++) {	//피라미드 출력
				System.out.print("*");
			}
			
			System.out.println();
		}
				
		
	}

}
