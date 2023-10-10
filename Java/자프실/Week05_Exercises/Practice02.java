
class BankAccount {
	private String owner;
	private int accountNumber;
	private int balance=0;
	
	BankAccount(){};
	
	BankAccount(String owner, int accountNumber) {
		setOwner(owner);
		setAccountNumber(accountNumber);
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	/*public void setBalance(int balance) {
		this.balance = balance;
	}*/
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
}

public class Practice02 {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("KIM", 1234);
		ba.deposit(10000);
		System.out.println("현재 잔액은 "+ba.getBalance()+"입니다.");
		ba.withdraw(8000);
		System.out.println("현재 잔액은 "+ba.getBalance()+"입니다.");
	}

}
