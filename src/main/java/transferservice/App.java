package transferservice;

import com.jk.services.server.JKServiceConfig;
import com.jk.web.embedded.JKWebApplication;

import jakarta.ws.rs.ApplicationPath;
@ApplicationPath("transfer")
public class App extends JKServiceConfig  {

	public static void main(String[] args) {

		JKWebApplication.run(8080, false);
		/*
		 * Accounts account = new Accounts(); Accounts account1 = new Accounts();
		 * Accounts account2 = new Accounts(); Transfers transfair = new Transfers();
		 * 
		 * TransferDataAccess dataAccess = new TransferDataAccess();
		 * 
		 * // setting account /* account.setAccountName("Mohammad");
		 * account.setAccountNumber(123); account.setBalance(100);
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
		 * 
		 * 
		 * transfair.setAmount(174); transfair.setToAccountId(3);
		 * 
		 * dataAccess.addTransfair(transfair);
		 * 
		 * // dataAccess.addTransfair(transfair);
		 * 
		 * System.out.println("accounts"); for (Accounts acc : dataAccess.getAccounts())
		 * { JK.print(acc);
		 * 
		 * }
		 * 
		 * System.out.println("transfairs"); for (Transfers acc :
		 * dataAccess.getTransfairs()) { JK.print(acc);
		 * 
		 * }
		 */
	}

}
