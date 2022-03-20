package seleniummaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {
	ExtentSparkReporter html;
	ExtentReports extent;
    WebDriver driver;
    

	@BeforeSuite
	public void setUp() {
		
		
		html = new ExtentSparkReporter("ExtentReports.html");
		extent = new ExtentReports();
		extent.attachReporter(html);

	}
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		
	}
	@Test
	public void test() {

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        driver.get("https://www.google.com/");
        test.pass("Navigated to the google.com");
        

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

	

	}
	@Test
	public void test2() {

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
		

	}
	@AfterTest
	public void tearDownTest() {
		//close the browser
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
	@AfterSuite
	public void tearDown() {

		 // calling flush writes everything to the log file
        extent.flush();
	}
}
