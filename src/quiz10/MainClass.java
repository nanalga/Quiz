package quiz10;

public class MainClass {
	public static void main(String[] args) {
		
		Computer c = new Computer();
		
		c.computerInfo();
		
		Monitor m = c.getMonitor();	//방법1
		m.info();
		c.getMonitor().info();	//방법2
		
		KeyBoard k = c.getKeyboard();
		k.info();
		c.getKeyboard().info();
		
		Mouse ms = c.getMouse();
		ms.info();
		c.getMouse().info();
		
		KeyBoard ks = new KeyBoard();
		c.setKeyboard(ks);
		c.setKeyboard(new KeyBoard());
		
	
		
	}

}
