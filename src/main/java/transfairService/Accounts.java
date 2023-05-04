package transfairService;

public class Accounts {
	private int id;
	private int AccountNumber;
	private String AccountName;
	private int balance;
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.AccountNumber = accountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		this.AccountName = accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
