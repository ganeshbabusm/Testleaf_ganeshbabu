package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkButton {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser and load URL
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Button.html");
			driver.manage().window().maximize();
		
		//Perform actions - Go to Home Page
			driver.findElementById("home").click();
			Thread.sleep(3000);
			
		//Click Button in the Home Page to continue rest of activities
			driver.findElementByXPath("//h5[text()='Button']").click();
		
		//Find Position of button
			System.out.println("Location of Get Position button is "+driver.findElementById("position").getLocation());
		
		//Find background color of button
			System.out.println("Background color of button is "+driver.findElementById("color").getCssValue("background-color"));
		
		//Find Size of button
			System.out.println("Height and Width of button is "+driver.findElementById("size").getSize());
		
		//driver.close();

	}

}
/* This works as expected */