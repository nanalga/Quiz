package quiz08;

public class MainClass {
	public static void main(String[] args) {
		
		SuperSonicAp s = new SuperSonicAp("대한 항공");
		s.takeOff();
		s.fly();
		s.flyMode = 1;
		s.fly();
		s.land();
		System.out.println(s.info());
		

	}
}
