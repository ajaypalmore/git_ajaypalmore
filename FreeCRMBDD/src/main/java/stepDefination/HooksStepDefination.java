package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefination {
	
	@Before
	public void stepUp()
	{
		System.out.println("Login to Free CRM");
	}
	
	
	@After
	public void teardown()
	{
		System.out.println("Logout and Close the browser");
	}
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_oage() throws Throwable {
		System.out.println("user is on deal page");
	}
	
	@When("^user fills the deals form$")
	public void user_fills_the_deals_form() throws Throwable {
		System.out.println("create a deal");
	}
	
	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
		System.out.println("deal is created");
	}
	
	
	@Given("^user is on contact page$")
	public void user_is_on_contact_page() throws Throwable {
	  
	}

	@When("^user fills the contact form$")
	public void user_fills_the_contact_form() throws Throwable {
	   
	}

	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
	   
	}
}
