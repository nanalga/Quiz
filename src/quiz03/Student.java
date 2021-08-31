package quiz03;
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
public class Student {
	
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {

	}
	
	Student(String na, int n, int k, int e, int m){
		name = na;
		no = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	double getTotal() {
		return kor + eng + math;
	}
	
//	int getTotal2(int k, int e, int m) {
//		
//		return k + e + m;
//	}
	
	double getAvg() {
		double avg = (int)(getTotal() / 3 * 100) / 100.0;
		return avg;
	}

	
	
	

}
