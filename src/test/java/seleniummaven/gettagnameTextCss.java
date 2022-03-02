package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettagnameTextCss {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        
        // get tagname, text, css etc
       
        driver.get("http://www.google.com/");
       WebElement searchBox = driver.findElement(By.name("q"));
      String cssValue = searchBox.getCssValue("color");
      String tagname = searchBox.getTagName();
      String text =  searchBox.getText();
      System.out.println(cssValue+" | "+text+" | "+tagname);
       
       Thread.sleep(2000);
       driver.quit();
       
	}

}
