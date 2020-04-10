package week3.day1;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser and URL
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/pages/selectable.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				WebElement First = driver.findElementByXPath("(//ol[@id='selectable']/li)[1]");
				WebElement Fourth = driver.findElementByXPath("(//ol[@id='selectable']/li)[4]");
				
				Actions builder = new Actions(driver);
		//builder.keyDown(Keys.CONTROL).click(First).click(Second).perform();
			builder.clickAndHold(First).release(Fourth).perform();
				Thread.sleep(5000);
		//driver.close();

	}

}
