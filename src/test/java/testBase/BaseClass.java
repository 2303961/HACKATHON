package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Locale;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.EmiCalculation;
import pageObjects.BasePage;
import pageObjects.CarLoan;
import pageObjects.HomeLoan;

public class BaseClass  {
	public static WebDriver driver;
	public static Logger logger;
	public static Properties P;
	
	
	
//	public CarLoan bp;
//	public HomeLoan hl;
//	public EmiCalculation ui; 
	@BeforeClass
	@Parameters({"os","browser"})
  public void openbrowser(String os, String br) throws IOException {
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		P = new Properties();
		P.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		
		if(P.getProperty("execution_env").equalsIgnoreCase("remote")) {
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			if(os.equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac")) {
				capabilities.setPlatform(Platform.MAC);
			}
			else {
				System.out.println("No Matching os");
			}
			switch(br.toLowerCase()) {
			case  "chrome":
				capabilities.setBrowserName("chrome");
				break;
			case  "edge":
				capabilities.setBrowserName("MicrosoftEdge");
				break;
			default:
				System.out.println("No matching browser");
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		}
		else if (P.getProperty("execution_env").equalsIgnoreCase("local")) {
			switch(br.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("No Matching Browser");
				return;
			}
		}
		driver.get(P.getProperty("appURL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			   
  }
 
 @AfterClass
 public void closebrowser() {
	  driver.quit();
 }
 
 public String captureScreen(String name) {
	   
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + name + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	    }
	}

