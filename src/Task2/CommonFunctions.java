package Task2;

import org.openqa.selenium.chrome.ChromeDriver;


public class CommonFunctions {
	public static ChromeDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	}
	

}
