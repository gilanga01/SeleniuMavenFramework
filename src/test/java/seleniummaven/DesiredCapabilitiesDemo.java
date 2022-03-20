package seleniummaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", "true");
		WebDriverManager.iedriver().setup();;
        WebDriver driver = new InternetExplorerDriver(caps);
        driver.get("https://www.google.com/");
        driver.findElement(By.id("q")).sendKeys("ABCD");
        driver.findElement(By.id("btnk")).sendKeys(Keys.RETURN);
        
        driver.close();
        driver.quit();
	}

}
