package deftagging;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class hooksdef {
	
	@Before
	public void setup()
	{
		System.out.println("Launching the Browser");
	}
	
	@After
	public void shutdown()
	{
		System.out.println("Closing the Browser");

	}
	@Given("User in add customer page")
	public void user_in_add_customer_page() {
		System.out.println(" ");
		System.out.println("user in add customer page");
	   	}

	@When("user fills the deatils")
	public void user_fills_the_deatils() {
		System.out.println(" ");
		System.out.println("user fills the details");
	   	}

	@When("user added")
	public void user_added() {
		System.out.println(" ");
		System.out.println("user added");
	}

	@Given("User in edit customer page")
	public void user_in_edit_customer_page() {
		System.out.println(" ");
		System.out.println("user in edit customer page");
	}

	@When("user deatils updates")
	public void user_deatils_updates() {
		System.out.println(" ");
		System.out.println("user updates details");
		
	}
	@When("user updated")
	public void user_updated() {
		System.out.println(" ");
		System.out.println("user updated");
		
		
	}

	@Given("User in delete customer page")
	public void user_in_delete_customer_page() {
		System.out.println(" ");
		System.out.println("user in delete customer page");
	}

	@When("user deletes the deatils")
	public void user_deletes_the_deatils() {
		System.out.println(" ");
		System.out.println("user deletes the details");
	}

	@When("user deleted")
	public void user_deleted() {
		System.out.println(" ");
		System.out.println("user deleted");
	}



}
