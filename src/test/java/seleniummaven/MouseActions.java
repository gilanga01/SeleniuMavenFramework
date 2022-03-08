package seleniummaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        //WebElement boxA = driver.findElement(By.xpath("//ul[@id='sortable']/li[@name='A']"));
        //WebElement boxD = driver.findElement(By.xpath("//ul[@id='sortable']/li[@name='D']"));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(boxA);
        //actions.clickAndHold();
        //actions.moveToElement(boxD);
        //actions.doubleClick(boxD);
        //actions.contextClick(boxD);
       
        
        //drag and drop
        //Actions actions = new Actions(driver);
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement elmenent1 = driver.findElement(By.id("draggable"));
        WebElement elmenent2 = driver.findElement(By.id("droppable"));
        
        Actions actions = new Actions(driver);
        actions.dragAndDrop(elmenent1, elmenent2);
        
        actions.build().perform();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Done");
        
        
	}

}
