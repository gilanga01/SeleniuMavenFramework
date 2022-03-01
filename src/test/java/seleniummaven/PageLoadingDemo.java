package seleniummaven;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver(options);
	       driver.get("http://www.google.com/");
	       driver.quit();
	}

}
