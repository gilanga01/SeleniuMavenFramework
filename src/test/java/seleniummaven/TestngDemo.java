package seleniummaven;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDemo {

	static WebDriver driver = null;
	@BeforeTest
	public static void setUpTest(){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();}
	

	@Test
	public  void EnterEmail(){
		driver.get("https://www.facebook.com/login.php");
		WebElement unm = driver.findElement(By.id("email"));
		unm.sendKeys("0723056984");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("33290450");
		}
	
	@Test
	public  void Submit() {
		WebElement submit = driver.findElement(By.id("loginbutton"));
		submit.click();
		}
	
	
    @AfterTest
	public void tearDownTest(){
		System.out.println("Logged in Successfully================");
		driver.close();
	    driver.quit();
	}
}


