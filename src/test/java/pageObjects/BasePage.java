package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.utility_file;


public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
//	
//	@FindBy(xpath="//*[@id='car-loan']/a")
//	WebElement carloan;
//	
//	@FindBy(xpath="//*[@id='loanamount']")  
//	WebElement enteramt;
//	
//	@FindBy(xpath="//*[@id=\'loaninterest\']")
//	WebElement enterint;
//	
//	@FindBy(xpath="//*[@id='loanterm']")
//	WebElement entertu;
//	
//	@FindBy(xpath="//*[@id='leschemewrapper']/div/label")
//	WebElement escheme;
//	
//	//@FindBy(xpath="//*[@class='highcharts-legend-item highcharts-pie-series highcharts-color-0']")
//	//WebElement pa;
//	
//	@FindBy(xpath="//span[text()='1,31,525']")
//	WebElement oneyamt;
//	
//	@FindBy(xpath="//*[@id=\'emipaymentscheduleheader\']/div[1]/div/div/span")//*[@class='col-md-4 col-lg-5 control-label']
//	WebElement pa;
//	
//	@FindBy(xpath="//*[@id='emicalculatorinnerform']/div[7]/div/div/div/div/div/label[2]")
//	WebElement month;
//	
//	@FindBy(xpath="//*[@id='loanterm']")
//	WebElement monthbox;
//	
//	@FindBy(xpath="//span[text()='11,875']")
//	WebElement onemamtintrest;
//	
//	@FindBy(xpath="//*[@id=\'emiamount\']/p/span")
//	WebElement priamt;
//	
//	@FindBy(xpath="//*[@id='menu-item-dropdown-2696']")
//	WebElement calculators;
//	
//    @FindBy(xpath="//*[@id='menu-item-3294']/a")
//    WebElement homeloan;
//	
//	@FindBy(xpath="//*[@tabindex='1']")
//	WebElement homevalue;
//;
//	
//	@FindBy(xpath="//*[@tabindex='2']")
//	WebElement marigin;
//	
//	@FindBy(xpath="//*[@tabindex='5']")
//	WebElement loaninsurance;
//	
//	/*@FindBy(xpath="//*[@tabindex='6']")
//	WebElement loanamount;*/
//	
//	@FindBy(xpath="//*[@tabindex='7']")
//	WebElement intrestrate;
//	
//	@FindBy(xpath="//*[@tabindex='8']")
//	WebElement loantenure;
//	
//	@FindBy(xpath="//*[@tabindex='11']")
//	WebElement loanfees;
//	
//	@FindBy(xpath="//*[@tabindex='14']")
//	WebElement startyear;
//	
//	@FindBy(xpath="//span[text()='Mar']")
//	WebElement boxmonth;
//	
//	@FindBy(xpath="//*[@tabindex='15']")
//	WebElement onetimeexpense;
//	
//	@FindBy(xpath="//*[@tabindex='18']")
//	WebElement propertytax;
//	
//	@FindBy(xpath="//*[@tabindex='21']")
//	WebElement homeinsurance;
//	
//	@FindBy(xpath="//*[@tabindex='24']")
//	WebElement maintenance;
//	
//	
//	
//	@FindBy(xpath="//table[@class='noextras']/tbody")
//	WebElement table;
//	
//	@FindBy(xpath = "//table[@class='noextras']/tbody/tr")
//	List<WebElement> rowsize;
//	
//	
//	@FindBy(xpath="//*[@id='menu-item-2423']/a")
//	WebElement loancalc;
//	
//	@FindBy(xpath="//*[@id='emi-calc']/a[1]")
//	WebElement emicalc;
//	
//	@FindBy(xpath="//input[@value='10,00,000']")
//	WebElement emi_s1;
//	
//	@FindBy(xpath="//input[@value='10.75']")
//	WebElement emi_s2;
//	
//	@FindBy(xpath="//input[@value='5']")
//	WebElement emi_s3;
//	
//	@FindBy(xpath="//input[@value='10,000']")
//	WebElement emi_s4;
//	
//	@FindBy(xpath="//div[@id='loanamountslider']")
//	WebElement emi_sl1;
//	
//	@FindBy(xpath="//div[@id='loaninterestslider']")
//	WebElement emi_sl2;
//	
//	@FindBy(xpath="//div[@id='loantermslider']")
//	WebElement emi_sl3;
//	
//	@FindBy(xpath="//div[@id='loanfeesslider']")
//	WebElement emi_sl4;
//	
//	@FindBy(xpath="//a[text()='Loan Amount ']")
//	WebElement loanamountcalc;
//	
//	@FindBy(xpath="//input[@value='21,617.95']")
//	WebElement loanamt_s1;
//	
//	@FindBy(xpath="//input[@value='10.75']")
//	WebElement loanamt_s2;
//	
//	@FindBy(xpath="//input[@value='5']")
//	WebElement loanamt_s3;
//	
//	@FindBy(xpath="//input[@value='10,000']")
//	WebElement loanamt_s4;
//	
//	@FindBy(xpath="//div[@id='loanemislider']")
//	WebElement loanamt_sl1;
//	
//	@FindBy(xpath="//div[@id='loaninterestslider']")
//	WebElement loanamt_sl2;
//	
//	@FindBy(xpath="//div[@id='loantermslider']")
//	WebElement loanamt_sl3;
//	
//	@FindBy(xpath="//div[@id='loanfeesslider']")
//	WebElement loanamt_sl4;
//	
//	@FindBy(xpath="//*[@id='loan-tenure-calc']/a[1]")
//	WebElement loantcalc;
//	
//	@FindBy(xpath="//input[@value='10,00,000']")
//	WebElement loant_s1;
//	
//	@FindBy(xpath="//input[@value='21,617.95']")
//	WebElement loant_s2;
//	
//	@FindBy(xpath="//input[@value='10.75']")
//	WebElement loant_s3;
//	
//
//	@FindBy(xpath="//input[@value='10,000']")
//	WebElement loant_s4;
//	
//	@FindBy(xpath="//div[@id='loanamountslider']")
//	WebElement loant_sl1;
//	
//	@FindBy(xpath="//div[@id='loanemislider']")
//	WebElement loant_sl2;
//	
//	@FindBy(xpath="//div[@id='loaninterestslider']")
//	WebElement loant_sl3;
//	
//	@FindBy(xpath="//div[@id='loanfeesslider']")
//	WebElement loant_sl4;
//	
//	@FindBy(xpath="(//*[text()='5'])[2]")
//	WebElement scalechange;
//	
//	@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[2]")
//	WebElement monthforscale;
//	
//	@FindBy(xpath="(//*[text()='60'])[1]")
//	WebElement scalechange_m;
//	
//	@FindBy(xpath="//*[@id='ltermwrapper']/div[1]/div/div/div/div/div/label[1]")
//	WebElement yearforscale;
//	
//	@FindBy(xpath="//*[@id='emi-calc']/a[1]")
//	WebElement emi_calculator;
//	
//	
//	
//	
//	
//	JavascriptExecutor j = (JavascriptExecutor)driver;
//  
//	
//public void carloan() {
//	
//	//j.executeScript("arguments[0].scrollIntoView();",carloan);
//	carloan.click();
//	
//  }
//public void enteramt() {
//	enteramt.clear();
//	enteramt.sendKeys("1500000");
//}
//public void enterint() {
//	
//	enterint.clear();
//	enterint.sendKeys(".5");
//}
//
//public void entertu() {
//	
//	entertu.clear();
//	
//}
//public void escheme() {
//	
//	escheme.click();
//	//escheme.getText();
//	//j.executeScript("arguments[0].scrollIntoView();",escheme);//*[@id='emitotalamount']/h4
//}
//
//public void pa() {
//	
//	pa.click();
//	
//}
//public String oneyamt() {
//	
//	String str = oneyamt.getText();
//	return str;
//}
//public void month() {
//	
//	month.click();
//}
//public void monthbox() {
//	
//	monthbox.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
//}
//public String onemamtintrest() {
//	
//	String str = onemamtintrest.getText();
//	return str;
//}
//public String priamt() {
//	
//	String str = priamt.getText();
//	return str;
//}
//
//public void calc() {
//	
//	calculators.click();
//	homeloan.click(); 
//	homevalue.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1500000");
//	marigin.sendKeys(Keys.chord(Keys.CONTROL,"a"),"10");
//	loaninsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");;
//	intrestrate.sendKeys(Keys.chord(Keys.CONTROL,"a"),"9.5");;
//	loantenure.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
//	loanfees.sendKeys(Keys.chord(Keys.CONTROL,"a"),"0.3");
//	startyear.click();
//	boxmonth.click();
//	onetimeexpense.sendKeys(Keys.chord(Keys.CONTROL,"a"),"20");
//	propertytax.sendKeys(Keys.chord(Keys.CONTROL,"a"),"0.3");
//	homeinsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"),"0.1");
//	maintenance.sendKeys(Keys.chord(Keys.CONTROL,"a"),"3000");
//	table.click();
//	
//}
//
//public String table() throws IOException {
//	
//	String str = table.getText();
//	return str;
//}
//
//public void loancalc() {
//	
//
//	//j.executeScript("arguments[0].scrollIntoView();", emiCalculators);
//	//j.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	calculators.click();
//	loancalc.click();
//	emicalc.click();
//	
//	if(emi_s1.isEnabled()) {
//		System.out.println("Enabled 1");
//	}
//	
//	if(emi_sl1.isEnabled()) {
//		System.out.println("slide Enabled 1");
//	}
//	
//	if(emi_s2.isEnabled()) {
//		System.out.println("Enabled 2");
//	}
//	if(emi_sl2.isEnabled()) {
//		System.out.println("slide Enabled 2");
//	}
//	
//	if(emi_s3.isEnabled()) {
//		System.out.println("Enabled 3");
//	}
//	if(emi_sl3.isEnabled()) {
//		System.out.println("slide Enabled 3");
//	}
//	if(emi_s4.isEnabled()) {
//		System.out.println("Enabled 4");
//	}
//	if(emi_sl4.isEnabled()) {
//		System.out.println("slide Enabled 4");
//	}
//	
//	loanamountcalc.click();
//	
//	if(loanamt_s1.isEnabled()) {
//		System.out.println("Enabled 5");
//	}
//	
//	if(loanamt_sl1.isEnabled()) {
//		System.out.println("Slide Enabled 5");
//	}
//	
//	if(loanamt_s2.isEnabled()) {
//		System.out.println("Enabled 6");
//	}
//	
//	if(loanamt_sl2.isEnabled()) {
//		System.out.println("Slide Enabled 6");
//	}
//	
//	if(loanamt_s3.isEnabled()) {
//		System.out.println("Enabled 7");
//	}
//	
//	if(loanamt_sl3.isEnabled()) {
//		System.out.println("Slide Enabled 7");
//	}
//	
//	if(loanamt_s4.isEnabled()) {
//		System.out.println("Enabled 8");
//	}
//	
//	if(loanamt_sl4.isEnabled()) {
//		System.out.println("Slide Enabled 8");
//	}
//	loantcalc.click();
//	
//	if(loant_s1.isEnabled()) {
//		System.out.println("Enabled 9");
//	}
//	
//	if(loant_sl1.isEnabled()) {
//		System.out.println("Slide Enabled 9");
//	}
//	
//	if(loant_s2.isEnabled()) {
//		System.out.println("Enabled 10");
//	}
//	
//	if(loant_sl2.isEnabled()) {
//		System.out.println("Slide Enabled 10");
//	}
//	
//	if(loant_s3.isEnabled()) {
//		System.out.println("Enabled 11");
//	}
//	
//	if(loant_sl3.isEnabled()) {
//		System.out.println("Slide Enabled 11");
//	}
//	
//	if(loant_s4.isEnabled()) {
//		System.out.println("Enabled 12");
//	}
//	
//	if(loant_sl4.isEnabled()) {
//		System.out.println("Slide Enabled 12");
//	}}
//	
//	public void validation_1() {
//		
//		emi_calculator.click();
//		
//	}
//	public String scalechange() {
//		
//		String str = scalechange.getText();
//		return str;
//	}
//     public void validation1() {
//		
//		monthforscale.click();
//		
//		
//	}
//     public String scalechange1() {
// 		
// 		String str = scalechange_m.getText();
// 		return str;
// 	}
//     public void validation_2() {
// 		
// 		loanamountcalc.click();
// 		
// 	}
//     public String scalechange2() {
//  		
//  		String str = scalechange_m.getText();
//  		return str;
//  	}
//     public void validation2() {
//  		
//  		yearforscale.click();
//  		
//  	}
//     public String scalechange_2() {
// 		
// 		String str = scalechange.getText();
// 		return str;
// 	}
//     public  void storingExceldatas() throws IOException, InterruptedException  {
//		 //Writes only the rows in the  table
//		 utility_file.write("Sheet1", 0, 0,"Year");
//		 utility_file.write("Sheet1", 0, 1,"Principal");
//		 utility_file.write("Sheet1", 0, 2,"Interest");
//		 utility_file.write("Sheet1", 0, 3,"Taxes, Home Insurance & Maintenance (C)");
//		 utility_file.write("Sheet1", 0, 4,"Total Payment ");
//		 utility_file.write("Sheet1", 0, 5,"Balance");
//		 utility_file.write("Sheet1", 0, 6,"Loan Paid To Date");
//		 
//		 Thread.sleep(10000);
//		 
//		 int sizeOfrows=rowsize.size();
//		 for( int r=2,p=1;r<=sizeOfrows;r=r+2,p++) {
//			String Year= table.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
//			String Principal= table.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
//			String Interest= table.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
//			String Taxes= table.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
//			String Total_Payment= table.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
//			String Balance= table.findElement(By.xpath("tr["+r+"]/td[6]")).getText();
//			String Loan=table.findElement(By.xpath("tr["+r+"]/td[7]")).getText();
//			
//			 utility_file.write("Sheet1",p , 0,Year );
//			 utility_file.write("Sheet1",p , 1,Principal );
//			 utility_file.write("Sheet1",p , 2,Interest );
//			 utility_file.write("Sheet1",p , 3,Taxes );
//			 utility_file.write("Sheet1",p , 4,Total_Payment );
//			 utility_file.write("Sheet1",p , 5,Balance );
//			 utility_file.write("Sheet1",p , 6,Loan);
//		 }
//
//	 }
//     
//     
//     
//}
//	
//	
//	
//	
//	
//	
//	
//
//
//
//
//
////*[@id='menu-item-dropdown-2696']
////*[@id='menu-item-2423']/a
////*[@id='emi-calc']/a[1]
//
//
//
//
//
//
//
//
//
//
//
