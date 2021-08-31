package quiz05;

public class Calculator {
	int result = 0;
	double pi = 3.14;
	
	int add(int aNum) {
		result += aNum;
		return result;
	}
	
	int sub(int sNum) {
		result -= sNum;
		return result;
	}
	
	double circle(int cNum) {
		//(원의 반지름) X (원의 반지름) X (원주율)
		return cNum * cNum * pi;
	}

}

