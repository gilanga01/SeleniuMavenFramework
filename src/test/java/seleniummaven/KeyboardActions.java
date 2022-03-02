package seleniummaven;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        //sendKeys()
        
      /*  driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium" +Keys.ENTER);
        
        Thread.sleep(2000);
        driver.quit();*/
        
        //Key down
        /*driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium" +Keys.ENTER);
        Actions actionProvider = new Actions(driver);
       Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
       keydown.perform();*/
        
        //keyUp()
        driver.get("http://www.google.com/");
        Actions action = new Actions(driver);
        WebElement searchBox = driver.findElement(By.name("q"));
        action.keyDown(Keys.SHIFT).sendKeys(searchBox,"selenium")
        
        .keyUp(Keys.SHIFT).sendKeys(" selenium").perform();
        Thread.sleep(2000);
        searchBox.clear();
        
        Thread.sleep(2000);
       driver.quit();
	}

}
