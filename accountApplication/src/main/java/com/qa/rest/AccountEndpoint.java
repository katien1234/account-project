package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.business.service.AccountService;
import com.qa.persistence.domain.Account;

@Path("/account")
public class AccountEndpoint {

	@Inject AccountService service;
	
	@Path("/getAllAccounts")
	@GET
	@Produces({"application/json"})
	public String getAllAccounts() {
		return service.getAllAccounts();
	}
	
	@Path("/addAccount")
	@POST
	@Produces({"application/json"})
	public String addAccount(String account) {
		return service.addAccount(account);
	}
	
	@Path("removeAccountByName")
	@DELETE
	@Produces({"application/json"})
	public String removeAccountByName(String fName) {
		return service.removeAccountByName(fName);
	}
	
	@Path("findAccount")
	@GET
	@Produces({"application/json"})
	public Account findAccount(int id) {
		return service.findAccount(id);
	}
}
