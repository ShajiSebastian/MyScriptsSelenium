package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataDriven {

	@Given("User is on Login page1")
	public void user_is_on_Login_page() {
		System.out.println("Inside Given");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_Username_and_Password(String Username, String Password) {
		System.out.println("User name:" + Username);
		System.out.println("Password:" + Password);
	}
	

}
