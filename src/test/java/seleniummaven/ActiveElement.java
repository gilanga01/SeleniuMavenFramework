package seleniummaven;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        
        //find active element
       
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        String title = driver.switchTo().activeElement().getAttribute("title");
        System.out.println(title);
        Thread.sleep(1000);
        driver.quit();
        
	}

}
