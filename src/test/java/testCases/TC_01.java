package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.CarLoan;
import pageObjects.EmiCalculation;
import pageObjects.HomeLoan;
import testBase.BaseClass;

public class TC_01 extends BaseClass{
    //WebDriver driver;
	public CarLoan bp,c2;
	
	public HomeLoan hl,h2;
	public EmiCalculation ui,ui2,ui3;  
	
	@Test(priority = 1)
	@Parameters({"browser"})
	 public void carloan(String br) throws InterruptedException, IOException    {
		 bp = new CarLoan(driver);
		 try {
			 logger.info("********************Starting TC_01************************");
			 bp.carloan();
			 
			 bp.enteramt();
			 
			 bp.enterint();
			 
			 
		 }
		 catch (Exception e) {
		 }
	 }
	
	@Test(priority = 2)
	@Parameters({"browser"})
	public void carloan2(String br) throws InterruptedException, IOException{
		c2 = new CarLoan(driver);
		try {
			logger.info("********************ENTER TENURE YEAR************************");
			bp.entertu();
			 
			 bp.escheme();
			 
			 bp.pa();
			 logger.info("********************ENTER TENURE MONTH************************");
			 bp.month();
			 
			 bp.monthbox();
			 
			 //bp.clickoneyamt();
			 
			 System.out.println("₹" + bp.oneyamt());
			 bp.escheme();
			 logger.info("********************PRINT ONE MONTH INTREST AMOUNT ************************");
			 System.out.println("₹"+bp.onemamtintrest());
			 logger.info("********************PRINT ONE MONTH PRINCIPLE AMOUNT************************");
			 int y=Integer.parseInt(bp.priamt().replaceAll(",",""))-Integer.parseInt(bp.onemamtintrest().replaceAll(",",""));
			 System.out.println("₹"+y);
			
		}
		catch(Exception e) {
			
		}
	}

	 
		@Test(priority = 3)
		@Parameters({"browser"})
		public void homeloan(String br) throws InterruptedException, IOException  {
			hl = new HomeLoan(driver);
			
	     	try {
	     		logger.info("********************STARTED HOMELOAN PAGE************************");
			 hl.calc();
			 
			 System.out.println(hl.table());
			 
			
	     	}
	     	catch (Exception e) {
	     		
	     	}
		}
		@Test(priority = 4)
	    @Parameters({"browser"})
		public void homeloan2(String br) throws InterruptedException, IOException{
			h2=new HomeLoan(driver);
			try {
				logger.info("********************STORING HOMELOAN TABLE INTO AN EXCEL************************");
				 h2.storingExceldatas();
			}
			catch(Exception e) {
				
			}
		}
		
	    @Test(priority = 5)
	    @Parameters({"browser"})
		public void UIcheck(String br) throws InterruptedException, IOException  {
			
	    	ui = new EmiCalculation(driver);
			
		try {
			logger.info("********************ENTER INTO A EMI LOAN PAGE************************");
			 
			 ui.loancalc();
			 logger.info("********************VALIDATING ALL SEARCHBOX AND SLIDERS************************");
			 ui.validation_1();
			 
			 System.out.println( ui.scalechange());
			 
			 ui.validation1();
			 
			 System.out.println(ui.scalechange1());
		 }
		 catch (Exception a) {
			 
		 }
	    }
		
		@Test(priority = 6)
	    @Parameters({"browser"})
		public void UIcheck2 (String br) throws InterruptedException  {
			
	    	ui2 = new EmiCalculation(driver);
			
		try {
			 ui2.validation_2();
			 
			 System.out.println(ui2.scalechange2());
			 
			 ui2.validation2();
			 
			 System.out.println(ui2.scalechange_2());
			
		 }
		 catch (Exception a) {
			 
		 }
		} 
		@Test(priority = 7)
	    @Parameters({"browser"})
		public void UIcheck3 (String br) throws InterruptedException  {
			
	    	ui3 = new EmiCalculation(driver);
			
		try {
			 
			 if(ui3.scalechange().equalsIgnoreCase(ui3.scalechange1())) {
				 System.out.println("slider validation 1 failed");
			 }
			 else {
				 System.out.println("Slider validation 1 successful");
			 }
			 
			 
			 if(ui3.scalechange2().equalsIgnoreCase(ui3.scalechange_2())) {
				 System.out.println("slider validation 2 failed");
			 }
			 else {
				 System.out.println("Slider validation 2 successful");
			 } 
			 
			
			 
			
		 }
		 catch (Exception a) {
			 
		 }
		} 
		 
}	
	 
	    

