package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class form {

	public static void main(String[] args) throws InterruptedException {
//System.setProperty("webdriver.Firefox.driver", "C:\\Users\\glanga01\\Desktop\\Selenium\\Drivers\\chromedriver.exe"); 
		
		//WebDriver driver = new FirefoxDriver();
		
         WebDriverManager.firefoxdriver().setup();
         WebDriver driver = new FirefoxDriver();
		driver.get("https://workspace.safaricom.co.ke/customer_obsession/");
		driver.manage().window().maximize();
		

		//to maximize the browser  
//		
		
		//Thread.sleep(1000);
		
		
		WebElement unm = driver.findElement(By.id("name"));
		unm.sendKeys("test");
		
		WebElement pwd = driver.findElement(By.id("email"));
		pwd.sendKeys("test@gmail.com");
		//Thread.sleep(3000);
		
		Select dropdown = new Select(driver.findElement(By.className("input-group-addon")));  
		dropdown.selectByVisibleText("TEMP");  
		//Thread.sleep(3000);
		
		WebElement stid = driver.findElement(By.id("form_name"));
		stid.sendKeys("243553");
		//Thread.sleep(3000);
	
		Select dropdown2 = new Select(driver.findElement(By.id("division")));  
		dropdown2.selectByVisibleText("Resources"); 
		Thread.sleep(3000);
		
		WebElement textarea = driver.findElement(By.name("message"));
		textarea.click();
	    textarea.sendKeys(Keys.TAB);
	    textarea.sendKeys("test data");
	    Thread.sleep(3000);
		
	    WebElement linktext = driver.findElement(By.id("terms"));
	    linktext.click(); 
	    Thread.sleep(3000);
	    
	    WebElement checkbox = driver.findElement(By.className("btn main-btn"));
	    checkbox.click();
	    Thread.sleep(4000);
	    driver.close();
	    driver.quit();
	    
	    //driver.navigate().refresh();
	    //Thread.sleep(4000);
	    
	  
	    
	   
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
		//Thread.sleep(3000);
		 
		 
		 
		 //driver.findElement(By.linkText("Employee Data Privacy Statement.")).click();
		 //driver.navigate().back();
		 
		 //driver.findElement(By.linkText("Accept Terms And Conditions ")).click();
		 //driver.navigate().back();
		 
		//js.executeScript("window.scrollBy(0,300)", "");
		    
	}

}
