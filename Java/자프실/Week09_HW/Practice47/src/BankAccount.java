
public class BankAccount {
	private String name, accoutNo;
	private int balance;
	private double rate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccoutNo() {
		return accoutNo;
	}

	public void setAccoutNo(String accoutNo) {
		this.accoutNo = accoutNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String toString() {
		return "첫 번째 은행 계좌의 정보입니다.\n"+"이름: "+this.name+"\n계좌 번호: "
				+this.accoutNo+"\n잔액: "+this.balance+"원"+"\n이자율: "+this.rate+"%"+"\n이자: "+this.calcInterest()+"원";
	}

	private int calcInterest() {
		return (int)(this.getBalance() * this.getRate() / 100);
	}
}
