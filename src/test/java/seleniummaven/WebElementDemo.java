package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //find element demo
        
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
        
        //driver.findElement(By.name("btnk")).click();
        Thread.sleep(2000);
        driver.quit();
	}

}
