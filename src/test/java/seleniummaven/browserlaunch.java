package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class browserlaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\glanga01\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
	     driver.get("https://www.facebook.com/login.php");
	     
	     WebElement unm = driver.findElement(By.id("email"));
	     unm.sendKeys("072305698");
	     WebElement pass = driver.findElement(By.id("pass"));
	     pass.sendKeys("33290450");
	     Thread.sleep(2000);

	     pass.submit();
	     System.out.println("Logged in Successfully.......");
	     driver.quit();
	}

}
