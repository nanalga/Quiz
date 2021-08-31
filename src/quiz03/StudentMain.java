package quiz03;

import java.util.Scanner;

/*
 * 멤버변수
 * name - 학생이름
 * no - 학생번호
 * kor - 국어점수
 * eng - 영어점수
 * math - 수학점수
 * 
 * 생성자
 * 멤버변수 5개를 초기화 하는 생성자
 * 
 * getTotal() - 국어, 영어, 수학점수를 모두 더해서 합계반환
 * getAvg() - 총점을 나눈 평균을 반환 (단, 소수점 2자리까지)
 * 
 * main에서는 학생의 2명을 각각 생성하고 두 학생의 평균합을 출력하세요
 */
public class StudentMain {
	public static void main(String[] args) {
		Student st = new Student("홍길동", 1, 67, 88, 99);
		Student st2 = new Student("고길동", 2, 17, 58, 79);
		
		System.out.println("평균합 : " + (st.getAvg()+st2.getAvg()));
		
		System.out.println("----------------------------");
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("이름 입력>");
//		String name = scan.next();
//		System.out.print("번호 입력>");
//		int num = scan.nextInt();
//		
//		Student st2 = new Student(name, num, 0, 0, 0);
//		
//		System.out.print("국어점수 입력>");
//		int kor = scan.nextInt();
//		System.out.print("영어점수 입력>");
//		int eng = scan.nextInt();
//		System.out.print("수학점수 입력>");
//		int math = scan.nextInt();
//		
//		int total2 = st2.getTotal2(kor, eng, math);
//		System.out.println(st.name + "의 st2 총합 : " + total2);
//		
//		double avg2 = st2.getAvg();
//		System.out.println(st.name + "의 st2 평균 : " + avg2);
	}

}
