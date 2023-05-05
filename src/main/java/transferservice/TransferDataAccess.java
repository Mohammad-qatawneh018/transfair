package transferservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.jk.data.dataaccess.JKDataAccessFactory;
import com.jk.data.dataaccess.core.JKDataAccessService;

public class TransferDataAccess {
	JKDataAccessService dataAccess = JKDataAccessFactory.getDataAccessService();

	public void addAccount(Accounts account) {

		String sql = "insert into accounts (AccountNumber,AccountName,balance)values(?,?,?)";
		dataAccess.execute(sql, account.getAccountNumber(), account.getAccountName(), account.getBalance());

	}

	public Accounts populateAccounts(ResultSet rs) throws SQLException {
		Accounts accounts = new Accounts();

		accounts.setId((Integer) rs.getInt("accountId"));
		accounts.setAccountNumber((Integer) rs.getInt("accountNumber"));
		accounts.setAccountName((String) rs.getString("accountName"));
		accounts.setBalance((Integer) rs.getInt("balance"));

		return accounts;
	}

	public List<Accounts> getAccounts() {
		return dataAccess.getList("select * from accounts;", this::populateAccounts);

	}

	public void addTransfair(Transfers transfair) {

		dataAccess.execute("insert into transfairs(to_account_id,amount) values(?,?)",
				transfair.getToAccountId(), transfair.getAmount());

	}

	public List<Transfers> getTransfairs() {

		return dataAccess.getList("select * from transfairs", this::populateTransfair);
	}

	public Transfers populateTransfair(ResultSet rs) throws SQLException {
		Transfers transfair = new Transfers();

		transfair.setId((Integer) rs.getInt("transfair_id"));
		transfair.setToAccountId((Integer) rs.getInt("to_account_id"));
		transfair.setAmount((Integer) rs.getInt("amount"));

		return transfair;
	}

}
