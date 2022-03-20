package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		// path where output is to be printed
		ExtentSparkReporter html = new ExtentSparkReporter("ExtentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test1 = extent.createTest("Google Search Test one ","this is a test to validate google search");
		WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //find element demo
        
        
        
        test1.log(Status.INFO, "Starting Test case");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        test1.pass("Navigated to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
        test1.pass("Entered text to Searchbox");
        
        
        //driver.findElement(By.name("btnk")).click();
        //test1.pass("Pressed keyboard enter key");
        
        
        driver.close();
        driver.quit();
        test1.pass("Closed the browser");
        
        test1.info("Test completed");
        
ExtentTest test2 = extent.createTest("Google Search Test two ","this is a test to validate google search");
	
        test2.log(Status.INFO, "Starting Test case");
        driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        test2.pass("Navigated to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
        test2.pass("Entered text to Searchbox");
        
        
        //driver.findElement(By.name("btnk")).click();
        //test1.pass("Pressed keyboard enter key");
        
        
        driver.close();
        driver.quit();
        test1.pass("Closed the browser");
        
        test2.info("Test completed");
        
        
        //calling flush writes everything to the log file
        extent.flush();	
		
	}
	}
		

