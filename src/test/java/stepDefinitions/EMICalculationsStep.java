package stepDefinitions;

import Factory.BaseClass1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CarLoan;
import pageObjects.EmiCalculation;

public class EMICalculationsStep {
	
	EmiCalculation emi;
	
	@Given("the user navigates to the EMILoan page")
	public void the_user_navigates_to_the_emi_loan_page() {
		
		 emi = new EmiCalculation(BaseClass1.getDriver());
	}

	@When("user checks the checkboxes and sliders are working")
	public void user_checks_the_checkboxes_and_sliders_are_working() {
		
		 emi.loancalc();
		 
		 emi.validation_1();
		 
		 System.out.println( emi.scalechange());
		 
		 emi.validation1();
		 
		 System.out.println(emi.scalechange1());
	}

	@Then("user checks the year and month checkboxes are working")
	public void user_checks_the_year_and_month_checkboxes_are_working() {
		
		emi.validation_2();
		 
		 System.out.println(emi.scalechange2());
		 
		 emi.validation2();
		 
		 System.out.println(emi.scalechange_2());
	}

	@Then("user checks the year and month sliders are working")
	public void user_checks_the_year_and_month_sliders_are_working() {
		
		 if(emi.scalechange().equalsIgnoreCase(emi.scalechange1())) {
			 System.out.println("slider validation 1 failed");
		 }
		 else {
			 System.out.println("Slider validation 1 successful");
		 }
		 
		 
		 if(emi.scalechange2().equalsIgnoreCase(emi.scalechange_2())) {
			 System.out.println("slider validation 2 failed");
		 }
		 else {
			 System.out.println("Slider validation 2 successful");
		 } 
		 
	}


}
