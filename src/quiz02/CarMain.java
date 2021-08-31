package quiz02;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "xc90";
		c1.company = "볼보";
		c1.color = "흰색";
		c1.price = 100000000;
		c1.grade = "VIP";
		c1.speed = 200;
		
		c1.info();
		
		System.out.println("----------------");
		
		Car c2 = new Car("S class", "벤츠", "검정", 10000000, "vip", 200);
		c2.info();

		c2.speedCamera(150);
	}

}
