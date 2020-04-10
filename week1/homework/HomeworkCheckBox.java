package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkCheckBox {
			
		//Launch browser and URL
			public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/checkbox.html");
			
		//Select any of the two checkboxes
			driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input").click();
			driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div[3]/input").click();
			
		//Verify the checkbox is selected	
			if (driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/input").isSelected())
			{
				System.out.println("Selenium is checked by default");
			} 
			
		//Deselect the checkbox if selected
			boolean notSelect = driver.findElementByXPath("(//input[@type='checkbox'])[7]").isSelected();
			if (notSelect==true)
				driver.findElementByXPath("(//input[@type='checkbox'])[7]").click();
			
			boolean Selected = driver.findElementByXPath("(//input[@type='checkbox'])[8]").isSelected();
			if (Selected==true)
				driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
				
		// select all the checkboxes
				boolean option1 = driver.findElementByXPath("(//input[@type='checkbox'])[9]").isSelected();
				if (option1==false)
					driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
				
				boolean option2 = driver.findElementByXPath("(//input[@type='checkbox'])[10]").isSelected();
				if (option2==false)
					driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
				
				boolean option3 = driver.findElementByXPath("(//input[@type='checkbox'])[11]").isSelected();
				if (option3==false)
					driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
				
				boolean option4 = driver.findElementByXPath("(//input[@type='checkbox'])[12]").isSelected();
				if (option4==false)
					driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
				
				boolean option5 = driver.findElementByXPath("(//input[@type='checkbox'])[13]").isSelected();
				if (option5==false)
					driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
		
	}

}

/* This is working as expected */