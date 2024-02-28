package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CarLoan extends BasePage  {
	
	
	public CarLoan(WebDriver driver) {
		super(driver);
	}
  
  
	  @FindBy(xpath="//*[@id='car-loan']/a")
		WebElement carloan;
		
		@FindBy(xpath="//*[@id='loanamount']")  
		WebElement enteramt;
		
		@FindBy(xpath="//*[@id=\'loaninterest\']")
		WebElement enterint;
		
		@FindBy(xpath="//*[@id='loanterm']")
		WebElement entertu;
		
		@FindBy(xpath="//*[@id='leschemewrapper']/div/label")
		WebElement escheme;
		
		//@FindBy(xpath="//*[@class='highcharts-legend-item highcharts-pie-series highcharts-color-0']")
		//WebElement pa;
		
		@FindBy(xpath="//span[text()='1,31,525']")
		WebElement oneyamt;
		
		@FindBy(xpath="//*[@id=\'emipaymentscheduleheader\']/div[1]/div/div/span")//*[@class='col-md-4 col-lg-5 control-label']
		WebElement pa;
		
		@FindBy(xpath="//*[@id='emicalculatorinnerform']/div[7]/div/div/div/div/div/label[2]")
		WebElement month;
		
		@FindBy(xpath="//*[@id='loanterm']")
		WebElement monthbox;
		
		@FindBy(xpath="//span[text()='11,875']")
		WebElement onemamtintrest;
		
		@FindBy(xpath="//*[@id=\'emiamount\']/p/span")
		WebElement priamt;
		
		public void carloan() {
			
			//j.executeScript("arguments[0].scrollIntoView();",carloan);
			carloan.click();
			
		  }
		public void enteramt() {
			enteramt.clear();
			enteramt.sendKeys("1500000");
		}
		public void enterint() {
			
			enterint.clear();
			enterint.sendKeys(".5");
		}

		public void entertu() {
			
			entertu.clear();
			
		}
		public void escheme() {
			
			escheme.click();
			//escheme.getText();
			//j.executeScript("arguments[0].scrollIntoView();",escheme);//*[@id='emitotalamount']/h4
		}

		public void pa() {
			
			pa.click();
			
		}
		public String oneyamt() {
			
			String str = oneyamt.getText();
			return str;
		}
		public void month() {
			
			month.click();
		}
		public void monthbox() {
			
			monthbox.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
		}
		public String onemamtintrest() {
			
			String str = onemamtintrest.getText();
			return str;
		}
		public String priamt() {
			
			String str = priamt.getText();
			return str;
		}
  }

