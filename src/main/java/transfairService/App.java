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
		transfair.setAmount(174);
		transfair.setToAccountId(3);

		dataAccess.addTransfair(transfair);

		 //dataAccess.addTransfair(transfair);

		
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
