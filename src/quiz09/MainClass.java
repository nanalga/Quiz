package quiz09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 번호, 20)을 저장 하고 값을 확인하세요.
		 */
		User u1 = new User();
		u1.setName("홍길동");
		u1.setRrn(123123);
		u1.setAge(20);
		System.out.println("이름 : " + u1.getName() + " 주민번호 : " + u1.getRrn() + " 나이 : " + u1.getAge());
		
		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		
		User[] arr = new User[2];	//2개의 크기인 User(클래스, 객체)배열 선언 
		
		User u2 = new User("김길동", 456456, 30);		//User객체 초기값 
		
		arr[0] = u1;	//0번째 인텍스에 u1클래스 대입
		arr[1] = u2;	//1번째 인텍스에 u1클래스 대입
		//arr[2] = new User("고길동", 789879, 40);
		
		for(User sArr : arr) {	//배열 데이터를 클래스(User)로 했기때문에 데이터 타입은 클래스로 지정 
			System.out.println("이름 : " + sArr.getName());
			System.out.println("주민번호 : " + sArr.getRrn());
			System.out.println("나이 : " + sArr.getAge());
			System.out.println("------------------------");
		}

		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		Scanner scan = new Scanner(System.in);
		
		User[] arr2 = new User[5];

		int i = 1;
		while(i <= 5) {
			User u3 = new User();
			
			System.out.print("이름 > ");
			String name = scan.next();
			u3.setName(name);	//입력받은 값(name)을 u3(User클래스)로 대입
			System.out.print("주민번호 > ");
			int rrn = scan.nextInt();
			u3.setRrn(rrn);		//입력받은 값(rrn)을 u3(User클래스)로 대입
			System.out.print("나이 > ");
			int age = scan.nextInt();
			u3.setAge(age);		//입력받은 값(age)을 u3(User클래스)로 대입
			
			//User u3 = new User(name, rrn, age);	//입력받은 값을 User클래스에 초기화
			//arr2[i] = u;	//arr2배열에 u(User클래스) 대입
			
			for(int j = 0; j < arr2.length; j++) {	//입력받은 값을 User[] arr2에 대입
				arr2[j] = u3;
			}
			System.out.println(Arrays.toString(arr2));
			i++;
		}
		
		
	}
}
