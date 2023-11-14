
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
		return "ù ��° ���� ������ �����Դϴ�.\n"+"�̸�: "+this.name+"\n���� ��ȣ: "
				+this.accoutNo+"\n�ܾ�: "+this.balance+"��"+"\n������: "+this.rate+"%"+"\n����: "+this.calcInterest()+"��";
	}

	private int calcInterest() {
		return (int)(this.getBalance() * this.getRate() / 100);
	}
}
