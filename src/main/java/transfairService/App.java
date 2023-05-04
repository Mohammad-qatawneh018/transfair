package transfairService;

import javax.xml.crypto.Data;

import com.jk.core.util.JK;

public class App {

	public static void main(String[] args) {

		Accounts account = new Accounts();
		Accounts account1 = new Accounts();
		Accounts account2 = new Accounts();
		Transfairs transfair = new Transfairs();

		TransfairDataAccess dataAccess = new TransfairDataAccess();

		// setting account
		/*
		 * account.setAccountName("Mohammad"); account.setAccountNumber(123);
		 * account.setBalance(100);
		 * 
		 * account1.setAccountName("khalid"); account1.setAccountNumber(456);
		 * account1.setBalance(188);
		 * 
		 * account2.setAccountName("ali"); account2.setAccountNumber(789);
		 * account2.setBalance(50);
		 * 
		 * //adding accounts to database dataAccess.addAccount(account);
		 * dataAccess.addAccount(account1); dataAccess.addAccount(account2);
		 * 
		 */

		transfair.setAmount(174);
		transfair.setToAccountId(3);

		dataAccess.addTransfair(transfair);

		// dataAccess.addTransfair(transfair);

		System.out.println("accounts");
		for (Accounts acc : dataAccess.getAccounts()) {
			JK.print(acc);

		}

		System.out.println("transfairs");
		for (Transfairs acc : dataAccess.getTransfairs()) {
			JK.print(acc);

		}

	}

}
