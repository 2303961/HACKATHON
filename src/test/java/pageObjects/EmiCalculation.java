package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class EmiCalculation extends BasePage {
      
    public EmiCalculation(WebDriver driver) {
		super(driver);
	}
    
	@FindBy(xpath="//*[@id='menu-item-dropdown-2696']")
  	WebElement calculators;
      
    @FindBy(xpath="//*[@id='menu-item-2423']/a")
  	WebElement loancalc;
  	
  	@FindBy(xpath="//*[@id='emi-calc']/a[1]")
  	WebElement emicalc;
  	
  	@FindBy(xpath="//input[@value='10,00,000']")
  	WebElement emi_s1;
  	
  	@FindBy(xpath="//input[@value='10.75']")
  	WebElement emi_s2;
  	
  	@FindBy(xpath="//input[@value='5']")
  	WebElement emi_s3;
  	
  	@FindBy(xpath="//input[@value='10,000']")
  	WebElement emi_s4;
  	
  	@FindBy(xpath="//div[@id='loanamountslider']")
  	WebElement emi_sl1;
  	
  	@FindBy(xpath="//div[@id='loaninterestslider']")
  	WebElement emi_sl2;
  	
  	@FindBy(xpath="//div[@id='loantermslider']")
  	WebElement emi_sl3;
  	
  	@FindBy(xpath="//div[@id='loanfeesslider']")
  	WebElement emi_sl4;
  	
  	@FindBy(xpath="//a[text()='Loan Amount ']")
  	WebElement loanamountcalc;
  	
  	@FindBy(xpath="//input[@value='21,617.95']")
  	WebElement loanamt_s1;
  	
  	@FindBy(xpath="//input[@value='10.75']")
  	WebElement loanamt_s2;
  	
  	@FindBy(xpath="//input[@value='5']")
  	WebElement loanamt_s3;
  	
  	@FindBy(xpath="//input[@value='10,000']")
  	WebElement loanamt_s4;
  	
  	@FindBy(xpath="//div[@id='loanemislider']")
  	WebElement loanamt_sl1;
  	
  	@FindBy(xpath="//div[@id='loaninterestslider']")
  	WebElement loanamt_sl2;
  	
  	@FindBy(xpath="//div[@id='loantermslider']")
  	WebElement loanamt_sl3;
  	
  	@FindBy(xpath="//div[@id='loanfeesslider']")
  	WebElement loanamt_sl4;
  	
  	@FindBy(xpath="//*[@id='loan-tenure-calc']/a[1]")
  	WebElement loantcalc;
  	
  	@FindBy(xpath="//input[@value='10,00,000']")
  	WebElement loant_s1;
  	
  	@FindBy(xpath="//input[@value='21,617.95']")
  	WebElement loant_s2;
  	
  	@FindBy(xpath="//input[@value='10.75']")
  	WebElement loant_s3;
  	
  	@FindBy(xpath="//input[@value='10,000']")
  	WebElement loant_s4;
  	
  	@FindBy(xpath="//div[@id='loanamountslider']")
  	WebElement loant_sl1;
  	
  	@FindBy(xpath="//div[@id='loanemislider']")
  	WebElement loant_sl2;
  	
  	@FindBy(xpath="//div[@id='loaninterestslider']")
  	WebElement loant_sl3;
  	
  	@FindBy(xpath="//div[@id='loanfeesslider']")
  	WebElement loant_sl4;
  	
  	@FindBy(xpath="(//*[text()='5'])[2]")
  	WebElement scalechange;
  	
  	@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[2]")
  	WebElement monthforscale;
  	
  	@FindBy(xpath="(//*[text()='60'])[1]")
  	WebElement scalechange_m;
  	
  	@FindBy(xpath="//*[@id='ltermwrapper']/div[1]/div/div/div/div/div/label[1]")
  	WebElement yearforscale;
  	
  	@FindBy(xpath="//*[@id='emi-calc']/a[1]")
  	WebElement emi_calculator;
  	
  	
  	public void loancalc() {
  		calculators.click();
  		loancalc.click();
  		emicalc.click();
  		
  		if(emi_s1.isEnabled()) {
  			System.out.println("Enabled 1");
  		}
  		
  		if(emi_sl1.isEnabled()) {
  			System.out.println("slide Enabled 1");
  		}
  		
  		if(emi_s2.isEnabled()) {
  			System.out.println("Enabled 2");
  		}
  		if(emi_sl2.isEnabled()) {
  			System.out.println("slide Enabled 2");
  		}
  		
  		if(emi_s3.isEnabled()) {
  			System.out.println("Enabled 3");
  		}
  		if(emi_sl3.isEnabled()) {
  			System.out.println("slide Enabled 3");
  		}
  		if(emi_s4.isEnabled()) {
  			System.out.println("Enabled 4");
  		}
  		if(emi_sl4.isEnabled()) {
  			System.out.println("slide Enabled 4");
  		}
  		
  		loanamountcalc.click();
  		
  		if(loanamt_s1.isEnabled()) {
  			System.out.println("Enabled 5");
  		}
  		
  		if(loanamt_sl1.isEnabled()) {
  			System.out.println("Slide Enabled 5");
  		}
  		
  		if(loanamt_s2.isEnabled()) {
  			System.out.println("Enabled 6");
  		}
  		
  		if(loanamt_sl2.isEnabled()) {
  			System.out.println("Slide Enabled 6");
  		}
  		
  		if(loanamt_s3.isEnabled()) {
  			System.out.println("Enabled 7");
  		}
  		
  		if(loanamt_sl3.isEnabled()) {
  			System.out.println("Slide Enabled 7");
  		}
  		
  		if(loanamt_s4.isEnabled()) {
  			System.out.println("Enabled 8");
  		}
  		
  		if(loanamt_sl4.isEnabled()) {
  			System.out.println("Slide Enabled 8");
  		}
  		loantcalc.click();
  		
  		if(loant_s1.isEnabled()) {
  			System.out.println("Enabled 9");
  		}
  		
  		if(loant_sl1.isEnabled()) {
  			System.out.println("Slide Enabled 9");
  		}
  		
  		if(loant_s2.isEnabled()) {
  			System.out.println("Enabled 10");
  		}
  		
  		if(loant_sl2.isEnabled()) {
  			System.out.println("Slide Enabled 10");
  		}
  		
  		if(loant_s3.isEnabled()) {
  			System.out.println("Enabled 11");
  		}
  		
  		if(loant_sl3.isEnabled()) {
  			System.out.println("Slide Enabled 11");
  		}
  		
  		if(loant_s4.isEnabled()) {
  			System.out.println("Enabled 12");
  		}
  		
  		if(loant_sl4.isEnabled()) {
  			System.out.println("Slide Enabled 12");
  		}}
  		
  		public void validation_1() {
  			
  			emi_calculator.click();
  			
  		}
  		public String scalechange() {
  			
  			String str = scalechange.getText();
  			return str;
  		}
  	     public void validation1() {
  			
  			monthforscale.click();
  			
  			
  		}
  	     public String scalechange1() {
  	 		
  	 		String str = scalechange_m.getText();
  	 		return str;
  	 	}
  	     public void validation_2() {
  	 		
  	 		loanamountcalc.click();
  	 		
  	 	}
  	     public String scalechange2() {
  	  		
  	  		String str = scalechange_m.getText();
  	  		return str;
  	  	}
  	     public void validation2() {
  	  		
  	  		yearforscale.click();
  	  		
  	  	}
  	     public String scalechange_2() {
  	 		
  	 		String str = scalechange.getText();
  	 		return str;
  	 	}
}
