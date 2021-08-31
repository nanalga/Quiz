package quiz03;
/*
 * 1. 멤버변수 - 예금주이름(name:String), 비밀번호(password:String), 잔액(balance : int)로 선언하세요.
 * 2. 생성자 - 3가지 멤버변수 모두 매개값으로 받아 초기화 하는 생성자를 선언하세요.
 * 3. 메서드 - 입금기능 메서드(deposit : void), 출금기능 메서드(withDraw : void), 잔액 조회 메서드(getbalance : int)
 */
public class Account {
	
	String name;
	String password;
	int balance;
	
	Account() {
		
	}
	
	Account(String aName, String aPassword, int aBalance){
		name = aName;
		password = aPassword;
		balance = aBalance;
	}
	
	void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금 후 잔액 : " + balance);
	}
	
	void withDraw(int dMoney) {
		balance -= dMoney;
		System.out.println(dMoney + "원 출금후 잔액 : " + balance);
	}
	
	int getBalance() {
		return balance;
	}

}
