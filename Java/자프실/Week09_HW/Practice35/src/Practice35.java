
public class Practice35 {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		ba1.name = "김상식";
		ba1.accoutNo = "1234-5678";
		ba1.balance = 100;
		ba1.rate = 0.0;
		ba2.name = "홍길동";
		ba2.accoutNo = "9999-2531";
		ba2.balance = 2000;
		ba2.rate = 2.15;
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+ba1.name);
		System.out.println("계좌 번호: "+ba1.accoutNo);
		System.out.println("잔액: "+ba1.balance+"원");
		System.out.println("이자율: "+ba1.rate+"%");
		System.out.println();
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: "+ba2.name);
		System.out.println("계좌 번호: "+ba2.accoutNo);
		System.out.println("잔액: "+ba2.balance+"원");
		System.out.println("이자율: "+ba2.rate+"%");
	}

}
