package week1.homework;


import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkRadio {

	//Launch browser and load URL
			public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/radio.html");
	
	//Select one of the radio button
			driver.findElementById("yes").click();
	
	//Verify the default selection in the web page	
			//if (driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]").isSelected())
			if (driver.findElementByXPath("(//label[@for='java']/following::input)[3]").isSelected())
			{
				System.out.println("Unchecked is default selection");
			} else 
				System.out.println("Checked is the default selection");
	
	//Verify the default selection in the web page	for age
			if (driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div").isSelected()) 
			{
				System.out.println("Selected age group is 1 - 20 years");
			} 
			else if (driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]").isSelected())
			{
				System.out.println("Selected age group is 21 - 40 years");
			} 
			else if (driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]").isSelected()) 
			{
				System.out.println("Selected age group is Above 40 years");
			} 
			else driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div").click();
			}
		
}
/* This is working as expected */