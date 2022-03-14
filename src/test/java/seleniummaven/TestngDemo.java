package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDemo {

	static WebDriver driver = null;
	@BeforeTest
	public static void setUpTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public  void login() throws InterruptedException {
		driver.get("https://www.facebook.com/login.php");

		WebElement unm = driver.findElement(By.id("email"));
		unm.sendKeys("072305698");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("33290450");
		Thread.sleep(2000);

		pass.submit();
	}
    @AfterTest
	public void tearDownTest() {
		System.out.println("Logged in Successfully.......");
		driver.close();
		driver.quit();
	}
}


