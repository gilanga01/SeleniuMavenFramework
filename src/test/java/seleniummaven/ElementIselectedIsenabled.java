package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIselectedIsenabled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        
        //find active element
       
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("/html//form[@id='checkboxes']"));
       System.out.println(checkbox.isEnabled());
       System.out.println(checkbox.isSelected());
       driver.quit();
	}

}
