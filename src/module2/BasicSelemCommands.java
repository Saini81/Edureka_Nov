package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelemCommands {
	
	//Single Line Comment
	/*
	 * Multi Line Comment
	 */

	public static void main(String[] args) {
		//Initialize / Instantiate / Open Browser
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Training\\Programs\\Project\\Installation stuff\\Driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();// driver is called local variable that you create to use in your code instead of repeating the ChromeDriver. 
		
		
		//Close and Quit
		driver.close();//this will close the current active window of the browser with in this instance
		driver.quit();//this will close all the Window opened during this instance
		
		//Get Commands
		driver.get("https://www.edureka.con");//to open URL of the AUT
		driver.getTitle();//to Fetch the title of the page and use it either for validation
		driver.getCurrentUrl();//to fetch current URL of the AUT
		
		//Navigation Commands
		//move to next page
		driver.navigate().forward();
		//move to previous page
		driver.navigate().back();
		//page refresh
		driver.navigate().refresh();
		
		//Element Handling
		//Click
		driver.findElement(By.id("")).click();
		//Type Commands
		driver.findElement(By.id("")).sendKeys("Sonia");
		//Clear Commands
		driver.findElement(By.id("")).clear();
	}

}
