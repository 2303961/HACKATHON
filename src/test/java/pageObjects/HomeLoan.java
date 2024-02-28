package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utilities.utility_file;

public class HomeLoan extends BasePage {
  
  public HomeLoan(WebDriver driver) {
		super(driver);
	}
  
  @FindBy(xpath="//*[@id='menu-item-dropdown-2696']")
	WebElement calculators;
	
  @FindBy(xpath="//*[@id='menu-item-3294']/a")
  WebElement homeloan;
	
	@FindBy(xpath="//*[@tabindex='1']")
	WebElement homevalue;

	
	@FindBy(xpath="//*[@tabindex='2']")
	WebElement marigin;
	
	@FindBy(xpath="//*[@tabindex='5']")
	WebElement loaninsurance;
	
	/*@FindBy(xpath="//*[@tabindex='6']")
	WebElement loanamount;*/
	
	@FindBy(xpath="//*[@tabindex='7']")
	WebElement intrestrate;
	
	@FindBy(xpath="//*[@tabindex='8']")
	WebElement loantenure;
	
	@FindBy(xpath="//*[@tabindex='11']")
	WebElement loanfees;
	
	@FindBy(xpath="//*[@tabindex='14']")
	WebElement startyear;
	
	@FindBy(xpath="//span[text()='Mar']")
	WebElement boxmonth;
	
	@FindBy(xpath="//*[@tabindex='15']")
	WebElement onetimeexpense;
	
	@FindBy(xpath="//*[@tabindex='18']")
	WebElement propertytax;
	
	@FindBy(xpath="//*[@tabindex='21']")
	WebElement homeinsurance;
	
	@FindBy(xpath="//*[@tabindex='24']")
	WebElement maintenance;
	
	
	
	@FindBy(xpath="//table[@class='noextras']/tbody")
	WebElement table;
	
	@FindBy(xpath = "//table[@class='noextras']/tbody/tr")
	List<WebElement> rowsize;
	
	public void calc() throws InterruptedException {
		
		calculators.click();
		homeloan.click(); 
		Thread.sleep(10000);		
		homevalue.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1500000");
		marigin.sendKeys(Keys.chord(Keys.CONTROL,"a"),"10");
		loaninsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");;
		intrestrate.sendKeys(Keys.chord(Keys.CONTROL,"a"),"9.5");;
		loantenure.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
		loanfees.sendKeys(Keys.chord(Keys.CONTROL,"a"),"0.3");
		startyear.click();
		boxmonth.click();
		onetimeexpense.sendKeys(Keys.chord(Keys.CONTROL,"a"),"20");
		propertytax.sendKeys(Keys.chord(Keys.CONTROL,"a"),"0.3");
		homeinsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"),"0.1");
		maintenance.sendKeys(Keys.chord(Keys.CONTROL,"a"),"3000");
		table.click();
		
	}

	public String table() throws IOException {
		
		String str = table.getText();
		return str;
	}
	
	 public  void storingExceldatas() throws IOException, InterruptedException  {
		 //Writes only the rows in the  table
		 utility_file.write("Sheet1", 0, 0,"Year");
		 utility_file.write("Sheet1", 0, 1,"Principal");
		 utility_file.write("Sheet1", 0, 2,"Interest");
		 utility_file.write("Sheet1", 0, 3,"Taxes, Home Insurance & Maintenance (C)");
		 utility_file.write("Sheet1", 0, 4,"Total Payment ");
		 utility_file.write("Sheet1", 0, 5,"Balance");
		 utility_file.write("Sheet1", 0, 6,"Loan Paid To Date");
		 
		 Thread.sleep(10000);
		 
		 int sizeOfrows=rowsize.size();
		 for( int r=2,p=1;r<=sizeOfrows;r=r+2,p++) {
			String Year= table.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
			String Principal= table.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
			String Interest= table.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
			String Taxes= table.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
			String Total_Payment= table.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
			String Balance= table.findElement(By.xpath("tr["+r+"]/td[6]")).getText();
			String Loan=table.findElement(By.xpath("tr["+r+"]/td[7]")).getText();
			
			 utility_file.write("Sheet1",p , 0,Year );
			 utility_file.write("Sheet1",p , 1,Principal );
			 utility_file.write("Sheet1",p , 2,Interest );
			 utility_file.write("Sheet1",p , 3,Taxes );
			 utility_file.write("Sheet1",p , 4,Total_Payment );
			 utility_file.write("Sheet1",p , 5,Balance );
			 utility_file.write("Sheet1",p , 6,Loan);
		 }

	 }
	
}
