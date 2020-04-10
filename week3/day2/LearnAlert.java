package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		String Alert1 = driver.switchTo().alert().getText();
		System.out.println("Simple Alert says "+Alert1);
		driver.switchTo().alert().accept();
		
		driver.close();
		

	}

}
