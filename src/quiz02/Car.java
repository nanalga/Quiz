package quiz02;

public class Car {
	String name;
	String company;
	String color;
	int price;
	String grade;
	int speed;
	
	Car() {
	}
	
	Car(String cName,String cCompany, String cColor, int cPrice, String cGrade, int cSpeed){
		name = cName;
		company = cCompany;
		color = cColor;
		price = cPrice;
		grade = cGrade;
		speed = cSpeed;
	}
	
	void info() {
		System.out.println("차 이름 : " + name);
		System.out.println("회사 : " + company);
		System.out.println("차량 색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("등급 : " + grade);
	}
	void speedCamera(int speed) {
		if(speed > 100) {
			System.out.println(name+" 과속입니다.");
		} else {
			System.out.println(name+" 안전속도입니다.");
		}
	}

}
