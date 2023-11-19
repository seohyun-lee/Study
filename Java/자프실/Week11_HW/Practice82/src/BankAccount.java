
public class BankAccount {
	
	private String owner = "¸ð¸§";
	private int balance = -1;

	public BankAccount() {}
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String toString() {
		return owner+"\t"+balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw (int money) {
		balance -= money;
	}
}
