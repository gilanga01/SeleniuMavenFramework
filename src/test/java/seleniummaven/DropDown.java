package seleniummaven;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://trytestingthis.netlify.app/");
       WebElement dropdown = driver.findElement(By.id("option"));
       Select selectObject = new Select(dropdown);
       selectObject.selectByIndex(1);
       Thread.sleep(2000);
       selectObject.deselectByValue("option 2");
       Thread.sleep(2000);
       selectObject.deselectByVisibleText("Option 3");
       Thread.sleep(2000);
      
	/*WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.elementToBeClickable(By.id(""))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.id(""))).click();
       */
       
       driver.quit();
       System.out.println("done");
      
        
	}

}
