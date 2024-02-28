package stepDefinitions;

import java.io.IOException;

import Factory.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CarLoan;
import pageObjects.HomeLoan;

public class HomeLoanStep {
	HomeLoan home;
	@Given("the user navigates to Homeloan page")
	public void the_user_navigates_to_homeloan_page() {
		home = new HomeLoan(BaseClass1.getDriver());
	}

	@When("user enter the values in search boxes")
	public void user_enter_the_values_in_search_boxes() throws InterruptedException {
		
		home.calc();
		
		
		
	}

	@Then("user should print a table")
	public void user_should_print_a_table() throws IOException, InterruptedException {
		
		System.out.println(home.table());
		home.storingExceldatas();
	}



}
