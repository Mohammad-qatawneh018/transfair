package transferservice;

import java.util.List;

import com.jk.core.util.JK;
import com.jk.services.server.JKAbstractRestController;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/accounts")
public class Controller extends JKAbstractRestController {

	TransferDataAccess dataAccess = new TransferDataAccess();
	List<Accounts> accountsList;
	List<Transfers> transfersList;

	@GET
	public Response getAllAccounts() {

		accountsList = dataAccess.getAccounts();
		JK.print(accountsList);
		return Response.status(200).entity(accountsList).build();
	}

	@POST
	public Response addAccount(Accounts account) {
		dataAccess.addAccount(account);
		return Response.status(201).entity(account).build();
	}

	@GET
	@Path("/transfers")
	public Response getAllTransfers() {
		transfersList = dataAccess.getTransfairs();
		return Response.status(201).entity(transfersList).build();
	}

	@POST
	@Path("/transfers")
	public Response addTransfers(Transfers transfer) {
		dataAccess.addTransfair(transfer);
		return Response.status(201).entity(transfer).build();
	}

}
