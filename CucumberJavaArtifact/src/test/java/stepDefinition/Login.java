package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("User is on Login page22")
	public void user_is_on_Login_page() {
		System.out.println("Inside Given");
	}

	@When("User provides Username22 and Password22")
	public void user_enters_Username_and_Password() {
		System.out.println("Inside when");
	}

	@And("clicks on Login button22")
	public void clicks_on_Login_button() {
		System.out.println("Inside And");
	}

	@Then("user is navigated to Home page22")
	public void user_is_navigated_to_Home_page() {
		System.out.println("Inside Then");
	}

}
