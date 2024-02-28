package stepDefinitions;

import Factory.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CarLoan;

public class carLoanStep {
	
	CarLoan car;
	@Given("the user navigates to carloan page")
	public void the_user_navigates_to_carloan_page() {
		 car = new CarLoan(BaseClass1.getDriver());
	}

	@When("user enter the values in all search boxes")
	public void user_enter_the_values_in_all_search_boxes() {
		car.carloan();
		car.enteramt();
		car.enterint();
	}

	@When("user clicks month icon")
	public void user_clicks_month_icon() {
		car.entertu();
		car.escheme();
		car.pa();
		
	}

	@Then("user should print Loan EMI")
	public void user_should_print_loan_emi() {
		car.oneyamt();
		System.out.println("₹" + car.oneyamt());
		car.escheme();
		car.month();
		car.monthbox();
		car.escheme();
		car.onemamtintrest();
		System.out.println("₹"+car.onemamtintrest());
		car.priamt();
		int y=Integer.parseInt(car.priamt().replaceAll(",",""))-Integer.parseInt(car.onemamtintrest().replaceAll(",",""));
		 System.out.println("₹"+y);
	}




}
